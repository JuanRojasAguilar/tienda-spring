package com.tienda.productsale.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class ProductSalePk {
  @Column(name = "id_product")
  private Long idProduct;

  @Column(name="id_sale")
  private Long idSale;
}
