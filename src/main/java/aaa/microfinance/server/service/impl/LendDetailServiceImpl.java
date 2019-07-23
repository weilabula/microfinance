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
    public List<LendDetail> listLendDetails(){
        List<LendDetail> lendDetails = lendDetailDao.listLendDetails();
        for(LendDetail lendDetail:lendDetails){
            //根据分期数查询对应利息率，进而计算需付总利息
            Integer bystages = lendDetail.getBystages();
            Double rate = lendDetailDao.findRateByBystages(bystages);
            Long loanmount = lendDetail.getLoanmount();
            lendDetail.setTotalpay(loanmount*(1+rate));
            //获取分期详情
            String ordernumber = lendDetail.getOrdernumber();
            System.out.println(ordernumber);
            List<Installment> installments = lendDetailDao.findInstallmentByOrdernumber(ordernumber);
            lendDetail.setInstallment(installments);

        }
        return lendDetails;
    }

    /**
     * @Description: 根据客户id和客户名字模糊查询放款明细
     * @Param: []
     * @return: java.util.List<aaa.microfinance.server.entiry.LendDetail>
     */
    public List<LendDetail> findLendDetail(Long customerid,String cusname){
        List<LendDetail> lendDetails = lendDetailDao.findLendDetail(customerid,cusname);
        for(LendDetail lendDetail:lendDetails){
            //根据分期数查询对应利息率，进而计算需付总利息
            Integer bystages = lendDetail.getBystages();
            Double rate = lendDetailDao.findRateByBystages(bystages);
            Long loanmount = lendDetail.getLoanmount();
            lendDetail.setTotalpay(loanmount*(1+rate));
            //获取分期详情
            String ordernumber = lendDetail.getOrdernumber();
            List<Installment> installments = lendDetailDao.findInstallmentByOrdernumber(ordernumber);
            lendDetail.setInstallment(installments);

        }
        return lendDetails;
    }
}
