package aaa.microfinance.server.entity;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

/**
 * @Description: 放款明细实体类
 * @Date: 2019/7/22 9:58
*/
public class LendDetail {
    private String ordernumber;
    private Long customerid;
    private String cusname;
    private Long loanmount;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private Date orderdate;
    private String bystages;
    private Double totalpay;
    private Integer loanstatus;

    //一对多映射,映射分期详情实体类
    private List<Installment> installment;

    public List<Installment> getInstallment() {
        return installment;
    }

    public void setInstallment(List<Installment> installment) {
        this.installment = installment;
    }

    public Integer getLoanstatus() {
        return loanstatus;
    }

    public void setLoanstatus(Integer loanstatus) {
        this.loanstatus = loanstatus;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public Long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Long customerid) {
        this.customerid = customerid;
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

    public String getBystages() {
        return bystages;
    }

    public void setBystages(String bystages) {
        this.bystages = bystages;
    }

    public Double getTotalpay() {
        return totalpay;
    }

    public void setTotalpay(Double totalpay) {
        this.totalpay = totalpay;
    }
}
