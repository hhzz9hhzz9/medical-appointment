package com.woniu.controller;

import com.woniu.pojo.ResultVO;
import com.woniu.pojo.Zhenshi;
import com.woniu.service.IZhenshiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author jad
 * @creat 2020/03/2020/3/26 17:58:10
 */
@RestController
@RequestMapping("zhenshi")

public class ZhenshiController {
    @Autowired
    private IZhenshiService zhenshiService;
    //增加诊室
    @ResponseBody
    @PostMapping
    public ResultVO addzhenshi(@RequestBody Zhenshi zhenshi){
        ResultVO resultVO = null;
        try {
            zhenshiService.insert(zhenshi);
            resultVO = new ResultVO(200, "增加成功");
        } catch (Exception e) {
            e.printStackTrace();
            resultVO = new ResultVO(500, "增加失败");
        }finally {
            return  resultVO;
        }
    }

  //删除诊室
    @ResponseBody
    @DeleteMapping("{zhenshiId}")
    public ResultVO deletezhenshi(@PathVariable Integer zhenshiId){
        try {
            zhenshiService.deleteByPrimaryKey(zhenshiId);
            return new ResultVO(200, "删除数据成功",zhenshiId);
        } catch (Exception e) {
            return new ResultVO(500, "删除数据失败", zhenshiId);
        }
    }
    //修改诊室
    @ResponseBody
    @PutMapping
    public ResultVO update(@RequestBody Zhenshi zhenshi) {
        try {
            zhenshiService.updateByPrimaryKey(zhenshi);
            return new ResultVO(200, "修改数据成功", zhenshi);
        } catch (Exception e) {
            return new ResultVO(500, "修改数据失败", zhenshi);
        }
    }
    //查询全部诊室
    @ResponseBody
    @GetMapping
    public ResultVO findAll() {
        List<Zhenshi> list = zhenshiService.findAll();

        ResultVO resultVO = null;
        if(list != null && list.size() > 0) {
            resultVO = new ResultVO(200,"查询所有诊室成功", list);
        } else {
            resultVO = new ResultVO(500, "查询所有诊室失败");
        }
        return resultVO;
    }
    //查询单个诊室
    @ResponseBody
    @GetMapping("{zhenshiId}")
    public ResultVO findOne(@PathVariable Integer zhenshiId) {
        Zhenshi zhenshi = zhenshiService.findOneByPrimaryKey(zhenshiId);
        if(zhenshi != null) {
            return new ResultVO(200, "查询诊室成功", zhenshi);
        } else {
            return new ResultVO(500, "查询诊室失败");
        }
    }
}
