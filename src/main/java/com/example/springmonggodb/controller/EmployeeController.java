package com.example.springmonggodb.controller;

import java.util.List;

import com.example.springmonggodb.dto.EmployeeDto;
import com.example.springmonggodb.model.Employee;
import com.example.springmonggodb.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    } 
    @PostMapping("add")
    public ResponseEntity<Employee> addEmployee(@RequestBody EmployeeDto employeeDto) {
        Employee employee = employeeService.createEmployee(employeeDto);
        return ResponseEntity.ok(employee);
    }

    @GetMapping("get")
    public ResponseEntity<Employee> findEmployeeById(@RequestParam("id") String id) {
        Employee employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }

    @GetMapping("getAll")
    public ResponseEntity<List<Employee>> findAllEmployeeByName(@RequestParam("name") String name) {
        List<Employee> employeeList = employeeService.getEmployeeListByName(name);
        return ResponseEntity.ok(employeeList);
    }
    @PutMapping("update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody EmployeeDto employeeDto) {
        Employee employee = employeeService.updateEmployee(employeeDto);
        return ResponseEntity.ok(employee);
    }

    @DeleteMapping("delete")
    public ResponseEntity<String> deleteEmployee(@RequestParam("id") String id) {
        employeeService.deleteEmployeeById(id);
        return ResponseEntity.ok("Employee deleted successfully");
    }
}
