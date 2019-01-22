package com.codeclan.employees.Employees;

import com.codeclan.employees.Employees.Models.Department;
import com.codeclan.employees.Employees.Models.Employee;
import com.codeclan.employees.Employees.Models.Project;
import com.codeclan.employees.Employees.Repositories.DepartmentRepository;
import com.codeclan.employees.Employees.Repositories.EmployeeRepository;
import com.codeclan.employees.Employees.Repositories.ProjectRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeesApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canSaveEmployeeAndDepartment(){
		Department it = new Department("IT");
		departmentRepository.save(it);
		Employee ernest = new Employee("Ernest", 22, "ABC123", "ernie_boyy@hotmail.com", it);
		employeeRepository.save(ernest);
	}

	@Test
	public void canAddEmployeesAndProjects(){
		Department it = new Department("IT");
		departmentRepository.save(it);
		Employee ernest = new Employee("Ernest", 22, "ABC123", "ernie_boyy@hotmail.com", it);
		employeeRepository.save(ernest);
		Employee jake = new Employee("Jake", 26, "COO1!", "jakeybabe99@hotmail.co.nz", it);
		employeeRepository.save(jake);
		Project project1 = new Project("Project Ninja", 1);
		projectRepository.save(project1);
		project1.addEmployee(ernest);
		project1.addEmployee(jake);
		Project project2 = new Project("Project Boring", 400);
		projectRepository.save(project2);
		project2.addEmployee(ernest);
		projectRepository.save(project1);
		projectRepository.save(project2);
	}

}

