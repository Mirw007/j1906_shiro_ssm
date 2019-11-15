package com.qf.j1906.service.impl;


import com.qf.j1906.mapper.PermissionMapper;
import com.qf.j1906.pojo.Permission;
import com.qf.j1906.service.PermisissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermisissionService {
    @Autowired
    PermissionMapper permissionMapper;

    @Override
    public List<Permission> findPermsByLoginName(String name) {
        return permissionMapper.selectByUserName(name);
    }
}
