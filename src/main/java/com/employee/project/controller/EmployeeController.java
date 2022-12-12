package com.employee.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.employee.project.entity.Employee;
import com.employee.project.services.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/first")
	public String homePage() {
		return "homepage";
	}
	@RequestMapping("/addEmp")
	public String addEmployee(@ModelAttribute("Employee") Employee employee) {
		employeeService.saveEmployee(employee);
		return "homepage";
		
	}
	@RequestMapping("/getEmployees")
	public String getEmployee(ModelMap modelMap) {
		List<Employee> allEmployee = employeeService.getAllEmployee();
			modelMap.addAttribute("employee", allEmployee);
		return "result";
		
	}
	@RequestMapping("/delete")
	public String deleteEmployee(@RequestParam("id") long id,ModelMap modelMap) {
		employeeService.deleteEmployee(id);
		List<Employee> allEmployee = employeeService.getAllEmployee();
		modelMap.addAttribute("employee", allEmployee);
		return "result";
	}
	@RequestMapping("/getById")
	public String updateEmp(@RequestParam("id") long id,ModelMap modelMap) {
		Employee employee = employeeService.getEmpById(id);
		modelMap.addAttribute("employee", employee);
		return "updatePage";
	}
	@RequestMapping("/UpdateEmp")
	public String updateEmployees(@ModelAttribute("Employee") Employee employee) {
		employeeService.saveEmployee(employee);
		return "updatePage";
	}
	@RequestMapping("/getEmpByName")
	public String getEmpByName(@RequestParam("name") String name,ModelMap modelMap) {
		List<Employee> findByName = employeeService.findByName(name);
		modelMap.addAttribute("employee", findByName);
		return "result";
		
	}
	@RequestMapping("/getEmpByNameAndEmail")
	public String getEmpByNameAndEmail(@RequestParam("name") String name,@RequestParam("email") String email,ModelMap modelMap) {
		List<Employee> findByNameAndEmail = employeeService.findByNameAndEmail(name, email);
		modelMap.addAttribute("employee", findByNameAndEmail);
		return "result";
		
	}
	@RequestMapping("/getEmpByNameOrEmail")
	public String getEmpByNameOrEmail(@RequestParam("name") String name,@RequestParam("email") String email,ModelMap modelMap) {
		List<Employee> findByNameOrEmail = employeeService.findByNameOrEmail(name, email);
		modelMap.addAttribute("employee", findByNameOrEmail);
		return "result";
	}
	@RequestMapping("/getEmpByDept")
	public String getEmpBydept(@RequestParam("department") String department,ModelMap modelMap) {
		List<Employee> findByDepartment = employeeService.findByDepartment(department);
		modelMap.addAttribute("employee", findByDepartment);
		return "result";
		
	}
}
