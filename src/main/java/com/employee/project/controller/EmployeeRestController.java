package com.employee.project.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.project.entity.Employee;
import com.employee.project.services.EmployeeService;

@RestController
@RequestMapping(path="/EmployeeRest")
//produces = "application/xml"
public class EmployeeRestController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping()
	//produces = "application/xml"
	//@GetMapping(headers="Accept=*/*",produces={"application/xml", "application/json", "String"})
	public List<Employee> getData(){
		List<Employee> allEmployee = employeeService.getAllEmployee();
		return allEmployee;
		
	}
	@PostMapping()
	//consumes="application/xml"
	public Employee postData(@RequestBody Employee employee) { 
	Employee SaveEmp = employeeService.saveEmployee(employee);
	return SaveEmp;
	}
	
	@DeleteMapping("/{id}")
	public void deleteData(@PathVariable long id) {
		employeeService.deleteEmployee(id);
	}
	@PutMapping
	public Employee updateData(@RequestBody Employee employee) {
	return  employeeService.saveEmployee(employee);
	 
	}
//	@GetMapping()
//	public List<Employee> EmpByName(@PathVariable("Name") String name) {
//		List<Employee> findByName = employeeService.findByName(name);
//		return findByName;
//	}
	
}
