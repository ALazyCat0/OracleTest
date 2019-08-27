package com.zzh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zzh.pojo.Emp;
import com.zzh.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	private EmpService empService;

	@RequestMapping("getall")
	public List<Emp> getAll() {

		return empService.getAll();

	}
	@GetMapping("findById/{id}")
	public Emp findById(@PathVariable Integer id) {
		return empService.findById(id);
	}
	@GetMapping("findByIdAndName")
	public Emp findByIdAndName(Integer id,String name) {
		System.out.println("通过id和name查找");
		System.out.println(id+name);
		return empService.findByIdAndName(id, name);
	}
	/**多条件查询
	 * @param emp
	 * @return
	 */
	@PostMapping("query")
	public List<Emp> qurry(@RequestBody Emp emp){
		System.out.println(emp);
		 List<Emp> query = empService.query(emp);	
		 System.out.println(query);
		return query;
	}
	
	
	/**多条件查询测试
	 * @return
	 */
	@RequestMapping("query1")
	public List<Emp> qurry(){
		Emp emp = new Emp();
		emp.setId(1); emp.setName("张子豪");
		return empService.query(emp);	
	}
}
