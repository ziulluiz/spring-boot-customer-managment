package com.example.ssb.services;


import com.example.ssb.entities.Supplier;

import java.util.List;

public interface ISupplierService {
    List<Supplier> getAll();
    Supplier getById(Long id);
    void remove(Long id);
    void save(Supplier supplier);

}
