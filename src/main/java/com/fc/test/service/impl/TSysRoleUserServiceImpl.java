package com.fc.test.service.impl;


import com.fc.test.mapper.TSysRoleUserMapper;
import com.fc.test.model.TSysRoleUser;
import com.fc.test.model.TSysRoleUserExample;
import com.fc.test.service.TSysRoleUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TSysRoleUserServiceImpl implements TSysRoleUserService {

@Resource
   private TSysRoleUserMapper mapper;

    @Override
    public int deleteByPrimaryKey(String id) {

        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(TSysRoleUser record) {
        return mapper.insertSelective(record);
    }

    @Override
    public TSysRoleUser selectByPrimaryKey(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TSysRoleUser record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByExampleSelective(TSysRoleUser record, TSysRoleUserExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TSysRoleUser record, TSysRoleUserExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public List<TSysRoleUser> selectByExample(TSysRoleUserExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public long countByExample(TSysRoleUserExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TSysRoleUserExample example) {
        return mapper.deleteByExample(example);
    }
}
