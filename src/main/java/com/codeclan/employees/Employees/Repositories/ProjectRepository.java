package com.codeclan.employees.Employees.Repositories;

import com.codeclan.employees.Employees.Models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
