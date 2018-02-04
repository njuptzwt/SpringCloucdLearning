package com.example.demo.CouponService;

import com.example.demo.CouponApplication;
import com.example.demo.Entity.UserCoupon;
import com.example.demo.Entity.UserCouponReponsity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 18362 on 2018/2/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CouponApplication.class)
public class CouponServiceImplTest {
    @Autowired
    UserCouponReponsity userCouponReponsity;
    @Test
    public void insert() throws Exception {
        UserCoupon userCoupon=new UserCoupon();
        userCoupon.setCoupon_id(1);
        userCoupon.setUser_id(1);
        userCouponReponsity.save(userCoupon);
    }

}