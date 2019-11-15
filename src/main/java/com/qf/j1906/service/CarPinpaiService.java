package com.qf.j1906.service;

import com.qf.j1906.pojo.Carbrand;
import com.qf.j1906.vo.DataGridResult;

import java.util.List;

/**
 * Created by dafei 2019/11/6 20:37
 */
public interface CarPinpaiService {

    public List<Carbrand> findCarPinpai();

    /**
     * 不带带条件的分页
     * @param page
     * @param pageSize
     * @return
     */
    public DataGridResult findCarPinpaiByPage(int page, int pageSize);

    /**
     * 带条件的分页
     * @param pinpainame
     * @param page
     * @param pageSize
     * @return
     */
    public DataGridResult findCarPinpaiByPage(String pinpainame, int page, int pageSize);


    /**
     * 添加品牌
     * @param carbrand
     */
    public void addPinpai(Carbrand carbrand);

    /**
     * 删除品牌
     * @param brindIds
     */
    public void deleteCarbrandByIds(String[] brindIds);
}
