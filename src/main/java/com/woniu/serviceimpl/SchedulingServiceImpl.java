package com.woniu.serviceimpl;

import com.woniu.mapper.SchedulingMapper;
import com.woniu.pojo.RelationShip;
import com.woniu.pojo.Scheduling;
import com.woniu.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.nio.cs.ext.MacArabic;

import java.util.List;

/**
 * @author machuang
 * @create 2020/03/2020/3/26
 */
@Service
@Transactional
public class SchedulingServiceImpl implements SchedulingService {
    @Autowired
    SchedulingMapper mapper;
    @Override
    public List  findAll() {
        return mapper.findAll();
    }

    @Override
    public void delete(int id) {
       mapper.delete(id);
    }

    @Override
    public void update(Scheduling scheduling) {
    mapper.update(scheduling);
    }

    @Override
    public void add(Scheduling scheduling) {
    mapper.add( scheduling);
    }

    @Override
    public void updateRS(int scheduling_id, int doctor_id) {
     mapper.updateRS(scheduling_id,doctor_id)   ;
    }

    @Override
    public List<RelationShip> findAllRS() {
        return mapper.findAllRS();
    }

    @Override
    public void addRS(RelationShip rs) {
        mapper.addRS(rs);
    }
}
