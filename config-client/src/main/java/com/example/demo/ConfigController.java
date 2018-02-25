package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 18362 on 2018/2/5.
 */
@RestController
public class ConfigController {
    @Autowired
    ConfigProperty configProperty;
    @RequestMapping("/config/list")
    public String home(){
        return configProperty.getIllegalIplist().get(0);
    }
}
