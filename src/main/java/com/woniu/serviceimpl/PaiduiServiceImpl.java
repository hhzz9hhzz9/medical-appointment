package com.woniu.serviceimpl;

import com.woniu.mapper.PaiduiMapper;
import com.woniu.pojo.PageBean;
import com.woniu.pojo.Paidui;
import com.woniu.service.IPaiduiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public void deleteByPrimaryKey(Integer pdId) {
   paiduiMapper.deleteByPrimaryKey(pdId);
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

    @Override
    public List<Paidui> selectbypage(PageBean<Paidui> pageBean) {
        return paiduiMapper.selectbypage(pageBean);
    }

    @Override
    public int countAll() {
        return paiduiMapper.countAll();
    }

    @Override
    public List<Paidui> selectbyzhenshi(Integer zhenshiId) {
        return paiduiMapper.selectbyzhenshi(zhenshiId);
    }

    @Override
    public int countAllbyid(Integer zhenshiId) {
        return paiduiMapper.countAllbyid(zhenshiId);
    }

    @Override
    public Paidui logpaidui(Integer zhenshiId) {
        return paiduiMapper.logpaidui(zhenshiId);
    }


}
