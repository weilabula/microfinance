package aaa.microfinance.server.entity;
/**
 * @Description: 分期详情实体类
 * @Date: 2019/7/22 12:04
*/
public class Installment {
    private Long id;
    private String customerid;
    private Double ins_num;
    private Integer ins_status;
    private Integer ins_money;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public Double getIns_num() {
        return ins_num;
    }

    public void setIns_num(Double ins_num) {
        this.ins_num = ins_num;
    }

    public Integer getIns_status() {
        return ins_status;
    }

    public void setIns_status(Integer ins_status) {
        this.ins_status = ins_status;
    }

    public Integer getIns_money() {
        return ins_money;
    }

    public void setIns_money(Integer ins_money) {
        this.ins_money = ins_money;
    }
}
