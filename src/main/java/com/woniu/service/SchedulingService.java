package com.woniu.service;

import com.woniu.pojo.RelationShip;
import com.woniu.pojo.Scheduling;

import java.util.List;

/**
 * @author machuang
 * @create 2020/03/2020/3/26
 */
public interface SchedulingService {

    List <Scheduling> findAll();

    void delete(int id);

    void update(Scheduling scheduling);

    void add(Scheduling scheduling);

    void updateRS(int scheduling_id, int doctor_id);

    List<RelationShip> findAllRS();

    void addRS(RelationShip rs);
}
