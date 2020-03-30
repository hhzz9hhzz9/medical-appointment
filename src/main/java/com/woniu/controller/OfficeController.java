package com.woniu.controller;

import com.woniu.pojo.Office;
import com.woniu.pojo.ResultVO;
import com.woniu.service.IOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author jad
 * @creat 2020/03/2020/3/26 17:57:14
 */
@RestController
@RequestMapping("office")
public class OfficeController {
    @Autowired
    private IOfficeService officeService;

    @ResponseBody
    @PostMapping("addoffic")
    public ResultVO addoffic(@RequestBody Office office){

        ResultVO resultVO = null;
        try {
            officeService.insert(office);
            resultVO = new ResultVO(200, "增加成功");
        } catch (Exception e) {
            resultVO = new ResultVO(500, "增加失败");
        }finally {
            return  resultVO;
        }
    }


    @ResponseBody
    @DeleteMapping("{officeId}")
    public ResultVO deleteoffice(@PathVariable Integer officeId){
        try {
            officeService.deleteByPrimaryKey(officeId);
            return new ResultVO(200, "删除数据成功",officeId);
        } catch (Exception e) {
            return new ResultVO(500, "删除数据失败", officeId);
        }
    }
    @ResponseBody
    @PutMapping("update")
    public ResultVO update(@RequestBody Office office) {
        try {
            officeService.updateByPrimaryKey(office);
            return new ResultVO(200, "修改数据成功", office);
        } catch (Exception e) {
            return new ResultVO(500, "修改数据失败", office);
        }
    }
    @ResponseBody
    @GetMapping("findAll")
    public ResultVO findAll() {
        List<Office> list = officeService.findAll();

        ResultVO resultVO = null;
        if(list != null && list.size() > 0) {
            resultVO = new ResultVO(200,"查询所有科室成功", list);
        } else {
            resultVO = new ResultVO(500, "查询所有科室失败");
        }
        return resultVO;
    }

    @ResponseBody
    @GetMapping("{officeId}")
    public ResultVO findOne(@PathVariable Integer officeId) {
        Office office = officeService.findOneByPrimaryKey(officeId);
        if(office != null) {
            return new ResultVO(200, "查询科室成功", office);
        } else {
            return new ResultVO(500, "查询科室失败");
        }
    }

}
