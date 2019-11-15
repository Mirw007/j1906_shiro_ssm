package com.qf.j1906.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.j1906.mapper.FactoryMapper;
import com.qf.j1906.pojo.Factory;
import com.qf.j1906.pojo.FactoryExample;
import com.qf.j1906.service.CarFactoryService;
import com.qf.j1906.vo.DataGridResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.List;

/**
 * Created by dafei 2019/11/8 19:33
 */
@Service
public class CarFactoryServiceImpl implements CarFactoryService {

        @Autowired
        private FactoryMapper factoryMapper;

/*@Override
    public DataGridResult findCarPinpaiByPage(int page, int pageSize) {

        DataGridResult gridResult = new DataGridResult();
        CarbrandExample example = new CarbrandExample();
        PageHelper.startPage(page, pageSize);//拦截查询语句，添加分页信息
        List<Carbrand> carbrands = carbrandMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(carbrands);
        long total = pageInfo.getTotal();
        gridResult.setRows(carbrands);
        gridResult.setTotal(total);
        return gridResult;
    }*/


//    @Override
//    public DataGridResult findCarPinpaiByPage(String pinpainame, int page, int pageSize) {
//        DataGridResult gridResult = new DataGridResult();
//        CarbrandExample example = new CarbrandExample();
//
//        //创建条件查询对象
//        CarbrandExample.Criteria criteria = example.createCriteria();
//        if(!StringUtils.isEmpty(pinpainame)){
//            criteria.andBrandNameLike("%"+pinpainame+"%");
//        }
//        PageHelper.startPage(page, pageSize);//拦截查询语句，添加分页信息
//        List<Carbrand> carbrands = carbrandMapper.selectByExample(example);
//        PageInfo pageInfo = new PageInfo(carbrands);
//        long total = pageInfo.getTotal();
//        gridResult.setRows(carbrands);
//        gridResult.setTotal(total);
//        return gridResult;
//    }

    /**
     * 带条件的分页
     * @param factoryname
     * @param page
     * @param pageSize
     * @return
     */
    public DataGridResult findCarFactoryByPage(String factoryname, int page, int pageSize) {
        DataGridResult gridResult = new DataGridResult();
        FactoryExample example = new FactoryExample();

        //创建查询对象
        FactoryExample.Criteria exampleCriteria = example.createCriteria();
        if(!StringUtils.isEmpty(factoryname)){
            exampleCriteria.andFactoryNameLike("%"+factoryname+"%");
        }

        PageHelper.startPage(page, pageSize);//拦截查询语句，添加分页信息
        List<Factory> factories = factoryMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo();
        long total = pageInfo.getTotal();
        gridResult.setRows(factories);
        gridResult.setTotal(total);
        return gridResult;
    }

    /**
     * 添加厂商
     * @param factory
     */
    @Override
    public void addChangshang(Factory factory) {
        factoryMapper.insert(factory);
    }

    @Override
    public void deleteChangshangById(String[] factoryIds) {
        factoryMapper.deleteByids(factoryIds);
    }
}
