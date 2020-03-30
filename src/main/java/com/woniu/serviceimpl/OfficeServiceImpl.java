package com.woniu.serviceimpl;

import com.woniu.mapper.OfficeMapper;
import com.woniu.pojo.Office;
import com.woniu.service.IOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author jad
 * @creat 2020/03/2020/3/26 17:43:29
 */
@Service
@Transactional
public class OfficeServiceImpl implements IOfficeService {
    @Autowired
    private OfficeMapper officeMapper;
    @Override
    public void deleteByPrimaryKey(Integer officeId) {
     officeMapper.deleteByPrimaryKey(officeId);
    }

    @Override
    public void insert(Office record) {
   officeMapper.insert(record);
    }

    @Override
    public void updateByPrimaryKey(Office record) {
   officeMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Office> findAll() {
        return officeMapper.findAll();
    }

    @Override
    public Office findOneByPrimaryKey(Integer officeId) {
        return officeMapper.findOneByPrimaryKey(officeId);
    }
}
