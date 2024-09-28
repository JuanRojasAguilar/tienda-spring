package com.tienda.customer.application.service;

import java.util.List;
import java.util.Optional;

import com.tienda.customer.domain.entity.Customer;

public interface CustomerService {
  List<Customer> getAll();
  Optional<Customer> findById(Long id);
  Customer save(Customer customer);
  Customer update(Long id, Customer customer);
  Optional<Customer> delete(Long id);
} 
