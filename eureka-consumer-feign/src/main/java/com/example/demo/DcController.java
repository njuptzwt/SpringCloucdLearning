package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 18362 on 2018/1/28.
 */
@RestController
public class DcController {
    @Autowired
    DcClient dcClient;

    @RequestMapping("/consumer")
    public String dc() {
        return dcClient.consumer();
    }
    @RequestMapping("/consumer1")
    public String dc1(){
        return dcClient.consumer1();
    }
}
