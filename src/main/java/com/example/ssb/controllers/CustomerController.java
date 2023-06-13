package com.example.ssb.controllers;

import com.example.ssb.entities.Customer;
import com.example.ssb.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
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
}
