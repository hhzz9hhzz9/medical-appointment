package com.woniu.controller;

import com.woniu.pojo.ResultVO;
import com.woniu.pojo.Patient;
import com.woniu.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author llf
 * @date 2020/3/24 17:10
 */

@Controller
public class TestController {
    @Autowired
    private IPatientService patientService;

//   @RequestMapping("/index")
//   public String springbootTest(){
//       return "index" ;
//    }
//
//    @RequestMapping("/login")
//    public String show(){ return "login"; }

    @ResponseBody
    @RequestMapping("/loginIn")
    public ResultVO login(@RequestBody Patient patient, HttpSession session){
        ResultVO resultVO =null;
        Patient loginUser = patientService.loginTest(patient);

        if (loginUser != null) {
            session.setAttribute("loginUser", loginUser);
            resultVO = new ResultVO(200,"登陆成功");
        }else {
            resultVO = new ResultVO(500,"登陆失败");
        }
        return resultVO;
    }
    @ResponseBody
    @PostMapping("/register")
    public ResultVO register(@RequestBody Patient patient){
        ResultVO resultVO = null;
        try {
            patient.setPatientStatus(1);
            patientService.register(patient);
            resultVO = new ResultVO(200, "注册成功");
        } catch (Exception e) {
            resultVO = new ResultVO(500, "注册失败");
        }finally {
           return  resultVO;
        }
    }
    @GetMapping("/patientList")
    @ResponseBody
    public ResultVO findAll() {
        List<Patient> list = patientService.findAll();

        ResultVO resultVO = null;
        if(list != null && list.size() > 0) {
            resultVO = new ResultVO(200,"查询成功", list);
        } else {
            resultVO = new ResultVO(500, "查询失败");
        }
        return resultVO;
    }
}
