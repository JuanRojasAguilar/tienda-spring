package com.tienda.product.repository.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    
}
