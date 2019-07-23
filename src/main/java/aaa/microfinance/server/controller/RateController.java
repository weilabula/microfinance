package aaa.microfinance.server.controller;


import aaa.microfinance.server.common.DefaultMsg;
import aaa.microfinance.server.entity.Rate;
import aaa.microfinance.server.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("server/Rate")
public class RateController {
    @Autowired
    private RateService rateService;

    @RequestMapping("/listAllRates")
    public List<Rate> listAllRates(){
        List<Rate> rates = rateService.listAllRates();
        System.out.println(123);
        return rates;
    }


    @RequestMapping("/saveOrUpdate")
    public DefaultMsg saveOrUpdate(@RequestBody Rate rate){
        DefaultMsg defaultMsg = rateService.saveOrUpdate(rate);
        return defaultMsg;
    }

    @RequestMapping("/deleteRate")
    public DefaultMsg deleteRate(@RequestBody Rate rate){
        DefaultMsg defaultMsg = rateService.deleteRate(rate);
        return defaultMsg;
    }
}
