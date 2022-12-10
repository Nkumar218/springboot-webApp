package com.springboot.springbootwebApp.service;

import java.util.List;
import com.springboot.springbootwebApp.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	//Employee saveEmployee(Employee employee);
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
