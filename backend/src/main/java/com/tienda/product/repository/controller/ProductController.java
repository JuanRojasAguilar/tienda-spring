package com.tienda.product.repository.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.product.application.service.ProductService;
import com.tienda.product.domain.entity.Product;



@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService repository;

    @GetMapping
    public List<Product> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Product add(@RequestBody Product product) {
        return repository.add(product);
    }

    @GetMapping("/{id}")
    public Optional<Product> findById(@RequestParam Long id) {
        return repository.findById(id);
    }
}
