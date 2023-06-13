package com.example.ssb.services;

import com.example.ssb.entities.Customer;
import com.example.ssb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepository repository;
    @Override
    public List<Customer> getAll(){
        return repository.findAll();
    }
    @Override
    public Customer getById(Long id) {

        return (Customer) repository.findById(id).get();
    }
    @Override
    public void remove(Long id){

        repository.deleteById(id);
    }
    @Override
    public  void save(Customer customer){

        repository.save(customer);
    }
}
