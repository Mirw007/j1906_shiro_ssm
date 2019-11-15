package com.qf.j1906.mapper;


import com.qf.j1906.pojo.Factory;
import com.qf.j1906.pojo.FactoryExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface FactoryMapper {
    int countByExample(FactoryExample example);

    int deleteByExample(FactoryExample example);

    int insert(Factory record);

    int insertSelective(Factory record);

    List<Factory> selectByExample(FactoryExample example);

    int updateByExampleSelective(@Param("record") Factory record, @Param("example") FactoryExample example);

    int updateByExample(@Param("record") Factory record, @Param("example") FactoryExample example);

    void deleteByids(String[] factoryIds);
}