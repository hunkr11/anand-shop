package com.anand.shop.repository;

import org.springframework.data.repository.CrudRepository;

import com.anand.shop.model.Stock;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface StockRepository extends CrudRepository<Stock, Integer> {

}
