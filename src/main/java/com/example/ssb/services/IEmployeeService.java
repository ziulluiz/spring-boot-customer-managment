package com.example.ssb.services;

import com.example.ssb.entities.Customer;
import com.example.ssb.entities.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAll();
    Employee getById(Long id);
    void remove(Long id);
    void save(Employee employee);
}
