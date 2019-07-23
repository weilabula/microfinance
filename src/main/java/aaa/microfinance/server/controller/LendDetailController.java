package aaa.microfinance.server.controller;

import aaa.microfinance.server.entity.LendDetail;
import aaa.microfinance.server.service.LendDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 放款明细控制器
 * @Date: 2019/7/22 10:02
*/
@RestController
@RequestMapping("server")
public class LendDetailController {
    @Autowired
    private LendDetailService lendDetailService;

    /** 
    * @Description:  
    * @Param: []
    * @return: java.util.List<aaa.microfinance.server.entiry.LendDetail> 
    */
    @RequestMapping("/lend/listLendDetails")
    public List<LendDetail> listLendDetails(){
        List<LendDetail> lendDetails = lendDetailService.listLendDetails();
        return lendDetails;
    }
    
    /** 
    * @Description: 根据客户id和客户名字模糊查询放款明细
    * @Param: []
    * @return: java.util.List<aaa.microfinance.server.entity.LendDetail> 
    */
    @RequestMapping("/lend/findLendDetail")
    public List<LendDetail> findLendDetail(@RequestBody LendDetail lendDetail){
        List<LendDetail> lendDetails = lendDetailService.findLendDetail(lendDetail.getCustomerid(), lendDetail.getCusname());
        return lendDetails;
    }
}
