package com.tienda.product.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.tienda.product.domain.entity.Product;
import com.tienda.product.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
  @Autowired
  private ProductRepository repository;

  @Transactional(readOnly = true)
	@Override
	public List<Product> findAll() {
    return (List<Product>) repository.findAll();
	}

  @Transactional(readOnly = true)
	@Override
	public Optional<Product> findById(Long id) {
    return repository.findById(id);
	}

  @Transactional
	@Override
	public Product delete(Long id) {
    Optional<Product> productInstance = repository.findById(id);
    productInstance.ifPresent(target -> {
      repository.delete(target);
    });
    return productInstance.get();
	}

@Override
public Product update(Long id, Product product) {
    Optional<Product> productInstance = repository.findById(id);
    productInstance.ifPresent(target -> {
      Product newProduct = target;
      newProduct.setName(product.getName());
      newProduct.setBarcode(product.getBarcode());
      newProduct.setCategory(product.getCategory());
      newProduct.setPrice(product.getPrice());
      newProduct.setStock(product.getStock());
      newProduct.setState(product.getState());
      repository.save(newProduct);
    });
    return productInstance.get();
}}
