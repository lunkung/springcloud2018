package com.atlunk.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.atlunk.springcloud.entities.Dept;

@RestController
public class DeptController_Consumer {
	
	private static final String REST_URL_PREFIX = "http://127.0.0.1:8001";
	
	//应为此为消费者访问端，不需要service层,不做业务逻辑处理
	//直接使用RestTemplate来进行 rest的 调用和发出
	//是客户端的模板工具集。提供了多种远程调用Http
	/*
	 * (url,requestMap,ResponseBean.class)
	 * url->rest请求地址
	 * requestMap->请求参数
	 * ResponseBean.class->Http响应转换被转换成的类型
	 */
	
	@Autowired
	private RestTemplate restTemplate;
	
	//http://127.0.0.1:80/consumer/dept/add?dname=Springcloud2018
	@RequestMapping(value="consumer/dept/add")
	public boolean add(Dept dept) {
		return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, Boolean.class);
	}
	
	//http://127.0.0.1:80/consumer/dept/get/1
	@RequestMapping(value="consumer/dept/get/{id}")
	public Dept get(@PathVariable("id")Long id) {
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/" +id, Dept.class);
	}
	
	//http://127.0.0.1:80/consumer/dept/list
	//http://192.168.0.5:80/consumer/dept/list	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="consumer/dept/list")
	public List<Dept> list() {
		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
	}
	
	
}
