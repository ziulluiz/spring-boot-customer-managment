package com.example.ssb.controllers;

import com.example.ssb.entities.Customer;
import com.example.ssb.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
        //@CrossOrigin(origins = "http://localhost:8080/api")
public class CustomerController {
    @Autowired
    private ICustomerService service;
    @GetMapping("/api/customers")
    public List<Customer> getAll(){
        return service.getAll();
    }
    @GetMapping("/api/customers/{id}")
    public Customer getById(@PathVariable String id) {
        return service.getById(Long.parseLong(id));
    }
    @DeleteMapping("/api/customers/{id}")
    public void remove(@PathVariable String id){
        service.remove(Long.parseLong(id));
    }
    @PostMapping("/api/customers")
    public  void save(@RequestBody Customer customer){
        service.save(customer);
    }
}
