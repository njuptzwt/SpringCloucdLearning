package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
@SpringBootApplication
public class ZullProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZullProxyApplication.class, args);
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
