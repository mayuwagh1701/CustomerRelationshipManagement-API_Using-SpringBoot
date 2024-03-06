package com.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.dao.CustomerDao;
import com.demo.entity.Customer;
import com.demo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	CustomerDao customerdao;

	public CustomerServiceImpl(CustomerDao customerdao) {
		super();
		this.customerdao = customerdao;
	}

	@Override
	public String insertCustomer(Customer customer) {

		return customerdao.insertCustomer(customer);
	}

	@Override
	public List<Customer> getCustomers() {

		return customerdao.getCustomersList();
	}

	@Override
	public Customer getCustomerById(int id) {

		return customerdao.getCustomerById(id);
	}

	@Override
	public String updateCustomer(Customer customer) {

		return customerdao.updateCustomer(customer);
	}

	@Override
	public String deleteCustomerById(int id) {

		return customerdao.deleteCustomerById(id);
	}

	@Override
	public String insertMultipleCustomers(List<Customer> customers) {

		return customerdao.insertMultipleCustomers(customers);
	}

	@Override
	public List<Customer> getCustomersByFirstName(String firstName) {

		return customerdao.getCustomersByFirstName(firstName);
	}

	@Override
	public List<Customer> getCustomersByLastName(String lastName) {

		return customerdao.getCustomersByLastName(lastName);
	}

	@Override
	public List<Customer> getCustomersByLessThanAge(int age) {

		return customerdao.getCustomersByLessThanAge(age);
	}

	@Override
	public List<Customer> getCustomersByGreaterThanAge(int age) {

		return customerdao.getCustomersByGreaterThanAge(age);
	}

	@Override
	public List<Customer> getCustomersByAge(int age) {
		return customerdao.getCustomersByAge(age);
	}

	@Override
	public List<Customer> getCustomersByEmail(String email) {

		return customerdao.getCustomersByEmail(email);
	}

	@Override
	public List<Customer> getCustomersByMobile(String mobile) {

		return customerdao.getCustomersByMobile(mobile);
	}

	@Override
	public String updateCustomerFirstName(int id, String firstName) {

		return customerdao.updateCustomerFirsName(id, firstName);
	}

	@Override
	public String updateCustomerLastName(int id, String lastName) {

		return customerdao.updateCustomerLastName(id, lastName);
	}

	@Override
	public String updateCustomerEmail(int id, String email) {
		
		return customerdao.updateCustomerEmail(id, email);
	}

	@Override
	public String updateCustomerMobile(int id, String mobile) {
		
		return customerdao.updateCustomerMobile(id, mobile);
	}

	@Override
	public String updateCustomerAge(int id, int age) {
		
		return customerdao.updateCustomerAge(id, age);
	}

	@Override
	public List<String> getCustomerFirstNames() {
		return customerdao.getCustomersFirstNames();
	}

	@Override
	public List<String> getCustomerLastNames() {
		return customerdao.getCustomersLastNames();
	}

}
