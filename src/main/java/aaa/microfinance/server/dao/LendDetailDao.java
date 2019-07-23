package aaa.microfinance.server.dao;

import aaa.microfinance.server.entity.Installment;
import aaa.microfinance.server.entity.LendDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: 放款明细dao接口
 * @Date: 2019/7/22 10:36
*/
@Mapper
@Repository
public interface LendDetailDao {

    /**
    * @Description: 获取所有放款明细
    * @Param: []
    * @return: java.util.List<aaa.microfinance.server.entiry.LendDetail>
    */
    public List<LendDetail> listLendDetails();

    /**
    * @Description:  通过客户id查询客户名字
    * @Param: [customerid]
    * @return: java.lang.String
    */
    public String findCusameByCusid(Long customerid);
    
    /** 
    * @Description: 根据订单编号查询分期详情 
    * @Param: [ordernumber]
    * @return: java.util.List<aaa.microfinance.server.entiry.Installment> 
    */  
    public List<Installment> findInstallmentByOrdernumber(String ordernumber);

    /**
    * @Description: 根据分期数查询对应利息率，进而计算需付总利息
    * @Param: [ordernumber]
    * @return: java.lang.Double
    */
    public Double findRateByBystages(Integer bystages);

    /**
    * @Description: 根据客户id和客户名字模糊查询放款明细
    * @Param: [customerid, cusname]
    * @return: java.util.List<aaa.microfinance.server.entity.LendDetail>
    */
    public List<LendDetail> findLendDetail(Long customerid,String cusname);
}
