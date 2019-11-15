package com.qf.j1906.vo;

import lombok.Data;

import java.util.List;

/**
 * @author 飞
 */
@Data
public class DataGridResult {
/**总记录数*/
    private long total;
    /**当前页的结果集*/
  private List<?> rows;
}
