package com.example.demo.CouponService;

import com.example.demo.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 18362 on 2018/2/3.
 */
@Service
public class CouponServiceImpl implements CouponService {
    @Autowired
    UserCouponReponsity userCouponReponsity;
    @Override
    public void insert(Long userid) throws InterruptedException {
        Thread.sleep(5000L);
        UserCoupon userCoupon=new UserCoupon();
        userCoupon.setCoupon_id(1);
        userCoupon.setUser_id(userid);
        userCouponReponsity.save(userCoupon);
    }
}
