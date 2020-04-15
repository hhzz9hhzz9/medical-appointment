package com.woniu.serviceimpl;

import com.woniu.mapper.ZhenshiMapper;
import com.woniu.pojo.Zhenshi;
import com.woniu.service.IZhenshiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author jad
 * @creat 2020/03/2020/3/26 17:48:18
 */
@Service
@Transactional
public class ZhenshiServiceImpl implements IZhenshiService {
    @Autowired
    private ZhenshiMapper zhenshiMapper;
    @Override
    public void deleteByPrimaryKey(Integer zhenshiId) {
   zhenshiMapper.deleteByPrimaryKey(zhenshiId);
    }

    @Override
    public void insert(Zhenshi record) {
  zhenshiMapper.insert(record);
    }

    @Override
    public void updateByPrimaryKey(Zhenshi record) {
  zhenshiMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Zhenshi> findAll() {
        return zhenshiMapper.findAll();
    }

    @Override
    public Zhenshi findOneByPrimaryKey(Integer officeId) {
        return zhenshiMapper.findOneByPrimaryKey(officeId);
    }

    @Override
    public List<Zhenshi> findOneByOfficeId(Integer officeId) {
        return zhenshiMapper.findOneByOfficeId(officeId);
    }
}
