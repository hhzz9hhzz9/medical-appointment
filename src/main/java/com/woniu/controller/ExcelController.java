package com.woniu.controller;

import com.woniu.util.ConvertHtml2Excel;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
@Controller
@RequestMapping("exel")
public class ExcelController {
    @PostMapping
    private void loadExcelGet(HttpServletRequest req, HttpServletResponse resp) {
        try {
            req.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        // 设置文件的mime类型
        resp.setContentType("application/vnd.ms-excel");
        // 存储编码后的文件名
        String excelName = "name";
        // 存储文件名称
        String n = req.getParameter("excelName");
        try {
            excelName = URLEncoder.encode(n, "utf-8");
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }
        resp.setHeader("content-disposition", "attachment;filename=" + excelName + ".xls;filename*=utf-8''" + excelName + ".xls");
        String tableHtml = req.getParameter("tableHtml");
        // 从session中删除saveExcelMsg属性
        req.getSession().removeAttribute("saveExcelMsg");
        // 定义一个输出流
        ServletOutputStream sos = null;
        HSSFWorkbook wb = ConvertHtml2Excel.table2Excel(tableHtml);
        try {
            // 保存到文件中
            sos = resp.getOutputStream();
            wb.write(sos);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sos != null) {
                try {
                    sos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

