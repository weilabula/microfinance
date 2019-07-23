package aaa.microfinance.server.dao;

import aaa.microfinance.server.common.DefaultMsg;
import aaa.microfinance.server.entity.Loanorders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 贷款审核管理dao接口
 */
@Mapper
@Repository
public interface LoanreviewDao {

    /**
     * 查询待审核的信息
     * @return
     */
    public List<Loanorders> findloanreview(@Param("keyword") String keyword);

    /**
     * 审核通过后
     */
    public void passAfter(Loanorders row);

    /**
     * 查询不同分期数的利率
     */
    public Double findrate(int type);
    /**
     * 保存分期详情
     */
    public int savepass(int i,Double v,String ordernumber);
    /**
     * 审核驳回后
     */
    public int rejectAfter(Loanorders row);
}
