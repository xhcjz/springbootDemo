package com.fc.test.service.impl;


import com.fc.test.mapper.TSysRoleMapper;
import com.fc.test.model.TSysRole;
import com.fc.test.model.TSysRoleExample;
import com.fc.test.service.TSysRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TSysRoleServiceImpl implements TSysRoleService {

    @Resource
   private TSysRoleMapper mapper;

    @Override
    public int deleteByPrimaryKey(String id) {

        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(TSysRole record) {
        return mapper.insertSelective(record);
    }

    @Override
    public TSysRole selectByPrimaryKey(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TSysRole record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByExampleSelective(TSysRole record, TSysRoleExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TSysRole record, TSysRoleExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public List<TSysRole> selectByExample(TSysRoleExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public long countByExample(TSysRoleExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TSysRoleExample example) {
        return mapper.deleteByExample(example);
    }
}
