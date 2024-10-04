package com.tienda.category.application.service;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tienda.category.domain.entity.Category;
import com.tienda.category.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly=true)
    @Override
    public Set<Category> findAll() {
        Set<Category> categories = new LinkedHashSet<>((List<Category>) repository.findAll());
        return categories;
    }

    @Transactional(readOnly=true)
    @Override
    public Optional<Category> findById(Long id) {
        return repository.findById(id);
    }

    @Transactional
    @Override
    public Category save(Category category) {
        return repository.save(category);
    }

    @Override
    public Category update(Long id, Category category) {
        Optional<Category> dbCategory = repository.findById(id);
        if (dbCategory.isPresent()) {
            Category newCategory = dbCategory.get();
            
            if (category.getDescription() != null) newCategory.setDescription(category.getDescription());
            if (category.getState() != null) newCategory.setState(category.getState());
           
            return repository.save(newCategory);
        }
        return null;
    }

    @Override
    public Optional<Category> delete(Long id) {
        Optional<Category> category = repository.findById(id);
        category.ifPresent(target -> {
            repository.delete(target);
        });
        return category;
    }
    
}
