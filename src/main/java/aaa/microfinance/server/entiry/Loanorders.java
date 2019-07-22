package aaa.microfinance.server.entiry;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @Description: 贷款订单表实体类
 * @Date: 2019/7/20 17:07
*/
public class Loanorders {
    private Long lid;
    private Long customerid;
    private String ordernumber;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private Date orderdate;
    private Double loanmount;
    private Integer loanway;
    private Integer bystages;
    private Integer overdue;
    private Integer bankaccountid;
    private String banknumber;
    private Integer loanstatus;

    public Long getLid() {
        return lid;
    }

    public void setLid(Long lid) {
        this.lid = lid;
    }

    public Long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Long customerid) {
        this.customerid = customerid;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public Double getLoanmount() {
        return loanmount;
    }

    public void setLoanmount(Double loanmount) {
        this.loanmount = loanmount;
    }

    public Integer getLoanway() {
        return loanway;
    }

    public void setLoanway(Integer loanway) {
        this.loanway = loanway;
    }

    public Integer getBystages() {
        return bystages;
    }

    public void setBystages(Integer bystages) {
        this.bystages = bystages;
    }

    public Integer getOverdue() {
        return overdue;
    }

    public void setOverdue(Integer overdue) {
        this.overdue = overdue;
    }

    public Integer getBankaccountid() {
        return bankaccountid;
    }

    public void setBankaccountid(Integer bankaccountid) {
        this.bankaccountid = bankaccountid;
    }

    public String getBanknumber() {
        return banknumber;
    }

    public void setBanknumber(String banknumber) {
        this.banknumber = banknumber;
    }

    public Integer getLoanstatus() {
        return loanstatus;
    }

    public void setLoanstatus(Integer loanstatus) {
        this.loanstatus = loanstatus;
    }

    @Override
    public String toString() {
        return "Loanorders{" +
                "lid=" + lid +
                ", customerid=" + customerid +
                ", ordernumber='" + ordernumber + '\'' +
                ", orderdate=" + orderdate +
                ", loanmount=" + loanmount +
                ", loanway=" + loanway +
                ", bystages=" + bystages +
                ", overdue=" + overdue +
                ", bankaccountid=" + bankaccountid +
                ", banknumber='" + banknumber + '\'' +
                ", loanstatus=" + loanstatus +
                '}';
    }
}
