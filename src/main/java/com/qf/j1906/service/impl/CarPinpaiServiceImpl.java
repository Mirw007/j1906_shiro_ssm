package com.qf.j1906.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.j1906.mapper.CarbrandMapper;
import com.qf.j1906.pojo.Carbrand;
import com.qf.j1906.pojo.CarbrandExample;
import com.qf.j1906.service.CarPinpaiService;
import com.qf.j1906.vo.DataGridResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.util.StringUtils;

import java.util.List;

/**
 * Created by dafei 2019/11/6 20:39
 */
@Service(value = "carPinpaiService")
public class CarPinpaiServiceImpl implements CarPinpaiService {



    @Autowired
    private CarbrandMapper carbrandMapper;
    @Override
    public List<Carbrand> findCarPinpai() {
        CarbrandExample example = new CarbrandExample();
        CarbrandExample.Criteria criteria = example.createCriteria();
//        criteria.andBrandTimeBetween()
        List<Carbrand> carbrands = carbrandMapper.selectByExample(example);

        return carbrands;
    }
    @Override
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
    }
    @Override
    public DataGridResult findCarPinpaiByPage(String pinpainame, int page, int pageSize) {
        DataGridResult gridResult = new DataGridResult();
        CarbrandExample example = new CarbrandExample();

        //创建条件查询对象
        CarbrandExample.Criteria criteria = example.createCriteria();
        if(!StringUtils.isEmpty(pinpainame)){
            criteria.andBrandNameLike("%"+pinpainame+"%");
        }
        PageHelper.startPage(page, pageSize);//拦截查询语句，添加分页信息
        List<Carbrand> carbrands = carbrandMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(carbrands);
        long total = pageInfo.getTotal();
        gridResult.setRows(carbrands);
        gridResult.setTotal(total);
        return gridResult;
    }

    /**
     * 添加品牌
     * @param carbrand
     */
    @Override
    public void addPinpai(Carbrand carbrand) {
        carbrandMapper.insert(carbrand);
    }

    /**
     * 删除品牌
     * @param brindIds
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void deleteCarbrandByIds(String[] brindIds) {
        carbrandMapper.deleteCarbrandByIds(brindIds);
    }


}
