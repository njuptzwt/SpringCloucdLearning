package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 18362 on 2018/2/5.
 */
@RestController
public class ConfigController {
    @Value("#{'${illegalIp}'.split(',')}")
    List<String> illegalIp1;
    @Autowired
    ConfigProperties configProperties;
    @RequestMapping("/config")
    public String config(){
        return illegalIp1.get(0);
    }
}
