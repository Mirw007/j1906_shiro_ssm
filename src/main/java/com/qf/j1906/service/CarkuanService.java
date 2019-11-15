package com.qf.j1906.service;

import com.qf.j1906.pojo.Carkuan;
import com.qf.j1906.vo.DataGridResult;

import java.util.List;

public interface CarkuanService {

    List<Carkuan> getCarkuan();

    DataGridResult findItemsByPage(String carxinName, String brandName, String carType, String carxiName, int page, int pageSize);

    void deleteById(int carkuanId);

    Carkuan getCarkuanById(int carkuanId);

    void updateCarkuanById(Carkuan carkuan);

    void addCarxi(Carkuan carkuan);

    void delete(String[] carkuanId);
}
