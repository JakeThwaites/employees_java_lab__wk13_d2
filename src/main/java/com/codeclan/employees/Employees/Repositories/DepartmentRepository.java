package com.codeclan.employees.Employees.Repositories;

import com.codeclan.employees.Employees.Models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
