package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Customer;

@Service
public interface CustomerService {
	
	public List<Customer> getAllCustomer();
	public Customer getCustomer(Long id);
	public Customer createCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public String deleteCustomer(Long id);

}
