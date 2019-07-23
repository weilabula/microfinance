package aaa.microfinance.server.service;

import aaa.microfinance.server.entity.LendDetail;

import java.util.List;
/**
 * @Description: 放款明细service接口
 * @Date: 2019/7/22 10:38
*/
public interface LendDetailService {

    /**
     * @Description: 获取所有放款明细
     * @Param: []
     * @return: java.util.List<aaa.microfinance.server.entiry.LendDetail>
     */
    public List<LendDetail> listLendDetails();

    /**
     * @Description: 根据客户id和客户名字模糊查询放款明细
     * @Param: []
     * @return: java.util.List<aaa.microfinance.server.entiry.LendDetail>
     */
    public List<LendDetail> findLendDetail(Long customerid,String cusname);
}
