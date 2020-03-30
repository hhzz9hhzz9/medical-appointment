package com.woniu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Office implements Serializable {
    private Integer officeId;

    private String officeName;

    private static final long serialVersionUID = 1L;


}