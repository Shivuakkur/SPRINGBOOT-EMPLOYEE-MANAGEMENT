package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface IEmployeeService {
	Integer saveEmployee(Employee emp);
	
	List<Employee> getAllEmployees();
//	
	Employee getOneEmployee(Integer id);
//	
	void updateEmployee(Employee emp);
//	
//	void deleteEmployee(Integer id);

	void deleteEmployee(Integer id);

}
