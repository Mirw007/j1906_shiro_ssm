package com.qf.j1906.service.impl;



import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.j1906.mapper.RoleMapper;
import com.qf.j1906.pojo.Carxi;
import com.qf.j1906.pojo.CarxiExample;
import com.qf.j1906.pojo.Role;
import com.qf.j1906.pojo.RoleExample;
import com.qf.j1906.service.RoleService;
import com.qf.j1906.vo.DataGridResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    Logger logger= LogManager.getLogger(RoleServiceImpl.class);

    @Autowired
    RoleMapper roleMapper;
    @Override
    public List<Role> findRolesByUserName(String name) {
        return roleMapper.selectRolesByLoginName(name);
    }

    @Override
    public Role findRoleByUserName(String name) {
        List<Role> roles = roleMapper.selectRolesByLoginName(name);
        for (Role role:roles){
            if (role!=null){
                return role;
            }
        }
        return null;
    }

    @Override
    public List<Role> findAll() {
        return roleMapper.findAll();
    }

    @Override
    public DataGridResult findRoleByCondition(int page, int pageSize, String roleName) {
        DataGridResult gridResult = new DataGridResult();
       RoleExample example = new RoleExample();
        /* 创建条件查询对象*/
        RoleExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(roleName)) {
            criteria.andRoleNameGreaterThan( roleName);
        }
        PageHelper.startPage(page, pageSize);

        List<Role> carxis = roleMapper.selectByExample(example);

        logger.info("==========carkauns==="+carxis);

        /*  获取结果集中的分页信息*/
        PageInfo pageInfo = new PageInfo(carxis);

        /*  获取总记录数*/
        long total = pageInfo.getTotal();
        gridResult.setRows(carxis);
        gridResult.setTotal(total);
        return gridResult;
    }
}
