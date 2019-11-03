package com.anand.shop.repository;

import org.springframework.data.repository.CrudRepository;

import com.anand.shop.model.Item;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ItemRepository extends CrudRepository<Item, Integer> {

}
