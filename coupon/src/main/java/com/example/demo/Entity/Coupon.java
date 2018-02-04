package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by 18362 on 2018/2/3.
 */
@Entity
public class Coupon {
    @Id
    @Column(name="CouponId",nullable = false)
    Long couponid;
    @Column
    Date date;
    @Column
    Double price;
    @Column
    String name;

    public Coupon() {
    }

    public Coupon(Long couponid, Date date, Double price, String name) {
        this.couponid = couponid;
        this.date = date;
        this.price = price;
        this.name = name;
    }

    public Long getCouponid() {
        return couponid;
    }

    public void setCouponid(Long couponid) {
        this.couponid = couponid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
