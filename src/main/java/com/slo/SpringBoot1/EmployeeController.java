package com.slo.SpringBoot1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeDao edao;
	@RequestMapping("/getallemployees")
	public List<EmployeePojo> getAllEmployees(){
		List<EmployeePojo> ep=edao.findAll();
		return ep;
	}
	@RequestMapping("/getemployee/{id}")
	public EmployeePojo getEmployee(@PathVariable Integer id){
		Optional<EmployeePojo> ep=edao.findById(id);
		return ep.get();
		 
	 }
	

}
