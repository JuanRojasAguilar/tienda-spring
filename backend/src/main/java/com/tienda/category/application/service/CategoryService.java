package com.tienda.category.application.service;

import java.util.Optional;
import java.util.Set;

import com.tienda.category.domain.entity.Category;

public interface CategoryService {
    Set<Category> findAll();
    Optional<Category> findById(Long id);
    Category save(Category category);
    Category update(Long id, Category category);
    Optional<Category> delete(Long id);
}
