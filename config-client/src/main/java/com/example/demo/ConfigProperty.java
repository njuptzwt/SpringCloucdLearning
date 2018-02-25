package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 18362 on 2018/2/5.
 */
@Component
@RefreshScope
@ConfigurationProperties(prefix = "illegalIp")
@EnableConfigurationProperties(ConfigProperty.class)
public class ConfigProperty {
    private List<String> illegalIplist=new ArrayList<>();
    public List<String> getIllegalIplist(){
        return this.illegalIplist;
    }
    public void setIllegalIplist(List<String> illegalIplist) {
        this.illegalIplist = illegalIplist;
    }
}
