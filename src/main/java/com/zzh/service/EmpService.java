package com.zzh.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zzh.pojo.Emp;

public interface EmpService {
	public List<Emp> getAll();
	public Emp findById(Integer id);
	public Emp findByIdAndName(Integer id, String name);
	public List<Emp> query(Emp emp);
}
