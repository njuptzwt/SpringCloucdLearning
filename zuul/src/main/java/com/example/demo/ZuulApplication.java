package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@EnableZuulProxy
@EnableDiscoveryClient
@SpringCloudApplication
@SpringBootApplication
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}
	@Bean
	public AccessFilter accessFilter(){
		return new AccessFilter();
	}
	@Bean
	public AddResponseFilter addResponseFilter(){
		return new AddResponseFilter();
	}
	@Bean
	public ModifyResponseBodyFilter modifyResponseBodyFilter(){
		return new ModifyResponseBodyFilter();
	}
	@Bean
	public ThrowExceptionFilter throwExceptionFilter(){
		return new ThrowExceptionFilter();
	}
	@Bean
	public ErrorFilter errorFilter(){
		return new ErrorFilter();
	}
}
