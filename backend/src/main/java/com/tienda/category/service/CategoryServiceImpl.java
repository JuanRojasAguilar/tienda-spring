package com.tienda.category.service;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.tienda.category.domain.entity.Category;
import com.tienda.category.repository.CategoryRepository;

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly=true)
    @Override
    public Set<Category> findAll() {
        return (Set<Category>) repository.findAll();
    }

    @Transactional(readOnly=true)
    @Override
    public Optional<Category> findById(Integer id) {
        return repository.findById(id);
    }

    @Transactional
    @Override
    public Category save(Category category) {
        return repository.save(category);
    }

    @Override
    public Category update(Integer id, Category category) {
        Optional<Category> dbCategory = repository.findById(id);
        if (dbCategory.isPresent()) {
            Category newCategory = dbCategory.get();
            newCategory.setDescription(category.getDescription());
            newCategory.setState(category.getState());
            return repository.save(newCategory);
        }
        return null;
    }

    @Override
    public Optional<Category> delete(Integer id) {
        Optional<Category> category = repository.findById(id);
        category.ifPresent(target -> {
            repository.delete(target);
        });
        return category;
    }
    
}
