package com.tienda.productsale.domain.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tienda.product.domain.entity.Product;
import com.tienda.sale.domain.entity.Sale;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name="products_sales")
@EqualsAndHashCode(onlyExplicitlyIncluded=true)
@JsonIgnoreProperties({"product", "sale"})
public class ProductSale {
  @EmbeddedId
  @Column(name = "id_product_sale")
  @EqualsAndHashCode.Include
  private ProductSalePk idProductSale;

  @Column 
  private Integer quantity;

  @Column(precision = 10, scale = 2)
  private BigDecimal total;

  @ManyToOne
  @JoinColumn(name="id_product", insertable=false, updatable=false)
  private Product product;

  @ManyToOne
  @JoinColumn(name="id_sale", insertable=false, updatable=false)
  private Sale sale;

  @Enumerated
  @Column(nullable = false)
  private ProductSaleStatus status = ProductSaleStatus.PENDING;
}