package aaa.microfinance.server.service;

import aaa.microfinance.server.common.DefaultMsg;
import aaa.microfinance.server.entity.Loanorders;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 贷款审核service接口
 */
public interface LoanreviewService{
    /**
     * 查询待审核的信息
     * @return
     */
    public List<Loanorders> findloanreview(String keyword);
    /**
     * 审核通过后
     */
    public DefaultMsg passAfter(Loanorders row);
    /**
     * 审核驳回后
     */
    public DefaultMsg rejectAfter(Loanorders row);
}
