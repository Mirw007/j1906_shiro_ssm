package com.qf.j1906.service;

import com.qf.j1906.pojo.Carxi;
import com.qf.j1906.vo.DataGridResult;

import java.util.List;

/**
 * @author 飞
 */
public interface CarxiService {
    List<Carxi> getCarxi();

    DataGridResult findItemsByPage(String brandName, String carType, String carxiName, int page, int pageSize);

    void addCarxi(Carxi carxi);

    void deleteById(int carxiId);

    Carxi getCarxiById(int carxiId);

    void updateCarxiById(Carxi carxi);

    void delete(String[] carxiId);
}
