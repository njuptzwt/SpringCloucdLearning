package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RefreshScope
@RestController
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Config_ClientApplication {
    @Value("#{'${illegalIp}'.split(',')}")
    List<String> illegalIp;
    @RequestMapping("/config")
    public String home() {
        return "illegalIp:"+illegalIp.get(1);
    }

    public static void main(String[] args) {
        SpringApplication.run(Config_ClientApplication.class, args);
    }

}
