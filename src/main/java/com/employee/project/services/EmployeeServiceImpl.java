package com.employee.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.employee.project.entity.Employee;
import com.employee.project.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepo;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepo.save(employee);
		
	}
	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> findAll = employeeRepo.findAll();
		return findAll;
		//Sort.by("id").descending()
	}
	@Override
	public void deleteEmployee(long id) {
		employeeRepo.deleteById(id);		
	}
	@Override
	public Employee  getEmpById(long id) {
		Optional<Employee> findById = employeeRepo.findById(id);
		Employee employee = findById.get();
		return employee;
	}
	
	public List<Employee> findByName(String name) {
		List<Employee> findByName = employeeRepo.findByName(name);
		return findByName;
		
	}
	@Override
	public List<Employee> findByNameAndEmail(String name, String email) {
		List<Employee> findByNameAndEmail = employeeRepo.findByNameAndEmail(name, email);
		return findByNameAndEmail;
	}
	@Override
	public List<Employee> findByNameOrEmail(String name, String email) {
		List<Employee> findByNameOrEmail = employeeRepo.findByNameOrEmail(name, email);
		return findByNameOrEmail;
	}
	@Override
	public List<Employee> findByDepartment(String department) {
		List<Employee> findByDepartment = employeeRepo.findByDepartment(department);
		return findByDepartment;
	}
	

}
