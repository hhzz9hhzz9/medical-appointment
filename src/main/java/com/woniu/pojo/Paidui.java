package com.woniu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paidui implements Serializable {
    private Integer pdId;

    private Integer zhenshiId;

    private Integer officeId;

    private Integer pdNo;

    private Date pdTime;

    private Zhenshi zhenshi;
    private Office office;

    private static final long serialVersionUID = 1L;


}