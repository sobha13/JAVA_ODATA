package com.innovapptive.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.innovapptive.dao.CustomerDao;

import co.innovapptive.pojo.CustomerPojo;

@RestController
public class CustomerController {
	@Autowired
	private CustomerDao cdao;
	
	@RequestMapping("/getallcustomers")
	public List<CustomerPojo> getAllCustomers(){
		List<CustomerPojo> cp=cdao.findAll();
		return cp;
	}
	@RequestMapping("/getcustomer")
	public CustomerPojo getCustomer(@PathVariable Integer id){
		Optional<CustomerPojo> cp=cdao.findById(id);
		return cp.get();
		
	}

}
