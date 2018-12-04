package com.atlunk.springcloud.service;

import java.util.List;

import com.atlunk.springcloud.entities.Dept;

public interface DeptService {
	
	public boolean addDept(Dept dept);
	
	public Dept get(Long id);
	
	public List<Dept> list();
}
