package aaa.microfinance.server.service.impl;


import aaa.microfinance.server.common.DefaultMsg;
import aaa.microfinance.server.dao.RateDao;
import aaa.microfinance.server.entity.Rate;
import aaa.microfinance.server.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class RateServiceImpl implements RateService {

    @Autowired
    private RateDao rateDao;

    @Override
    public List<Rate> listAllRates() {
        return rateDao.listAllRates();
    }

    @Override
    public DefaultMsg saveOrUpdate(Rate rate) {
        Integer flag;
        DefaultMsg dmg = new DefaultMsg();
        if(rate.getId() == null){
            flag = rateDao.saveRate(rate);
        }else{
            flag = rateDao.updateRate(rate);
        }
        if(flag == 0||flag == null){
            dmg.setSuccess(0);
            dmg.setError("操作失败");
        }
        return dmg;
    }

    @Override
    public DefaultMsg deleteRate(Rate rate) {
        DefaultMsg dmg = new DefaultMsg();
        Integer flag = rateDao.deleteRate(rate);
        if(flag == 0 || flag == null){
            dmg.setSuccess(0);
            dmg.setError("操作失败");
        }
        return dmg;

    }


}
