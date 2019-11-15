package com.qf.j1906.mapper;

import com.qf.j1906.pojo.Carxi;
import com.qf.j1906.pojo.CarxiExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CarxiMapper {
    int countByExample(CarxiExample example);

    int deleteByExample(CarxiExample example);

    int deleteByPrimaryKey(Integer carxiId);

    int insert(Carxi record);

    int insertSelective(Carxi record);

    List<Carxi> selectByExample(CarxiExample example);

    Carxi selectByPrimaryKey(Integer carxiId);

    int updateByExampleSelective(@Param("record") Carxi record, @Param("example") CarxiExample example);

    int updateByExample(@Param("record") Carxi record, @Param("example") CarxiExample example);

    int updateByPrimaryKeySelective(Carxi record);

    int updateByPrimaryKey(Carxi record);

    void delete(String[] carxiId);

    void deleteRoleByAdminName(String names);
}