package com.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Customer;
import com.demo.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

	CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@PostMapping("/insert")
	public String insertCustomer(@RequestBody Customer customer) {

		return customerService.insertCustomer(customer);

	}

	@PostMapping("/insertMultiple")
	public String insertMultipleCustomers(@RequestBody List<Customer> customers) {

		return customerService.insertMultipleCustomers(customers);
	}

	@GetMapping("/get")
	public List<Customer> customerList() {
		return customerService.getCustomers();
	}

	@GetMapping("/{id}")
	public Customer customerById(@PathVariable int id) {
		return customerService.getCustomerById(id);
	}

	@PutMapping("/update")
	public String customerUpdate(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}

	@DeleteMapping("/delete/{id}")
	public String customerdeleteById(@PathVariable int id) {
		return customerService.deleteCustomerById(id);
	}

	@GetMapping("/byfirstname/{firstName}")
	public List<Customer> getCustomerByFirstName(@PathVariable String firstName) {
		return customerService.getCustomersByFirstName(firstName);

	}

	@GetMapping("/bylastname/{lastName}")
	public List<Customer> getCustomerByLastName(@PathVariable String lastName) {
		return customerService.getCustomersByLastName(lastName);
	}

	@GetMapping("/bylessthanage/{age}")
	public List<Customer> getCustomersByLessThanAge(@PathVariable int age) {
		return customerService.getCustomersByLessThanAge(age);
	}

	@GetMapping("/bygreaterthanage/{age}")
	public List<Customer> getCustomersByGreaterThanAge(@PathVariable int age) {
		return customerService.getCustomersByGreaterThanAge(age);
	}

	@GetMapping("/byage/{age}")
	public List<Customer> getCustomersByAge(@PathVariable int age) {
		return customerService.getCustomersByAge(age);
	}

	@GetMapping("/byemail/{email}")
	public List<Customer> getCustomersByemail(@PathVariable String email) {
		return customerService.getCustomersByEmail(email);
	}

	@GetMapping("/bymobile/{mobile}")
	public List<Customer> getCustomersByMobile(@PathVariable String mobile) {
		return customerService.getCustomersByMobile(mobile);
	}

	@PutMapping("firstname/{id}")
	public String updateCustomerByFirstName(@PathVariable int id, @RequestBody Map<String, String> request) {
		String firstName = request.get("firstName");
		return customerService.updateCustomerFirstName(id, firstName);

	}

	@PutMapping("lastname/{id}")
	public String updateCustomerByLastName(@PathVariable int id, @RequestBody Map<String, String> request) {
		String lastName = request.get("lastName");
		return customerService.updateCustomerFirstName(id, lastName);

	}

	@PutMapping("email/{id}")
	public String updateCustomerEmail(@PathVariable int id, @RequestBody Map<String, String> request) {
		String email = request.get("email");
		return customerService.updateCustomerEmail(id, email);
	}
	
	@PutMapping("mobile/{id}")
	public String updateCustomerMobile(@PathVariable int id, @RequestBody Map<String , String> request) {
		String mobile = request.get("mobile");
		return customerService.updateCustomerMobile(id, mobile);
	}
	
	
	@PutMapping("age/{id}")
	public String updateCustomerAge(@PathVariable int id, @RequestBody Map<String , Integer> request) {
		Integer age = request.get("age");
		return customerService.updateCustomerAge(id, age);
	}
	
	@GetMapping("/firstnames")
	public List<String> getFirstNames(){
		return customerService.getCustomerFirstNames();
	}
	
	@GetMapping("/lastnames")
	public List<String> getLastNames(){
		return customerService.getCustomerLastNames();
	}
}
