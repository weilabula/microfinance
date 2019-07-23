package aaa.microfinance.server.dao;


import aaa.microfinance.server.entity.Rate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 利率管理dao接口
 */
@Mapper
@Repository
public interface RateDao {

    /**
     * 查询所有利率
     * @return
     */
    public List<Rate> listAllRates();

    /**
     * 保存利率
     * @return
     */
    public Integer saveRate(@Param("rate") Rate rate);

    /**
     * 修改利率
     * @return
     */
    public Integer updateRate(@Param("rate") Rate rate);

    /**
     * 删除利率
     */
    public Integer deleteRate(@Param("rate") Rate rate);

}
