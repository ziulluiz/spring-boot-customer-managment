package com.example.ssb.services;


import com.example.ssb.entities.Employee;
import com.example.ssb.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }
    @Override
    public Employee getById(Long id) {

        return (Employee) employeeRepository.findById(id).get();
    }
    @Override
    public void remove(Long id){

        employeeRepository.deleteById(id);
    }
    @Override
    public  void save(Employee employee){

        employeeRepository.save(employee);
    }

}
