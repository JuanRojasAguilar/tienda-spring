package com.tienda.customer.repository;

import org.springframework.data.repository.CrudRepository;
import com.tienda.customer.domain.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
