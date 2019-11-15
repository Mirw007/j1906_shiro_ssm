package com.qf.j1906.service;


import com.qf.j1906.pojo.User;
import com.qf.j1906.vo.DataGridResult;

import java.util.List;

/**
 * @author 飞
 */
public interface UserService {

    User findUser(String name);

    public List<User> findUsers();

    public User findUserByName(String userName);


    public DataGridResult findItemsByPage(int page, int pageSize);


    public DataGridResult findItemsByPage(String userName, int page, int pageSize);

    public List<User> getUser();

    public List<User> getUserById(int userId);

    public List<User> getUserByName(String userName);

    public void updatePssword(String password,int userId);

    User getUserID(int userId);

    void insert(User user);
}
