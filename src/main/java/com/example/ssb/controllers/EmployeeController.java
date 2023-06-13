package com.example.ssb.controllers;

import com.example.ssb.entities.Customer;
import com.example.ssb.entities.Employee;
import com.example.ssb.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EmployeeController {
    @Autowired
    private IEmployeeService service;
    @GetMapping("/api/employee")
    public List<Employee> getAll(){
        return service.getAll();
    }
    @GetMapping("/api/employee/{id}")
    public Employee getById(@PathVariable String id) {

        return service.getById(Long.parseLong(id));
    }
    @DeleteMapping("/api/employee/{id}")
    public void remove(@PathVariable String id){

        service.remove(Long.parseLong(id));
    }
    @PostMapping("/api/employee")
    public  void save(@RequestBody Employee employee){
        service.save(employee);
    }

}
