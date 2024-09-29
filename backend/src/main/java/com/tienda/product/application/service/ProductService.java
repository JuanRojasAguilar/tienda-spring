package com.tienda.product.application.service;

import java.util.List;
import java.util.Optional;

import com.tienda.product.domain.entity.Product;

public interface ProductService {
  List<Product> findAll();
  Optional<Product> findById(Long id);
  Product update(Long id, Product product);
  Product delete(Long id);
}
