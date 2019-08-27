package com.zzh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zzh.pojo.Emp;
@Mapper
public interface EmpDao {
	@Select("select * from employees")
	public List<Emp> getAll();
	public Emp findById(Integer id);
	public Emp findByIdAndName(@Param("id") Integer id,@Param("username")String name);
	public List<Emp> query(Emp emp);
}
