package aaa.microfinance.server.entiry;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Description: 还款管理实体类
 * @Date: 2019/7/19 15:10
*/
public class Rerecords {
    private Long id;
    private Long cusid;
    private String cusname;
    private Long loanmount;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private Date orderdate;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private Date reimdate;
    private Long bystages;
    private Integer loanstatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCusid() {
        return cusid;
    }

    public void setCusid(Long cusid) {
        this.cusid = cusid;
    }

    public String getCusname() {
        return cusname;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname;
    }

    public Long getLoanmount() {
        return loanmount;
    }

    public void setLoanmount(Long loanmount) {
        this.loanmount = loanmount;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public Date getReimdate() {
        return reimdate;
    }

    public void setReimdate(Date reimdate) {
        this.reimdate = reimdate;
    }

    public Long getBystages() {
        return bystages;
    }

    public void setBystages(Long bystages) {
        this.bystages = bystages;
    }

    public Integer getLoanstatus() {
        return loanstatus;
    }

    public void setLoanstatus(Integer loanstatus) {
        this.loanstatus = loanstatus;
    }
}
