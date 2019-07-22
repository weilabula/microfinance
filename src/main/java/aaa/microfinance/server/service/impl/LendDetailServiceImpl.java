package aaa.microfinance.server.service.impl;

import aaa.microfinance.server.dao.LendDetailDao;
import aaa.microfinance.server.entity.Installment;
import aaa.microfinance.server.entity.LendDetail;
import aaa.microfinance.server.service.LendDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description: 放款明细service接口
 * @Date: 2019/7/22 10:37
 */
@Service
@Transactional
public class LendDetailServiceImpl implements LendDetailService {

    @Autowired
    private LendDetailDao lendDetailDao;

    /**
     * @Description: 获取所有放款明细
     * @Param: []
     * @return: java.util.List<aaa.microfinance.server.entiry.LendDetail>
     */
    public List<LendDetail> lendDetails(){
        List<LendDetail> lendDetails = lendDetailDao.lendDetails();
        for(LendDetail lendDetail:lendDetails){
            //获取客户id，根据id查询客户名字
            Long customerid = lendDetail.getCustomerid();
            String cusname = lendDetailDao.findCusameByCusid(customerid).getCusname();
            lendDetail.setCusname(cusname);
            //根据订单编号查询分期详情
            String ordernumber = lendDetail.getOrdernumber();
            List<Installment> installment = lendDetailDao.findInstallmentByOrdernumber(ordernumber);
            lendDetail.setInstallment(installment);
        }
        return lendDetails;
    }
}
