package com.hanyun.hack.generator.test.domain;

import java.util.Date;

/**
 * <pre>
 * ━━━━━━神兽出没━━━━━━
 * �??�?��┓�?�??┏┓
 * �??┏┛┻━━━┛┻┓\n * �??┃�?�??�??�??┃\n * �??┃�?�??━�?�??┃\n * �??┃�?┳┛�?��┳�?┃\n * �??┃�?�??�??�??┃\n * �??┃�?�??┻�?�??┃\n * �??┃�?�??�??�??┃\n * �??┗━┓�?�??┏━┛\n * �??�??┃�?�??┃神兽保�? 永无BUG!
 * �??�??┃�?�??┃Code is far away from bug with the animal protecting
 * �??�??┃�?�??┗━━━┓\n * �??�??┃�?�??�??�??┣┓
 * �??�??┃�?�??�??�??┏┛
 * �??�??┗┓┓┏━┳┓┏┛\n * �??�??�?��┫┫�?��┫┫
 * �??�??�?��┻┛�?��┻┛
 * ━━━━━━感觉萌萌哒━━━━━━\n * </pre>
 */
public class UserInfo {

    private Long id;

    private String userId;

    private String wxId;

    private String phone;

    private String password;

    private String name;

    private Boolean gender;

    private String cardNo;

    private Boolean cardType;

    private String country;

    private String province;

    private String city;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Boolean getCardType() {
        return cardType;
    }

    public void setCardType(Boolean cardType) {
        this.cardType = cardType;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}