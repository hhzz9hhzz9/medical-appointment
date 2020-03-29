package com.woniu.controller;

import com.woniu.pojo.Medical;
import com.woniu.pojo.PageBean;
import com.woniu.pojo.ResultVO;
import com.woniu.service.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 病例模块
 * */
@Controller
@RequestMapping("medical")
@ResponseBody
public class MedicalController {
    @Autowired
    private IMedicalService iMedicalService;
    /**
     * 页面跳转*/

    /**
     * 病例模块方法*/
    /*查全部病例信息，分页模糊查询处理(时间，患者姓名)*/
    @GetMapping
    public ResultVO findAllBypage(PageBean<Medical> pageBean){
        ResultVO resultVO = null;
        List<Medical> list = null;
        try {
            //分页初始信息处理
            if(pageBean.getNowPage() == null || pageBean.getNowPage() <= 0){
                pageBean.setNowPage(1);
            }
            //查询模糊处理后的病例总条目目数
            int count = iMedicalService.countByPageBean(pageBean);
            pageBean.setCountRow(count);
            //分页跳转末页信息处理
            int countPage = pageBean.getCountRow() % pageBean.getPageRow()==0 ? pageBean.getCountRow() / pageBean.getPageRow():pageBean.getCountRow() / pageBean.getPageRow()+1;
            if(pageBean.getNowPage()> count){
                pageBean.setNowPage(countPage);
            }
            pageBean.setCountPage(countPage);
            //查询模糊，分页处理后的病例
            list = iMedicalService.findAllBypage(pageBean);

            if (list == null || count == 0){
                resultVO = new ResultVO(200,"没有满足查询信息的病例",list,pageBean);
            }
            resultVO =new ResultVO(200,"查询成功",list,pageBean);
        } catch (Exception e) {
            e.printStackTrace();
            resultVO =new ResultVO(500,"查询失败",list,pageBean);
        }
        return resultVO;
    }

    /*新增病例信息*/
    @PostMapping
    public ResultVO save(@RequestBody Medical medical){
        ResultVO resultVO = null;
        try {
            iMedicalService.save(medical);
            resultVO =new ResultVO(200,"添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            resultVO =new ResultVO(500,"添加失败");
        }
        return resultVO;
    }

    /*删除病例，*/
    @DeleteMapping
    public ResultVO delete(@PathVariable Integer id){
        ResultVO resultVO = null;
        try {
            iMedicalService.delete(id);
            resultVO =new ResultVO(200,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            resultVO =new ResultVO(500,"删除失败");
        }
        return resultVO;
    }

    /*修改病例*/
    @PutMapping
    public ResultVO update(@RequestBody Medical medical){
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

    /*批量删除*/
    @DeleteMapping
    public ResultVO delete(@PathVariable Integer[] ids){
        ResultVO resultVO = null;
        try {
            iMedicalService.deletes(ids);
            resultVO =new ResultVO(200,"批量删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            resultVO =new ResultVO(500,"批量删除失败");
        }
        return resultVO;
    }
    /*周病例信息展示，模糊查询及分页处理*/
    /*月病例信息展示，模糊查询及分页处理*/
}
