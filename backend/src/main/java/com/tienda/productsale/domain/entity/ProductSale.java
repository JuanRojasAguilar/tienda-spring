package com.tienda.productsale.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
@Entity
public class ProductSale {

  @EmbeddedId
  @Column(name = "id_product_sale")
  private ProductSalePk idProductSale;

  @Column 
  private Integer quantity;

  @Column(precision = 10, scale = 2)
  private Double total;

  @Enumerated
  @Column(nullable = false)
  private ProductSaleStatus status = ProductSaleStatus.PENDING;
}
