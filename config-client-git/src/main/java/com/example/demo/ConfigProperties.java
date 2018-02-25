package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 18362 on 2018/2/5.
 */
@Component
@ConfigurationProperties(prefix = "illegalIp")
public class ConfigProperties {
    private List<String> illegalIp=new ArrayList<>();

    public List<String> getIllegalIp() {
        return illegalIp;
    }

    public void setIllegalIp(List<String> illegalIp) {
        this.illegalIp = illegalIp;
    }
}
