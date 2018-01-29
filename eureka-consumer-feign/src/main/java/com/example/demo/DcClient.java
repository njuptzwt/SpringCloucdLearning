package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 18362 on 2018/1/28.
 */
@FeignClient("eureka-client")
public interface DcClient {
    @RequestMapping("/dc")
    String consumer();
    @RequestMapping("/qc")
    String consumer1();
}
