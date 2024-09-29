package com.tienda.product.repository;

import org.springframework.data.repository.CrudRepository;

import com.tienda.product.domain.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {}
