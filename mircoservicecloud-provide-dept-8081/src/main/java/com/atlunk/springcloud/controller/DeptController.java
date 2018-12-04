package com.atlunk.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atlunk.springcloud.entities.Dept;
import com.atlunk.springcloud.service.DeptService;

@RestController//使用rest风格，返回json串
public class DeptController {
	
	@Autowired
	private DeptService service;
	
	@RequestMapping(value="dept/add", method=RequestMethod.POST)
	public boolean addDept(@RequestBody Dept dept) {
		return service.addDept(dept);
	}

	//http://127.0.0.1:8001/dept/get/1
	@RequestMapping(value="dept/get/{id}", method=RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) {
		return service.get(id);
	}

	//http://127.0.0.1:8001/dept/list
	//http://192.168.0.5:8001/dept/list
	@RequestMapping(value="dept/list", method=RequestMethod.GET)
	public List<Dept> list() {
		return service.list();
	}

	
}
