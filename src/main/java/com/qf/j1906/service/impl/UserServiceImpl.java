package com.qf.j1906.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.j1906.mapper.UserMapper;
import com.qf.j1906.pojo.User;
import com.qf.j1906.pojo.UserExample;
import com.qf.j1906.service.UserService;
import com.qf.j1906.vo.DataGridResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.List;

/**
 * @author 飞
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    Logger logger= LogManager.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUsers() {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        List<User> users = userMapper.selectByExample(example);
        return users;
    }

    @Override
    public User findUserByName(String userName) {
        return userMapper.selectName(userName);

    }


    @Override
    public DataGridResult findItemsByPage(int page, int pageSize) {
        DataGridResult gridResult = new DataGridResult();
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        /* 拦截查询语句，并添加分页特征*/
        PageHelper.startPage(page, pageSize);


        List<User> users = userMapper.selectByExample(example);

        /*  获取结果集中的分页信息*/

        PageInfo pageInfo = new PageInfo(users);

        /*获取总记录数*/
        long total = pageInfo.getTotal();
        gridResult.setRows(users);
        gridResult.setTotal(total);
        return gridResult;
    }

    @Override
    public DataGridResult findItemsByPage(String userName, int page, int pageSize) {
        DataGridResult gridResult = new DataGridResult();
        UserExample example = new UserExample();
        /* 创建条件查询对象*/
        UserExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(userName)) {
            criteria.andUserNameLike("%" + userName + "%");
        }
        /* 添加price查询条件*/
        /*  criteria.andPriceLessThanOrEqualTo(price * 100);*/
        /*拦截查询语句，并添加分页特征*/
        PageHelper.startPage(page, pageSize);

        List<User> users = userMapper.selectByExample(example);

        /*  获取结果集中的分页信息*/
        PageInfo pageInfo = new PageInfo(users);

        /*  获取总记录数*/
        long total = pageInfo.getTotal();
        gridResult.setRows(users);
        gridResult.setTotal(total);
        return gridResult;
    }

    @Override
    public List<User> getUser() {
        return userMapper.select();
    }

    @Override
    public List<User> getUserById(int userId) {

        return userMapper.selectById(userId);
    }

    @Override
    public List<User> getUserByName(String userName) {
        return (List<User>) userMapper.selectByName(userName);
    }

    @Override
    public void updatePssword(String password,int userId) {
        logger.info(password+"===="+userId);
        userMapper.updatePassword(password,userId);
    }

    @Override
    public User getUserID(int userId) {
        return userMapper.selectId(userId);

    }

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    public User findUser(String name) {
        return userMapper.selectByName(name);
    }
}