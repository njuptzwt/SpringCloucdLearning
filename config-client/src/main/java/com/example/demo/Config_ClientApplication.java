package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Config_ClientApplication {
    @Value("${illegalIp}")
    String illegalIp;

    @RequestMapping("/config")
    public String home() {
        return "illegalIp:" + illegalIp;
    }

    public static void main(String[] args) {
        SpringApplication.run(Config_ClientApplication.class, args);
    }
}
