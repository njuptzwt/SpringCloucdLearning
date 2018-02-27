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
        //Thread.sleep(5000L);
        //对注册的用户发放不同的优惠券
        for (int i = 0; i < 4; i++) {
            UserCoupon userCoupon = new UserCoupon();
            userCoupon.setCoupon_id(i + 1);
            userCoupon.setUser_id(userid);
            userCouponReponsity.save(userCoupon);
        }
    }
}
