package com.example.ssb.services;

import com.example.ssb.entities.Employee;
import com.example.ssb.entities.Supplier;
import com.example.ssb.repository.EmployeeRepository;
import com.example.ssb.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SupplierService implements ISupplierService {
    @Autowired
    private SupplierRepository supplierRepository;
    @Override
    public List<Supplier> getAll(){
        return supplierRepository.findAll();
    }
    @Override
    public Supplier getById(Long id) {

        return (Supplier) supplierRepository.findById(id).get();
    }
    @Override
    public void remove(Long id){

        supplierRepository.deleteById(id);
    }
    @Override
    public  void save(Supplier supplier){
        supplierRepository.save(supplier);
    }
}
