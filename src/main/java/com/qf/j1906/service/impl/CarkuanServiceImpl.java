package com.qf.j1906.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.j1906.mapper.CarkuanMapper;
import com.qf.j1906.pojo.Carkuan;
import com.qf.j1906.pojo.CarkuanExample;
import com.qf.j1906.service.CarkuanService;
import com.qf.j1906.vo.DataGridResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarkuanServiceImpl implements CarkuanService {

    Logger logger= LogManager.getLogger(CarkuanServiceImpl.class);
    @Autowired
    private CarkuanMapper carkuanMapper;

    @Override
    public List<Carkuan> getCarkuan() {
        CarkuanExample example = new CarkuanExample();
        CarkuanExample.Criteria criteria = example.createCriteria();
        List<Carkuan> carkuans = carkuanMapper.selectByExample(example);
        return carkuans;
    }

    /**
     *
     *
     * @param carxinName
     * @param brandName
     * @param carType
     * @param carxiName
     * @param page
     * @param pageSize
     * @return
     */

    @Override
    public DataGridResult findItemsByPage(String carxinName, String brandName, String carType, String carxiName, int page, int pageSize) {
        DataGridResult gridResult = new DataGridResult();
        CarkuanExample example = new CarkuanExample();
        /* 创建条件查询对象*/
        CarkuanExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(brandName)) {
            criteria.andBrandNameLike("%" + brandName + "%");
        }
        if (!StringUtils.isEmpty(carType)) {
            criteria.andCarTypeLike("%" + carType + "%");
        }

            criteria.andCarxiNameLike("%" + carxiName + "%");


            criteria.andCarxinNameLike("%" + carxinName + "%");



        PageHelper.startPage(page, pageSize);

        List<Carkuan> carkuans = carkuanMapper.selectByExample(example);
        logger.info("==========carkauns==="+carkuans);

        /*  获取结果集中的分页信息*/
        PageInfo pageInfo = new PageInfo(carkuans);

        /*  获取总记录数*/
        long total = pageInfo.getTotal();
        gridResult.setRows(carkuans);
        gridResult.setTotal(total);
        return gridResult;
    }

    /**
     * 按照Id删除车款信息
     * @param carkuanId
     */
    @Override
    public void deleteById(int carkuanId) {
        carkuanMapper.deleteByPrimaryKey(carkuanId);
    }
    /**
     * 按照Id查询车款信息
     * @param carkuanId
     */
    @Override
    public Carkuan getCarkuanById(int carkuanId) {
        return carkuanMapper.selectByPrimaryKey(carkuanId);
    }
    /**
     * 按照Id修改车款信息
     * @param carkuan
     */
    @Override
    public void updateCarkuanById(Carkuan carkuan) {
        carkuanMapper.updateByPrimaryKey(carkuan);
    }

    /**
     * 添加车款
     * @param carkuan
     */
    @Override
    public void addCarxi(Carkuan carkuan) {
        carkuanMapper.insert(carkuan);
    }

    @Override
    public void delete(String[] carkuanId) {
        carkuanMapper.delete(carkuanId);
    }
}
