package com.slo.SpringBoot1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentDao studentdao;
	
	@RequestMapping("/getAllStudents")
	public List<StudentPojo> getAll(){
		List<StudentPojo> sp =studentdao.findAll();
		return sp;	
	}
	@RequestMapping("/getStudent/{id}")
	public StudentPojo getById(Integer id){
		Optional<StudentPojo> sp=studentdao.findById(id);
		return sp.get();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
