package com.example.springmonggodb.repository;

import java.util.List;

import com.example.springmonggodb.model.Employee;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String>{

    List<Employee> findByName(String name);
    
}
