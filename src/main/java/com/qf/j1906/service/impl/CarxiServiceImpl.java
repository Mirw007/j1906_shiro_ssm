package com.qf.j1906.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.j1906.mapper.CarxiMapper;
import com.qf.j1906.pojo.Carxi;
import com.qf.j1906.pojo.CarxiExample;
import com.qf.j1906.service.CarxiService;
import com.qf.j1906.vo.DataGridResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarxiServiceImpl implements CarxiService {
    Logger logger= LogManager.getLogger(CarxiServiceImpl.class);
    @Autowired
    private CarxiMapper CarxiExample;
    
    @Autowired 
    private CarxiMapper carxiMapper;

    /**
     * 查询所有车系信息
     * @return
     */

    @Override
    public List<Carxi> getCarxi() {
        CarxiExample example = new CarxiExample();
        CarxiExample.Criteria criteria = example.createCriteria();
        List<Carxi> carxis = CarxiExample.selectByExample(example);
        return carxis;
    }

    @Override
    public DataGridResult findItemsByPage(String brandName, String carType, String carxiName, int page, int pageSize) {
        DataGridResult gridResult = new DataGridResult();
        com.qf.j1906.pojo.CarxiExample example = new CarxiExample();
        /* 创建条件查询对象*/
        CarxiExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(brandName)) {
            criteria.andBrandNameLike("%" + brandName + "%");
        }
        if (!StringUtils.isEmpty(carType)) {
            criteria.andCarTypeLike("%" + carType + "%");
        }

        criteria.andCarxiNameLike("%" + carxiName + "%");

        PageHelper.startPage(page, pageSize);

        List<Carxi> carxis = carxiMapper.selectByExample(example);

        logger.info("==========carkauns==="+carxis);

        /*  获取结果集中的分页信息*/
        PageInfo pageInfo = new PageInfo(carxis);

        /*  获取总记录数*/
        long total = pageInfo.getTotal();
        gridResult.setRows(carxis);
        gridResult.setTotal(total);
        return gridResult;
    }

    @Override
    public void addCarxi(Carxi carxi) {
        carxiMapper.insert(carxi);
    }

    @Override
    public void deleteById(int carxiId) {
        carxiMapper.deleteByPrimaryKey(carxiId);
    }

    @Override
    public Carxi getCarxiById(int carxiId) {
        return carxiMapper.selectByPrimaryKey(carxiId);
    }

    @Override
    public void updateCarxiById(Carxi carxi) {
        carxiMapper.updateByPrimaryKey(carxi);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void delete(String[] carxiId) {
        carxiMapper.delete(carxiId);
        // 删除权限
       /* for (int i = 0, len = carxiId.length; i < len; i++) {
            carxiMapper.deleteRoleByAdminName(carxiId[i]);
        }*/
    }
}
