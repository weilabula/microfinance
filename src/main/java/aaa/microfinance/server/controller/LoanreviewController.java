package aaa.microfinance.server.controller;

import aaa.microfinance.server.common.DefaultMsg;
import aaa.microfinance.server.entity.Loanorders;
import aaa.microfinance.server.service.LoanreviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/server")
public class LoanreviewController {

    @Autowired
    private LoanreviewService loanreviewService;

    /**
     * 查询待审核的信息
     * @return
     */
    @RequestMapping("/loan/loanAuditlist")
    @ResponseBody
    public List<Loanorders> findloanreview(String keyword){
      return   loanreviewService.findloanreview(keyword);
    }

    /**
     * 审核通过后
     */
    @RequestMapping("/loan/passAfter")
    @ResponseBody
    public DefaultMsg passAfter(@RequestBody Loanorders row){
        return loanreviewService.passAfter(row);
    }
    /**
     * 审核被驳回
     */
    @RequestMapping("/loan/rejectAfter")
    @ResponseBody
    public DefaultMsg rejectAfter(@RequestBody Loanorders row){
        return loanreviewService.rejectAfter(row);
    }

}
