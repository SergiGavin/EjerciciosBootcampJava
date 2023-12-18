package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entities.*;
import com.example.repository.*;
import com.example.services.*;

import jakarta.validation.constraints.AssertFalse.List;


@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	
	public java.util.List<Customer> findAllCustomers(){
		return customerRepository.findAll();
	}
}
