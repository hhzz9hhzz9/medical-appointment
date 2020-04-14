package com.woniu.controller;

import com.woniu.pojo.*;
import com.woniu.service.IDoctorService;
import com.woniu.service.IMedicalService;
import com.woniu.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 病例模块
 * */
@Controller
@RequestMapping("medical")
@ResponseBody
public class MedicalController {
    @Autowired
    private IMedicalService iMedicalService;
    @Autowired
    private IDoctorService iDoctorService;
    @Autowired
    private IPatientService iPatientService;


    /**
     * 病例模块方法*/
    /*查全部病例信息，分页模糊查询处理(选择时间精确到天，患者姓名)，按时间升序排列病例,默认显示当天病例*/
    @PostMapping("list")
    public ResultVO findAllBypage(@RequestBody PageBean<Medical> pageBean){
        System.out.println(pageBean);
        ResultVO resultVO = null;
        List<Medical> list = null;
        try {
            if(pageBean.getSomeday() == null){
            //默认查询条件：取当前时间，精确到天
            String date =  new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            pageBean.setSomeday(date);
            }
            //分页初始信息处理
            if(pageBean.getNowPage() == null || pageBean.getNowPage() <= 0){
                pageBean.setNowPage(1);
            }
            //查询模糊处理后的病例总条目目数
            int count = iMedicalService.countByPageBean(pageBean);
            pageBean.setCountRow(count);
            //分页跳转末页信息处理
            int countPage = pageBean.getCountRow() % pageBean.getPageRow()==0 ? pageBean.getCountRow() / pageBean.getPageRow():pageBean.getCountRow() / pageBean.getPageRow()+1;
            if(pageBean.getNowPage()> count && count != 0){
                pageBean.setNowPage(countPage);
            }
            pageBean.setCountPage(countPage);
            //查询模糊，分页处理后的病例
            list = iMedicalService.findAllByPageBean(pageBean);
            if (list == null || count == 0){
                resultVO = new ResultVO(200,"没有满足查询信息的病例",pageBean);
            }else {
                pageBean.setList(list);
                resultVO = new ResultVO(200, "查询成功", pageBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultVO =new ResultVO(500,"查询失败",pageBean);
        }
        return resultVO;
    }


    /*新增病例所需信息*/
    @GetMapping("addInit")
    public ResultVO addInit(){
        ResultVO resultVO = null;
        try {
            /*获取所有医生信息*/
            List<Doctor> doctorList = iDoctorService.findAll();
            /*获取所有患者信息*/
            List<Patient> patientList = iPatientService.findAll();
            //封装信息
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("doctorList",doctorList);
            map.put("patientList",patientList);
            resultVO =new ResultVO(200,"页面初始化信息查询成功",map);
        } catch (Exception e) {
            e.printStackTrace();
            resultVO =new ResultVO(500,"页面初始化信息查询失败");
        }
        return resultVO;
    }

    /*新增病例信息，时间由系统生成*/
    @PostMapping
    public ResultVO save(@RequestBody Medical medical){
        ResultVO resultVO = null;
        try {
            /*获取当前时间作为病例添加时间*/
            medical.setMedicalTime(new Date());
            iMedicalService.save(medical);
            resultVO =new ResultVO(200,"添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            resultVO =new ResultVO(500,"添加失败");
        }
        return resultVO;
    }


    /*修改病例所需信息*/
    @PostMapping("updateInit")
    public ResultVO updateInit(@RequestBody Map<String,Object> map){
        ResultVO resultVO = null;
        Integer id = (Integer) map.get("id");
        try {
            /*获取当前需修改病例信息*/
            Medical medical = iMedicalService.findOne(id);
            /*获取所有医生信息*/
            List<Doctor> doctorList = iDoctorService.findAll();
            /*获取所有患者信息*/
            List<Patient> patientList = iPatientService.findAll();
            //封装信息
            Map<String,Object> resultMap = new HashMap<String,Object>();
            resultMap.put("doctorList",doctorList);
            resultMap.put("patientList",patientList);
            resultMap.put("medical",medical);
            resultVO =new ResultVO(200,"页面初始化信息查询成功",resultMap);
        } catch (Exception e) {
            e.printStackTrace();
            resultVO =new ResultVO(500,"页面初始化信息查询失败");
        }
        return resultVO;
    }

    /*修改病例*/
    @PutMapping
    public ResultVO update(@RequestBody Medical medical){
        System.out.println(medical);
        ResultVO resultVO = null;
        try {
            iMedicalService.update(medical);
            resultVO =new ResultVO(200,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            resultVO =new ResultVO(500,"修改失败");
        }
        return resultVO;
    }


    /*删除病例，*/
    @DeleteMapping("del")
    public ResultVO delete(@RequestBody Map<String,Object> data){
        ResultVO resultVO = null;
        Integer id = (Integer) data.get("id");
        try {
            iMedicalService.delete(id);
            resultVO =new ResultVO(200,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            resultVO =new ResultVO(500,"删除失败");
        }
        return resultVO;
    }

    /*批量删除*/
    @PostMapping("dels")
    public ResultVO deletes(@RequestBody Map<String,Object> map){
        ResultVO resultVO = null;
        //获取id数组字符串并去掉【】
        String s = map.get("data").toString().replace("[","").replace("]","");
        //将字符串以&隔开转为数组
        String[]  idStrs= s.split("&");
        //将字符数组转为整数数组
        Integer[] ids = new Integer[idStrs.length];
        for (int i=0;i<idStrs.length;i++) {
            ids[i] = Integer.parseInt(idStrs[i].substring(idStrs[i].indexOf("=")+1,idStrs[i].length()));
        }

        try {
            iMedicalService.deletes(ids);
            resultVO =new ResultVO(200,"批量删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            resultVO =new ResultVO(500,"批量删除失败");
        }
        return resultVO;
    }


    /*周病例信息展示，模糊查询及分页处理(查询条件为某年某周，默认显示本周信息)*/
    @GetMapping("thisWeek")
    public ResultVO thisWeek(@RequestBody PageBean<Medical> pageBean){
        ResultVO resultVO = null;
        List<Medical> list = null;
        try {

            //分页初始信息处理
            if(pageBean.getNowPage() == null || pageBean.getNowPage() <= 0){
                pageBean.setNowPage(1);
            }
            //查询模糊处理后的周病例总条目数
            int count = iMedicalService.countByTheWeek(pageBean);
            pageBean.setCountRow(count);
            //分页跳转末页信息处理
            int countPage = pageBean.getCountRow() % pageBean.getPageRow()==0 ? pageBean.getCountRow() / pageBean.getPageRow():pageBean.getCountRow() / pageBean.getPageRow()+1;
            if(pageBean.getNowPage()> count && count != 0){
                pageBean.setNowPage(countPage);
            }
            pageBean.setCountPage(countPage);
            //查询模糊，分页处理后的周病例
            list = iMedicalService.findAllByTheWeek(pageBean);

            if (list == null || count == 0){
                resultVO = new ResultVO(200,"没有满足查询信息的病例",pageBean);
            }else {
                pageBean.setList(list);
                resultVO = new ResultVO(200, "查询成功", pageBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultVO =new ResultVO(500,"查询失败",pageBean);
        }
        return resultVO;
    }


    /*月病例信息展示，模糊查询及分页处理*/
    @GetMapping("theMonth")
    public ResultVO theMonth(@RequestBody PageBean<Medical> pageBean){
        ResultVO resultVO = null;
        List<Medical> list = null;
        try {

            //分页初始信息处理
            if(pageBean.getNowPage() == null || pageBean.getNowPage() <= 0){
                pageBean.setNowPage(1);
            }
            //查询模糊处理后的月病例总条目数
            int count = iMedicalService.countByTheMonth(pageBean);
            pageBean.setCountRow(count);
            //分页跳转末页信息处理
            int countPage = pageBean.getCountRow() % pageBean.getPageRow()==0 ? pageBean.getCountRow() / pageBean.getPageRow():pageBean.getCountRow() / pageBean.getPageRow()+1;
            if(pageBean.getNowPage()> count && count != 0){
                pageBean.setNowPage(countPage);
            }
            pageBean.setCountPage(countPage);
            //查询模糊，分页处理后的月病例
            list = iMedicalService.findAllByTheMonth(pageBean);

            if (list == null || count == 0){
                resultVO = new ResultVO(200,"没有满足查询信息的病例",pageBean);
            }else {
                pageBean.setList(list);
                resultVO = new ResultVO(200, "查询成功", pageBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultVO =new ResultVO(500,"查询失败",pageBean);
        }
        return resultVO;
    }

    /*根据医生查询其相关连病例，选择科室，医生姓名，日期（默认选择本周）;分页模糊处理*/
    @GetMapping("listByDoctorName")
    public ResultVO listByDoctorName(@RequestBody PageBean<Medical> pageBean){
        ResultVO resultVO = null;
        List<Medical> list = null;
        try {

            //分页初始信息处理
            if(pageBean.getNowPage() == null || pageBean.getNowPage() <= 0){
                pageBean.setNowPage(1);
            }
            //根据医生姓名科室查询处理后的病例总条目数
            int count = iMedicalService.countByDoctorName(pageBean);
            pageBean.setCountRow(count);
            //分页跳转末页信息处理
            int countPage = pageBean.getCountRow() % pageBean.getPageRow()==0 ? pageBean.getCountRow() / pageBean.getPageRow():pageBean.getCountRow() / pageBean.getPageRow()+1;
            if(pageBean.getNowPage()> count && count != 0){
                pageBean.setNowPage(countPage);
            }
            pageBean.setCountPage(countPage);
            //根据医生姓名科室查询模糊，分页处理后的病例
            list = iMedicalService.listByDoctorName(pageBean);

            if (list == null || count == 0){
                resultVO = new ResultVO(200,"没有满足查询信息的病例",pageBean);
            }else {
                pageBean.setList(list);
                resultVO = new ResultVO(200, "查询成功", pageBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultVO =new ResultVO(500,"查询失败",pageBean);
        }
        return resultVO;
    }

}
