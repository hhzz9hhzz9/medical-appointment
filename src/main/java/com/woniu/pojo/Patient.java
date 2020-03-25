package com.woniu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient implements Serializable {
    private Integer patientId;

    private String patientName;

    private Integer patientAge;

    private String patientAccount;

    private String patientPwd;

    private String patientGender;

    private Integer patientStatus;

    private static final long serialVersionUID = 1L;
}