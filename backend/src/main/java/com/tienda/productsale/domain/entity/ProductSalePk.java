package com.tienda.productsale.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class ProductSalePk {
  @Column(name = "id_product")
  private Integer idProduct;

  @Column(name="id_sale")
  private Integer idSale;
}
