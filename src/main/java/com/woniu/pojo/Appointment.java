package com.woniu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointment implements Serializable {
    private Integer appointmentId;

    private Integer astatusId;

    private Integer doctorId;

    private Integer patientId;

    private String aname;

    private Date atime;

    private Doctor doctor;

    private Patient patient;

    private static final long serialVersionUID = 1L;
}