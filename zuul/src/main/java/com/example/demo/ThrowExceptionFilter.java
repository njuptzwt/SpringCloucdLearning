package com.example.demo;

import com.netflix.zuul.ZuulFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 18362 on 2018/1/30.
 */
public class ThrowExceptionFilter extends ZuulFilter {
    private static Logger log = LoggerFactory.getLogger(ThrowExceptionFilter.class);
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 10;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() {
        log.info("This is a pre filter, it will throw a RuntimeException");
        doSomething();
        return null;
    }
    private void doSomething() {
        throw new RuntimeException("Exist some errors...");
    }

}
