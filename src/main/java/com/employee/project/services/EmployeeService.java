package com.employee.project.services;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.employee.project.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> getAllEmployee();

	void deleteEmployee(long id);

	Employee getEmpById(long id);

	List<Employee> findByName(String name);
	
	List<Employee> findByNameAndEmail(String name,String email);
	List<Employee> findByNameOrEmail(String name ,String email);
	List<Employee> findByDepartment(String department);
	

}
