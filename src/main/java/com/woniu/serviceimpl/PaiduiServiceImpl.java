package com.woniu.serviceimpl;

import com.woniu.mapper.PaiduiMapper;
import com.woniu.pojo.Paidui;
import com.woniu.service.IPaiduiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author jad
 * @creat 2020/03/2020/3/26 17:47:08
 */
@Service
@Transactional
public class PaiduiServiceImpl implements IPaiduiService {
    @Autowired
    private PaiduiMapper paiduiMapper;
    @Override
    public void deleteByPrimaryKey(Integer paiduiId) {
   paiduiMapper.deleteByPrimaryKey(paiduiId);
    }

    @Override
    public void insert(Paidui record) {
  paiduiMapper.insert(record);
    }

    @Override
    public void updateByPrimaryKey(Paidui record) {
   paiduiMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Paidui> findAll() {
        return paiduiMapper.findAll();
    }

    @Override
    public Paidui findOneByPrimaryKey(Integer paiduiId) {
        return paiduiMapper.findOneByPrimaryKey(paiduiId);
    }
}
