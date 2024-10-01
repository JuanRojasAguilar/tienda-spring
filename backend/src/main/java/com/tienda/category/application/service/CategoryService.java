package com.tienda.category.application.service;

import java.util.List;
import java.util.Optional;

import com.tienda.category.domain.entity.Category;

public interface CategoryService {
    List<Category> findAll();
    Optional<Category> findById(Long id);
    Category save(Category category);
    Category update(Long id, Category category);
    Optional<Category> delete(Long id);
}
