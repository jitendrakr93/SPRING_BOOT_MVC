package com.jit.boot.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.jit.boot.model.Employee;


public interface IEmployeeService {

	Integer saveEmployee(Employee e);
	List<Employee> getAllEmployees();
	void deleteEmployee(Integer id);
	//Optional<Employee> getOneEmployee(Integer id);
	Employee getOneEmployee(Integer id);
	void updateEmployee(Employee e);
	boolean isEmployeeEmailExist(String empMail);
	
	Page<Employee> getAllEmployees(Pageable pageable);
}
