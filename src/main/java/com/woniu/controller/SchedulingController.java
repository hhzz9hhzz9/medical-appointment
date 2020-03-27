package com.woniu.controller;

import com.woniu.pojo.ResultVO;
import com.woniu.pojo.Scheduling;
import com.woniu.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author machuang
 * @create 2020/03/2020/3/26
 */
@Controller
@RequestMapping("Scheduling")
public class SchedulingController {
    @Autowired
    SchedulingService  schedulingService;
    @RequestMapping("findAll")
    @ResponseBody
    public List findAll(){
    List <Scheduling>list = schedulingService.findAll();
    ResultVO resultVO = null;
     return list;
 }
 //删除那天的那天那个医生上班
    @RequestMapping("delete")
    @ResponseBody
    public ResultVO delete(int id ){
        schedulingService.delete(id);
        ResultVO resultVO = null;
        return null;
    }
    //更新排班的时间表
    @RequestMapping("update")
    @ResponseBody
    public ResultVO update(Scheduling scheduling){
        schedulingService.update(scheduling);
        ResultVO resultVO = null;
         return null;
    }
    //添加排班的时间表
    @RequestMapping("add")
    @ResponseBody
    public ResultVO add(Scheduling scheduling){
        System.out.println(scheduling);
       schedulingService.add(scheduling);
        ResultVO resultVO = null;

        return null;
    }
    //预留排班全部
    @RequestMapping("updateRS")
    @ResponseBody
    public ResultVO updateScheduling(int scheduling_id, int doctor_id){
        schedulingService.updateRS(scheduling_id,doctor_id);
        ResultVO resultVO = null;
        return null;
    }
}
