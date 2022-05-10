package com.example.springmonggodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Employee")
public class Employee {
    @Id
    private String id;
    private String name;
    private Integer age;
    private Double salary;
    private Boolean isActive;
}
