package com.atlunk.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atlunk.springcloud.dao.DeptDao;
import com.atlunk.springcloud.entities.Dept;
import com.atlunk.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService{
	
	@Autowired
	private DeptDao deptDao;
	
	public boolean addDept(Dept dept) {
		return deptDao.addDept(dept);
	}

	public Dept get(Long id) {
		return deptDao.findById(id);
	}

	public List<Dept> list() {
		return deptDao.findAll();
	}

}
