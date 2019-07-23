package aaa.microfinance.server.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @Description: 还款确认实体类
 * @Date: 2019/7/23 10:40
*/
public class Reconfirm {
    private Long id;
    private Long cusid;
    private String cusname;
    private String ordernumber;
    private Integer bystages;
    private Integer payperiods;
    private Double currentpay;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date reimdate;
    private Integer status;

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

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public Integer getBystages() {
        return bystages;
    }

    public void setBystages(Integer bystages) {
        this.bystages = bystages;
    }

    public Integer getPayperiods() {
        return payperiods;
    }

    public void setPayperiods(Integer payperiods) {
        this.payperiods = payperiods;
    }

    public Double getCurrentpay() {
        return currentpay;
    }

    public void setCurrentpay(Double currentpay) {
        this.currentpay = currentpay;
    }

    public Date getReimdate() {
        return reimdate;
    }

    public void setReimdate(Date reimdate) {
        this.reimdate = reimdate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
