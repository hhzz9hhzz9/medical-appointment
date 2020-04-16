package com.woniu.controller;

import com.woniu.pojo.PageBean;
import com.woniu.pojo.Paidui;
import com.woniu.pojo.ResultVO;
import com.woniu.service.IPaiduiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * @author jad
 * @creat 2020/03/2020/3/26 17:57:33
 */
@RestController
@RequestMapping("paidui")
public class PaiduiController {
    @Autowired
    private IPaiduiService paiduiService;

    //增加排队记录
    @ResponseBody
    @PostMapping
    public ResultVO addpaidui(@RequestBody Paidui paidui) {

        ResultVO resultVO = null;
        try {
            if (paidui.getOfficeId() != null && paidui.getZhenshiId() != null) {
                paiduiService.insert(paidui);
                resultVO = new ResultVO(200, "增加成功");
            }
        } catch (Exception e) {
            resultVO = new ResultVO(500, "增加失败");
        } finally {
            return resultVO;
        }
    }

    //删除排队记录
    @ResponseBody
    @DeleteMapping("{pdId}")
    public ResultVO deletepaidui(@PathVariable Integer pdId) {
        try {
            paiduiService.deleteByPrimaryKey(pdId);
            return new ResultVO(200, "删除数据成功", pdId);
        } catch (Exception e) {
            return new ResultVO(500, "删除数据失败", pdId);
        }
    }

    //修改排队记录
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

    //查询全部排队记录
    @ResponseBody
    @GetMapping
    public ResultVO findAll() {
        List<Paidui> list = paiduiService.findAll();

        ResultVO resultVO = null;
        if (list != null && list.size() > 0) {
            resultVO = new ResultVO(200, "查询所有排队记录成功", list);
        } else {
            resultVO = new ResultVO(500, "查询所有排队记录失败");
        }
        return resultVO;
    }

    @ResponseBody
    @PostMapping("select/selectbypage")
    public ResultVO findbypage(@RequestBody PageBean<Paidui> pageBean) {
        if (pageBean.getNowPage() == null) {
            pageBean.setNowPage(1);
        }
        pageBean.setPageRow(10);
        List<Paidui> paiduiList = paiduiService.selectbypage(pageBean);
        pageBean.setList(paiduiList);
        int countRow = paiduiService.countAll();
        pageBean.setCountRow(countRow);
        int countPage = pageBean.getCountRow() % pageBean.getPageRow() == 0 ? pageBean.getCountRow() / pageBean.getPageRow() : pageBean.getCountRow() / pageBean.getPageRow() + 1;
        pageBean.setCountPage(countPage);
        ResultVO resultVO = null;
        if (paiduiList != null && paiduiList.size() > 0) {
            resultVO = new ResultVO(200, "查询所有排队记录成功", pageBean);
        } else {
            resultVO = new ResultVO(500, "查询所有排队记录失败");
        }
        return resultVO;

    }

    //查询单条排队记录
    @ResponseBody
    @GetMapping("{pdId}")
    public ResultVO findOne(@PathVariable Integer pdId) {
        Paidui paidui = paiduiService.findOneByPrimaryKey(pdId);
        if (paidui != null) {
            return new ResultVO(200, "查询排队成功", pdId);
        } else {
            return new ResultVO(500, "查询排队失败");
        }
    }

    @ResponseBody
    @GetMapping("selectbyzhenshi/{zhenshiId}")
    public ResultVO selectbyzhenshi(@PathVariable Integer zhenshiId) {
        List<Paidui> list= paiduiService.selectbyzhenshi(zhenshiId);
        if (list != null) {
            return new ResultVO(200, "查询排队成功", list);
        } else {
            return new ResultVO(500, "查询排队失败");
        }
    }
    @ResponseBody
    @GetMapping("logpaidui/{zhenshiId}")
    public ResultVO logpaidui(@PathVariable Integer zhenshiId) {
        Paidui paidui= paiduiService.logpaidui(zhenshiId);
        if (paidui != null) {
            return new ResultVO(200, "查询排队成功", paidui);
        } else {
            return new ResultVO(500, "查询排队失败");
        }
    };
    @ResponseBody
    @GetMapping("countbyid/{zhenshiId}")
    public ResultVO contAllById(@PathVariable Integer zhenshiId){
      int count=paiduiService.countAllbyid(zhenshiId);
        return new ResultVO(200, "查询数量成功", count);
    }
    @ResponseBody
    @DeleteMapping
    public ResultVO deletAll(@RequestBody Integer[] checked){
        try {
            for(int i=0;i<checked.length;i++) {

                paiduiService.deleteByPrimaryKey(checked[i]);
            }
            return new ResultVO(200, "删除数据成功", checked);
        } catch (Exception e) {
            return new ResultVO(500, "删除数据失败", checked);
        }
    }


}
