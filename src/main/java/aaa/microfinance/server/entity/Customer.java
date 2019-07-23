package aaa.microfinance.server.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @Description: 客户实体类
 * @Date: 2019/7/22 15:21
*/
public class Customer {
    private Long id;
    private Long loginid;
    private String cusname;
    private String sex;
    private String telphone;
    private Date birthday;
    private String address;
    private String preaddress;
    private String idnumber;
    private String education;
    private String opcondtion;
    private String nation;
    private String income;
    private String loanuse;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private Date regtime;
    private String Idfrontpath;
    private String idnegativepath;
    private Integer creditid;
    private Integer auditstatus;
    private Integer state;
    private String banknumber;

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public Long getLoginid() {
        return loginid;
    }

    public void setLoginid(Long loginid) {
        this.loginid = loginid;
    }

    public String getCusname() {
        return cusname;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPreaddress() {
        return preaddress;
    }

    public void setPreaddress(String preaddress) {
        this.preaddress = preaddress;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getOpcondtion() {
        return opcondtion;
    }

    public void setOpcondtion(String opcondtion) {
        this.opcondtion = opcondtion;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getLoanuse() {
        return loanuse;
    }

    public void setLoanuse(String loanuse) {
        this.loanuse = loanuse;
    }

    public String getIdfrontpath() {
        return Idfrontpath;
    }

    public void setIdfrontpath(String idfrontpath) {
        Idfrontpath = idfrontpath;
    }

    public String getIdnegativepath() {
        return idnegativepath;
    }

    public void setIdnegativepath(String idnegativepath) {
        this.idnegativepath = idnegativepath;
    }

    public Integer getCreditid() {
        return creditid;
    }

    public void setCreditid(Integer creditid) {
        this.creditid = creditid;
    }

    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getBanknumber() {
        return banknumber;
    }

    public void setBanknumber(String banknumber) {
        this.banknumber = banknumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
