package com.qf.j1906.service;


import com.qf.j1906.pojo.Role;
import com.qf.j1906.vo.DataGridResult;

import java.util.List;

public interface RoleService {
    public List<Role> findRolesByUserName(String name);

    /**
     * 根据username查询角色
     */
    Role findRoleByUserName(String name);

    List<Role> findAll();

    DataGridResult findRoleByCondition(int page, int pageSize,String roleName);
}
