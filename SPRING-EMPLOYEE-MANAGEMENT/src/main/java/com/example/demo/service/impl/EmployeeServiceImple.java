package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;
import com.example.demo.service.IEmployeeService;
@Service
public class EmployeeServiceImple implements IEmployeeService{
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public Integer saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp).getEmpId();
	}

	@Override
	public List<Employee> getAllEmployees() { 
		List<Employee> list = repo.findAll(); 
		list.forEach(emp -> System.out.println(emp)); // Print each employee's details return list;
		return list;
		}
	

	@Override
	public Employee getOneEmployee(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void updateEmployee(Employee emp) {
		repo.save(emp);
//		// TODO Auto-generated method stub
//		Employee existingEmployee = repo.findById(emp.getEmpId()).orElse(null); 
//		// Update the fields if (existingEmployee != null) 
//		{ 
//		existingEmployee.setEmpName(emp.getEmpName());
//		existingEmployee.setSalary(emp.getEmpSal()); // Save the updated employee
//		repo.save(existingEmployee);
		
		}

	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}
		
	}




