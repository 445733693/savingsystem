package com.fis.savingsystem.pojo;

import java.util.Date;

public class Record {
    private Integer id;

    private String userId;

    private Long capitalBefore;

    private Long capitalAfter;

    private Date date;

    private Integer status;

    private Long money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getCapitalBefore() {
        return capitalBefore;
    }

    public void setCapitalBefore(Long capitalBefore) {
        this.capitalBefore = capitalBefore;
    }

    public Long getCapitalAfter() {
        return capitalAfter;
    }

    public void setCapitalAfter(Long capitalAfter) {
        this.capitalAfter = capitalAfter;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }
}