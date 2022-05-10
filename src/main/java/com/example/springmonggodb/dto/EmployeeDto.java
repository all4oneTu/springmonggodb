package com.example.springmonggodb.dto;
import lombok.Data;
@Data
public class EmployeeDto {
    private String id;
    private String name;
    private Integer age;
    private Double salary;
    private Boolean isActive;
}
