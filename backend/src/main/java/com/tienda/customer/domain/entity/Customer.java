package com.tienda.customer.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="customers")
public class Customer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id_customer")
  private Integer idCustomer;

  @Column(name="first_name", nullable=false, length = 50)
  private String firstName;

  @Column(name="last_name", nullable=false, length = 50)
  private String lastName;

  @Column(name="cellphone_number", unique=true, length = 15)
  private String cellphoneNumber;

  @Column(length = 150)
  private String address;

  @Column(length = 150, unique = true, nullable = false)
  private String email;
}
