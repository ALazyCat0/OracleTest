package com.zzh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzh.dao.EmpDao;
import com.zzh.pojo.Emp;
import com.zzh.service.EmpService;
@Service("empService")
class EmpServiceImpl implements EmpService{
	@Autowired
	private EmpDao empDao;

	@Override
	public List<Emp> getAll() {
	
		return empDao.getAll();
	}

	@Override
	public Emp findById(Integer id) {
		// TODO Auto-generated method stub
		return empDao.findById(id);
	}

	@Override
	public Emp findByIdAndName(Integer id, String name) {
		// TODO Auto-generated method stub
		return empDao.findByIdAndName(id, name);
	}

	@Override
	public List<Emp> query(Emp emp) {
		// TODO Auto-generated method stub
		return empDao.query(emp);
	}







}
