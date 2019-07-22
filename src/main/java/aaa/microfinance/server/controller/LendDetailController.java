package aaa.microfinance.server.controller;

import aaa.microfinance.server.entity.LendDetail;
import aaa.microfinance.server.service.LendDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 放款明细控制器
 * @Date: 2019/7/22 10:02
*/
@RestController
@RequestMapping("/server")
public class LendDetailController {
    @Autowired
    private LendDetailService lendDetailService;

    /** 
    * @Description:  
    * @Param: []
    * @return: java.util.List<aaa.microfinance.server.entiry.LendDetail> 
    */
    @RequestMapping("/lend/lendDetails")
    public List<LendDetail> lendDetails(){
        List<LendDetail> lendDetails = lendDetailService.lendDetails();
        System.out.println("开启放款查询方法");
        System.out.println(lendDetails);
        return lendDetails;
    }
}
