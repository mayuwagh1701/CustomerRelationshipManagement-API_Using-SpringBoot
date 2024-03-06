package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.entity.Customer;

@Repository
public class CustomerDao {

	@Autowired
	SessionFactory sf;

	public String insertCustomer(Customer customer) {
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		session.save(customer);
		t.commit();
		session.close();

		return "Customer insert Successfully";

	}

	public String insertMultipleCustomers(List<Customer> customers) {
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		for (Customer customer : customers) {
			session.save(customer);
		}
		t.commit();
		session.close();

		return "customer are inserted Successfully";

	}

	public List<Customer> getCustomersList() {
		Session session = sf.openSession();
		return session.createQuery("from Customer").list();

	}

	public Customer getCustomerById(int id) {
		Session session = sf.openSession();
		Customer customer = session.get(Customer.class, id);
		return customer;

	}

	public String updateCustomer(Customer customer) {
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		session.update(customer);
		t.commit();
		session.close();

		return "customer updated Successfully";

	}

	public String deleteCustomerById(int id) {
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		session.delete(customer);
		t.commit();
		session.close();
		return "customer delete Successfully";

	}

	public List<Customer> getCustomersByFirstName(String firstName) {
		Session session = sf.openSession();
		Query<Customer> customers = session.createQuery("from Customer c where c.firstName=:firstName", Customer.class);
		customers.setParameter("firstName", firstName);
		List<Customer> list = customers.list();
		return list;

	}

	public List<Customer> getCustomersByLastName(String lastName) {
		Session session = sf.openSession();
		Query<Customer> customers = session.createQuery("from Customer c where c.lastName =: lastName", Customer.class);
		customers.setParameter("lastName", lastName);
		List<Customer> list = customers.list();
		return list;
	}

	public List<Customer> getCustomersByLessThanAge(int age) {
		Session session = sf.openSession();
		Query<Customer> customers = session.createQuery("from Customer c where c.age<: age", Customer.class);
		customers.setParameter("age", age);
		List<Customer> list = customers.list();
		return list;

	}

	public List<Customer> getCustomersByGreaterThanAge(int age) {
		Session session = sf.openSession();
		Query<Customer> customers = session.createQuery("from Customer c where c.age>: age", Customer.class);
		customers.setParameter("age", age);
		List<Customer> list = customers.list();
		return list;
	}

	public List<Customer> getCustomersByAge(int age) {
		Session session = sf.openSession();
		Query<Customer> customers = session.createQuery("from Customer c where c.age =: age", Customer.class);
		customers.setParameter("age", age);
		List<Customer> list = customers.list();

		return list;

	}

	public List<Customer> getCustomersByEmail(String email) {
		Session session = sf.openSession();
		Query<Customer> customers = session.createQuery("from Customer c where c.email =: email", Customer.class);
		customers.setParameter("email", email);
		List<Customer> list = customers.list();

		return list;

	}

	public List<Customer> getCustomersByMobile(String mobile) {
		Session session = sf.openSession();
		Query<Customer> customers = session.createQuery("from Customer c where c.mobile =: mobile", Customer.class);
		customers.setParameter("mobile", mobile);
		List<Customer> list = customers.list();

		return list;

	}

	public String updateCustomerFirsName(int id, String firstName) {

		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		customer.setFirstName(firstName);
		t.commit();
		session.close();

		return "firstname updated successfully";

	}

	
	public String updateCustomerLastName(int id, String lastName) {

		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		customer.setLastName(lastName);
		t.commit();
		session.close();

		return "lastname updated successfully";

	}
	
	
	public String updateCustomerEmail(int id, String email) {
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		customer.setEmail(email);
		t.commit();
		session.close();
		
		return "email updated Successfully";
	}
	

	public String updateCustomerMobile(int id, String mobile) {
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		customer.setMobile(mobile);
		t.commit();
		session.close();
		
		return "mobile updated Successfully";
	}
	
	
	public String updateCustomerAge(int id, int age) {
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		customer.setAge(age);
		t.commit();
		session.close();
		
		return "age updated Successfully";
	}
	
	
	public List<String> getCustomersFirstNames(){
		Session session = sf.openSession();
		 return session.createQuery("select c.firstName from Customer c").list();
	}
	
	public List<String> getCustomersLastNames(){
		Session session = sf.openSession();
		return session.createQuery("select c.lastName from Customer c").list();
	}

}
