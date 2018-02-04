package com.example.demo;

import com.example.demo.CouponService.CouponServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 18362 on 2018/2/3.
 */
@RestController
@RequestMapping("/coupon")
public class CouponController {
    @Autowired
    CouponServiceImpl couponService;
    @RequestMapping("/insert/{userId}")
    public String insert(@PathVariable Long userId){
        couponService.insert(userId);
        return "success";
    }
}
