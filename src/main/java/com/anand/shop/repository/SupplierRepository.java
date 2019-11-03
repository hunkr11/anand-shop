package com.anand.shop.repository;

import org.springframework.data.repository.CrudRepository;

import com.anand.shop.model.Category;
import com.anand.shop.model.Supplier;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface SupplierRepository extends CrudRepository<Supplier, Integer> {

}
