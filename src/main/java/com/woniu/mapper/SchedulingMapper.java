package com.woniu.mapper;

import com.woniu.pojo.RelationShip;
import com.woniu.pojo.Scheduling;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SchedulingMapper {

    List <Scheduling> findAll();

    void delete(int id);

    void update(Scheduling scheduling);

    void add(Scheduling scheduling);

    void updateRS(int scheduling_id, int doctor_id);

    List<RelationShip> findAllRS();

    void addRS(RelationShip rs);
}