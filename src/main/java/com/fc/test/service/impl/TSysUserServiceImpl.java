package com.fc.test.service.impl;


import com.fc.test.mapper.TSysUserMapper;
import com.fc.test.model.TSysUser;
import com.fc.test.model.TSysUserExample;
import com.fc.test.service.TSysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TSysUserServiceImpl implements TSysUserService {

   @Resource
   private TSysUserMapper mapper;

    @Override
    public int deleteByPrimaryKey(String id) {

        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(TSysUser record) {
        return mapper.insertSelective(record);
    }

    @Override
    public TSysUser selectByPrimaryKey(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TSysUser record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByExampleSelective(TSysUser record, TSysUserExample example) {

        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TSysUser record, TSysUserExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public List<TSysUser> selectByExample(TSysUserExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public long countByExample(TSysUserExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TSysUserExample example) {
        return mapper.deleteByExample(example);
    }
}
