package com.codeclan.employees.Employees.Controllers;

import com.codeclan.employees.Employees.Models.Employee;
import com.codeclan.employees.Employees.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }

}
