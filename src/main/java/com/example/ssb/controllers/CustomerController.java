package com.example.ssb.controllers;

import com.example.ssb.entities.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;
import java.awt.*;

@RestController
public class CustomerController {
    @GetMapping("/api/customers")
    public List<Customer> getAll(){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer());
        return customers;
    }
}
