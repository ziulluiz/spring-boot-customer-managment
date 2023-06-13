package com.example.ssb.controllers;

import com.example.ssb.entities.Customer;
import com.example.ssb.entities.Employee;
import com.example.ssb.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;
    @GetMapping("/api/employees")
    public List<Employee> getAll(){
        return iEmployeeService.getAll();
    }
    @GetMapping("/api/employees/{id}")
    public Employee getById(@PathVariable String id) {

        return iEmployeeService.getById(Long.parseLong(id));
    }
    @DeleteMapping("/api/employees/{id}")
    public void remove(@PathVariable String id){

        iEmployeeService.remove(Long.parseLong(id));
    }
    @PostMapping("/api/employee")
    public  void save(@RequestBody Employee employee){
        iEmployeeService.save(employee);
    }

}
