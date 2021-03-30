package com.fc.test.service.impl;


import com.fc.test.mapper.TSysPermissionMapper;
import com.fc.test.model.TSysPermission;
import com.fc.test.model.TSysPermissionExample;
import com.fc.test.service.TSysPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TSysPermissionServiceImpl implements TSysPermissionService {

    @Resource
   private TSysPermissionMapper mapper;

    @Override
    public int deleteByPrimaryKey(String id) {

        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(TSysPermission record) {
        return mapper.insertSelective(record);
    }

    @Override
    public TSysPermission selectByPrimaryKey(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TSysPermission record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByExampleSelective(TSysPermission record, TSysPermissionExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TSysPermission record, TSysPermissionExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public List<TSysPermission> selectByExample(TSysPermissionExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public long countByExample(TSysPermissionExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TSysPermissionExample example) {
        return mapper.deleteByExample(example);
    }
}
