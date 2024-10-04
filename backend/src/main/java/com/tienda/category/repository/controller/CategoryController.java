package com.tienda.category.repository.controller;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.category.application.service.CategoryService;
import com.tienda.category.domain.entity.Category;


@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryService service;

    @GetMapping
    public Set<Category> findAll() {
        return service.findAll();
    }

    @PostMapping
    public Category save(@RequestBody Category category) {
        return service.save(category);
    }

    @GetMapping("/{id}")
    public Optional<Category> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Category putMethodName(@PathVariable Long id, @RequestBody Category category) {
        return service.update(id, category);
    }
}
