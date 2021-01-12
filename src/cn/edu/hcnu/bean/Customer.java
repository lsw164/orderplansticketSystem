package cn.edu.hcnu.bean;

import java.util.Date;
import java.util.Set;

public class Customer {
    private String id;   //无业务意义
    private String name;//旅客
    private String customerType;//旅客类型
    private Date birthDate;//出生日期
    private String phone;//手机号
    private String cardId;//身份证号
    private Set<Order> order;
    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
}
