package com.atlunk.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//本服务会自哦对那个注册进eureka服务中
public class DeptProvide8001_App {
	
	public static void main(String args[]) {
		SpringApplication.run(DeptProvide8001_App.class, args);
	}
}
