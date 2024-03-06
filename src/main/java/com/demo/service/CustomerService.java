package com.demo.service;

import java.util.List;

import com.demo.entity.Customer;

public interface CustomerService {

	String insertCustomer(Customer customer);
	
	String insertMultipleCustomers(List<Customer> customers);

	List<Customer> getCustomers();
	
	Customer getCustomerById(int id);
	
	String updateCustomer(Customer customer);
	
	String deleteCustomerById(int id);
	
	List<Customer> getCustomersByFirstName(String firstName);
	
	List<Customer> getCustomersByLastName(String lastName);
	
	List<Customer> getCustomersByLessThanAge(int age);
	
	List<Customer> getCustomersByGreaterThanAge(int age);
	
	List<Customer> getCustomersByAge(int age);
	
	List<Customer> getCustomersByEmail(String email);
	
	List<Customer> getCustomersByMobile(String mobile);
	
	String updateCustomerFirstName(int id, String firstName);
	
	String updateCustomerLastName(int id, String lastName);
	
	String updateCustomerEmail(int id, String email);
	
	String updateCustomerMobile(int id, String mobile);
	
	String updateCustomerAge(int id, int age);
	
	List<String> getCustomerFirstNames();
	
	List<String> getCustomerLastNames();
}
