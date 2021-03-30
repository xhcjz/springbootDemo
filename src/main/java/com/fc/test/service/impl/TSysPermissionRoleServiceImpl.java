package com.fc.test.service.impl;


import com.fc.test.mapper.TSysPermissionRoleMapper;
import com.fc.test.model.TSysPermissionRole;
import com.fc.test.model.TSysPermissionRoleExample;
import com.fc.test.service.TSysPermissionRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TSysPermissionRoleServiceImpl implements TSysPermissionRoleService {

    @Resource
   private TSysPermissionRoleMapper mapper;

    @Override
    public int deleteByPrimaryKey(String id) {

        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(TSysPermissionRole record) {
        return mapper.insertSelective(record);
    }

    @Override
    public TSysPermissionRole selectByPrimaryKey(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TSysPermissionRole record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByExampleSelective(TSysPermissionRole record, TSysPermissionRoleExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TSysPermissionRole record, TSysPermissionRoleExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public List<TSysPermissionRole> selectByExample(TSysPermissionRoleExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public long countByExample(TSysPermissionRoleExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TSysPermissionRoleExample example) {
        return mapper.deleteByExample(example);
    }
}
