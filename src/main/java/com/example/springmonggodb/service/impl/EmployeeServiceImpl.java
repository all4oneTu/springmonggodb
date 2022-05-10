package com.example.springmonggodb.service.impl;

import java.util.List;

import com.example.springmonggodb.dto.EmployeeDto;
import com.example.springmonggodb.model.Employee;
import com.example.springmonggodb.repository.EmployeeRepository;
import com.example.springmonggodb.service.EmployeeService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    
    @Override
    public Employee createEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDto, employee);
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(String id ) {
        return employeeRepository.findById(id).get();
        
    }

    @Override
    public List<Employee> getEmployeeListByName(String name) {
        return employeeRepository.findByName(name);
    }

    @Override
    public Employee updateEmployee(EmployeeDto employeeDto) {
        Employee employee = getEmployeeById(employeeDto.getId());
        BeanUtils.copyProperties(employeeDto, employee);
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployeeById(String Id) {
        employeeRepository.deleteById(Id);
    }

   
}
