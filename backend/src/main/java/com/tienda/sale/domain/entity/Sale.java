package com.tienda.sale.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.tienda.customer.domain.entity.Customer;

import jakarta.persistence.Column;
import lombok.Data;

@Data
@Entity(name="sales")
public class Sale {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id_sale")
  private Integer idSale;

  @ManyToOne
  @JoinColumn(name="id_customer", nullable = false)
  private Customer customer;

  @CreatedDate
  @Column(name="order_date", updatable=false, nullable=false)
  private Date oderDate;

  @LastModifiedDate
  @Column(name="last_modified")
  private Date lastModified;

  @Column(length=255)
  private String description;

  @Enumerated(EnumType.STRING)
  private SaleStatus status = SaleStatus.PENDING;
}
