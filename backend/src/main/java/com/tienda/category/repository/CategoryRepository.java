package com.tienda.category.repository;

import org.springframework.data.repository.CrudRepository;

import com.tienda.category.domain.entity.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {
    
}
