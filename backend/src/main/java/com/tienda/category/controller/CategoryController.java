package com.tienda.category.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.category.domain.entity.Category;
import com.tienda.category.service.CategoryService;


@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryService service;

    @GetMapping
    public Set<Category> findAll() {
        return service.findAll();
    }
    
}
