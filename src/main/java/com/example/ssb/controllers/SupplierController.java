package com.example.ssb.controllers;

import com.example.ssb.entities.Customer;
import com.example.ssb.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class SupplierController {
    @Autowired
    private ICustomerService service;
    @GetMapping("/api/suppliers")
    public List<Customer> getAll(){
        return service.getAll();
    }
    @GetMapping("/api/suppliers/{id}")
    public Customer getById(@PathVariable String id) {
        return service.getById(Long.parseLong(id));
    }
    @DeleteMapping("/api/suppliers/{id}")
    public void remove(@PathVariable String id){
        service.remove(Long.parseLong(id));
    }
    @PostMapping("/api/suppliers")
    public  void save(@RequestBody Customer customer){
        service.save(customer);
    }
}
