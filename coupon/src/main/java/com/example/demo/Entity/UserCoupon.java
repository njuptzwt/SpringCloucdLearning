package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by 18362 on 2018/2/3.
 */
@Entity
public class UserCoupon {
    @Id
    @GeneratedValue
    long User_cou_id;
    @Column
    long user_id;
    @Column
    long coupon_id;

    public long getUser_cou_id() {
        return User_cou_id;
    }

    public void setUser_cou_id(long user_cou_id) {
        User_cou_id = user_cou_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getCoupon_id() {
        return coupon_id;
    }

    public void setCoupon_id(long coupon_id) {
        this.coupon_id = coupon_id;
    }

    public UserCoupon() {
    }

    public UserCoupon(long user_id, long coupon_id) {
        this.user_id = user_id;
        this.coupon_id = coupon_id;
    }
}
