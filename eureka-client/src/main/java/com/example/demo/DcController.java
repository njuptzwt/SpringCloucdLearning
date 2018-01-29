package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 18362 on 2018/1/28.
 */
@RestController
public class DcController {
    @Autowired
    DiscoveryClient discoveryClient;
    @Value("${server.port}")
    String port;

    @RequestMapping("/qc")
    public String home() {
        return "Hello world ,port:" + port;
    }
    @GetMapping("/dc")
    public String dc() throws InterruptedException {
//        Thread.sleep(5000L);
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
