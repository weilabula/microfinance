package aaa.microfinance.server.entity;
/**
 * @Description: 分期详情实体类
 * @Date: 2019/7/22 12:04
*/
public class Installment {
    private Long id;
    private String customerid;
    private Integer ins_num;
    private Integer ins_status;
    private Double ins_money;

    @Override
    public String toString() {
        return "Installment{" +
                "id=" + id +
                ", customerid='" + customerid + '\'' +
                ", ins_num='" + ins_num + '\'' +
                ", ins_status=" + ins_status +
                ", ins_money=" + ins_money +
                '}';
    }

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

    public Integer getIns_num() {
        return ins_num;
    }

    public void setIns_num(Integer ins_num) {
        this.ins_num = ins_num;
    }

    public Integer getIns_status() {
        return ins_status;
    }

    public void setIns_status(Integer ins_status) {
        this.ins_status = ins_status;
    }

    public Double getIns_money() {
        return ins_money;
    }

    public void setIns_money(Double ins_money) {
        this.ins_money = ins_money;
    }
}
