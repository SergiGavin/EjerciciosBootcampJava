package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import lombok.extern.java.Log;
import com.example.entities.Customer;
import com.example.services.CustomerService;

@Log
@RestController
@RequestMapping(value = "/1.0.0")
public class CustomerController {
	@Autowired(required = false)
	CustomerService customerService;
	@RequestMapping(value = "/customers")
	public java.util.List<Customer> getCustomers(){
		return customerService.findAllCustomers();
		
	}
}
