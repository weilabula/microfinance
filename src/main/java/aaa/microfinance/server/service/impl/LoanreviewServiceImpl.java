package aaa.microfinance.server.service.impl;

import aaa.microfinance.server.common.DefaultMsg;
import aaa.microfinance.server.dao.LoanreviewDao;
import aaa.microfinance.server.entity.Loanorders;
import aaa.microfinance.server.service.LoanreviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 贷款审核service实现类
 */
@Service
@Transactional
public class LoanreviewServiceImpl implements LoanreviewService {
    @Autowired
    private LoanreviewDao loanreviewDao;
    /**
     * 查询待审核的信息
     * @return
     */
    public List<Loanorders> findloanreview(String keyword){
        return loanreviewDao.findloanreview(keyword);
    }

    /**
     * 审核通过后
     */
    public DefaultMsg passAfter(Loanorders row){
        DefaultMsg dm = new DefaultMsg();
        try {
            int random = (int) (1 + Math.random() * (3 - 1 + 1));
            row.setBankaccountid(random);
            //传递贷款信息
            loanreviewDao.passAfter(row);
            //查询利率
            Double rate = loanreviewDao.findrate(row.getBystages());
            for (int i=1;i<=row.getBystages();i++){
                double v =(row.getLoanmount()+row.getLoanmount() * rate)/row.getBystages();
                loanreviewDao.savepass(i,v,row.getOrdernumber());
            }

            dm.setSuccess(1);
            dm.setError("");
        }catch (Exception e){
            dm.setSuccess(0);
            dm.setError("操作出现异常");
            e.printStackTrace();
        }
        return dm;
    }
    /**
     * 审核通过后
     */
    public DefaultMsg rejectAfter(Loanorders row){
        DefaultMsg dm = new DefaultMsg();
        try {
            //传递贷款信息
            loanreviewDao.rejectAfter(row);
            dm.setSuccess(1);
            dm.setError("");
        }catch (Exception e){
            dm.setSuccess(0);
            dm.setError("操作出现异常");
            e.printStackTrace();
        }
        return dm;
    }
}
