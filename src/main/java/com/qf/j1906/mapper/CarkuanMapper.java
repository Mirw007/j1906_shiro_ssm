package com.qf.j1906.mapper;

import com.qf.j1906.pojo.Carkuan;
import com.qf.j1906.pojo.CarkuanExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CarkuanMapper {
    int countByExample(CarkuanExample example);

    int deleteByExample(CarkuanExample example);

    int deleteByPrimaryKey(Integer carkuanId);

    int insert(Carkuan record);

    int insertSelective(Carkuan record);

    List<Carkuan> selectByExample(CarkuanExample example);

    Carkuan selectByPrimaryKey(Integer carkuanId);

    int updateByExampleSelective(@Param("record") Carkuan record, @Param("example") CarkuanExample example);

    int updateByExample(@Param("record") Carkuan record, @Param("example") CarkuanExample example);

    int updateByPrimaryKeySelective(Carkuan record);

    int updateByPrimaryKey(Carkuan record);

    List<Carkuan> selectCarkuans();

    void delete(String[] carkuanId);
}