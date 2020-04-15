package com.woniu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Zhenshi implements Serializable {
    private Integer zhenshiId;

    private Integer officeId;

    private String zhenshiName;

    private  Office office;


    private static final long serialVersionUID = 1L;


}