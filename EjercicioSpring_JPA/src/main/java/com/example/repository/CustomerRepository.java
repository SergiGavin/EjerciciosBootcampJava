package com.example.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{}
