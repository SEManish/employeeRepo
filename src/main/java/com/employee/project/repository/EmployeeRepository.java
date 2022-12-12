package com.employee.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.employee.project.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	public List<Employee> findByName(String name);
	public List<Employee> findByNameAndEmail(String name,String email);
	public List<Employee> findByNameOrEmail(String name ,String email);
	
	@Query("select u from Employee u where u.department=:n")
	public List<Employee> findByDepartment(@Param("n") String department);
	
	
}
