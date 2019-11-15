package com.qf.j1906.mapper;

import com.qf.j1906.pojo.User;
import com.qf.j1906.pojo.UserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {

    User selectByPrimaryKey(Integer userId);

    User selectByName(String name);

    public User selectName(String userName);

    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    public List<User> select();

    public List<User> selectById(int userId);

    int updateByPrimaryKey(User record);

    public void updatePassword(@Param("password")String password,@Param("userId")int userId);

    User selectId(int userId);
}