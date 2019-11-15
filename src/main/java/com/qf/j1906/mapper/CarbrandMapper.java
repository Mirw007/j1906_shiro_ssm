package com.qf.j1906.mapper;

import com.qf.j1906.pojo.Carbrand;
import com.qf.j1906.pojo.CarbrandExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface CarbrandMapper {
    int countByExample(CarbrandExample example);

    int deleteByExample(CarbrandExample example);

    int insert(Carbrand record);

    int insertSelective(Carbrand record);

    List<Carbrand> selectByExample(CarbrandExample example);

    int updateByExampleSelective(@Param("record") Carbrand record, @Param("example") CarbrandExample example);

    int updateByExample(@Param("record") Carbrand record, @Param("example") CarbrandExample example);

    int deleteCarbrandByIds(String[] brindIds);
}