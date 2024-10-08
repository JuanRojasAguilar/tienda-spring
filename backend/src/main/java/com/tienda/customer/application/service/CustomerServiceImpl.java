package com.tienda.customer.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.tienda.customer.domain.entity.Customer;
import com.tienda.customer.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
  @Autowired
  private CustomerRepository repository;

  @Transactional(readOnly = true)
	@Override
	public List<Customer> getAll() {
    return (List<Customer>) repository.findAll();
	}

  @Transactional(readOnly = true)
	@Override
	public Optional<Customer> findById(Long id) {
    return repository.findById(id);
	}

  @Transactional
	@Override
	public Customer save(Customer customer) {
    return repository.save(customer);
	}

	@Override
	public Customer update(Long id, Customer customer) {
    Optional<Customer> customerInstance = repository.findById(id);
    if (customerInstance.isPresent()) {
      Customer updatedCustomer = customerInstance.get();
      updatedCustomer.setFirstName(customer.getFirstName());
      updatedCustomer.setLastName(customer.getLastName());
      updatedCustomer.setAddress(customer.getAddress());
      updatedCustomer.setEmail(customer.getEmail());
      updatedCustomer.setCellphoneNumber(customer.getCellphoneNumber());
      return repository.save(updatedCustomer);
    }
    return null;
	}

	@Override
	public Optional<Customer> delete(Long id) {
    Optional<Customer> customer = repository.findById(id);
    customer.ifPresent(target -> {
      repository.delete(target);
    });
    return customer;
	}
  

}
