package aaa.microfinance.server.service;


import aaa.microfinance.server.common.DefaultMsg;
import aaa.microfinance.server.entity.Rate;

import java.util.List;

/**
 * 利率管理Service接口
 */
public interface RateService {
    /**
     * 查询所有利率
     * @return
     */
    public List<Rate> listAllRates();

    /**
     * 保存或修改利率
     * @param rate
     * @return
     */
    public DefaultMsg saveOrUpdate(Rate rate);

    /**
     * 删除利率
     */
    public DefaultMsg deleteRate(Rate rate);
}
