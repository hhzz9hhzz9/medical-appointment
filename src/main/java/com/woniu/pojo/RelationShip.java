package com.woniu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author machuang
 * @create 2020/03/2020/3/29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

public class RelationShip {
    private int rsid;
    private int doctorId;
    private int schedulingId;
    private Doctor doctor;
    private Scheduling scheduling;
}

