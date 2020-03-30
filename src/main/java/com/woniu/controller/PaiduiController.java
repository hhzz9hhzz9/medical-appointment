package com.woniu.controller;

import com.woniu.pojo.Paidui;
import com.woniu.pojo.ResultVO;
import com.woniu.service.IPaiduiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author jad
 * @creat 2020/03/2020/3/26 17:57:33
 */
@RestController
@RequestMapping("paidui")
public class PaiduiController {
    @Autowired
    private IPaiduiService paiduiService;
    @ResponseBody
    @PostMapping
    public ResultVO addpaidui(@RequestBody Paidui paidui){
        ResultVO resultVO = null;
        try {
            paiduiService.insert(paidui);
            resultVO = new ResultVO(200, "增加成功");
        } catch (Exception e) {
            resultVO = new ResultVO(500, "增加失败");
        }finally {
            return  resultVO;
        }
    }


    @ResponseBody
    @DeleteMapping("{pdId}")
    public ResultVO deletepaidui(@PathVariable Integer pdId){
        try {
            paiduiService.deleteByPrimaryKey(pdId);
            return new ResultVO(200, "删除数据成功",pdId);
        } catch (Exception e) {
            return new ResultVO(500, "删除数据失败", pdId);
        }
    }
    @ResponseBody
    @PutMapping
    public ResultVO update(@RequestBody Paidui paidui) {
        try {
            paiduiService.updateByPrimaryKey(paidui);
            return new ResultVO(200, "修改数据成功", paidui);
        } catch (Exception e) {
            return new ResultVO(500, "修改数据失败", paidui);
        }
    }
    @ResponseBody
    @GetMapping
    public ResultVO findAll() {
        List<Paidui> list = paiduiService.findAll();

        ResultVO resultVO = null;
        if(list != null && list.size() > 0) {
            resultVO = new ResultVO(200,"查询所有排队记录成功", list);
        } else {
            resultVO = new ResultVO(500, "查询所有排队记录失败");
        }
        return resultVO;
    }
    @ResponseBody
    @GetMapping("{pdId}")
    public ResultVO findOne(@PathVariable Integer pdId) {
        Paidui paidui = paiduiService.findOneByPrimaryKey(pdId);
        if(paidui != null) {
            return new ResultVO(200, "查询排队成功", pdId);
        } else {
            return new ResultVO(500, "查询排队失败");
        }
    }

}
