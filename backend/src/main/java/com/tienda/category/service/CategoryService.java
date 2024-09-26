package com.tienda.category.service;

import java.util.Optional;
import java.util.Set;

import com.tienda.category.domain.entity.Category;

public interface CategoryService {
    Set<Category> findAll();
    Optional<Category> findById(Integer id);
    Category save(Category category);
    Category update(Integer id, Category category);
    Optional<Category> delete(Integer id);
}
