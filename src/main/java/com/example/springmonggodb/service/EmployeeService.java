package com.example.springmonggodb.service;

import java.util.List;

import com.example.springmonggodb.dto.EmployeeDto;
import com.example.springmonggodb.model.Employee;

public interface EmployeeService {
    Employee createEmployee(EmployeeDto employeeDto);

    Employee getEmployeeById(String Id);
    
    List<Employee> getEmployeeListByName(String name);

    Employee updateEmployee(EmployeeDto employeeDto);

    void deleteEmployeeById(String Id);
}
