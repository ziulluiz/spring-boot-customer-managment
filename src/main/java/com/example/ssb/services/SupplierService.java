package com.example.ssb.services;

import com.example.ssb.entities.Supplier;
import com.example.ssb.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
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
