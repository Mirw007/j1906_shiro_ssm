package com.qf.j1906.service;

import com.qf.j1906.pojo.Factory;
import com.qf.j1906.vo.DataGridResult;

/**
 * Created by dafei 2019/11/8 19:33
 */

public interface CarFactoryService {
    /**
     * 带条件的分页
     * @param factoryname
     * @param page
     * @param pageSize
     * @return
     */
    public DataGridResult findCarFactoryByPage(String factoryname, int page, int pageSize);

    /**
     * 添加厂商
     * @param factory
     */
    public void addChangshang(Factory factory);

    /**
     * 删除厂商
     * @param factoryIds
     */
    public void deleteChangshangById(String[] factoryIds);
}
