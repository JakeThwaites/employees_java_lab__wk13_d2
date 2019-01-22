package com.codeclan.employees.Employees.Repositories;

import com.codeclan.employees.Employees.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
