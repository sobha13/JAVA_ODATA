package com.slo.SpringBoot1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	private PersonDao dao;
	@RequestMapping("/getall")
	public List<PersonPojo> getAll(){
		List<PersonPojo> pp=dao.findAll();
		return pp;
		
	}
    @RequestMapping(value="findById/{id}")
	public PersonPojo getById(@PathVariable Integer id){
    	Optional<PersonPojo> pp=dao.findById(id);
		return pp.get();
		
	}
}
