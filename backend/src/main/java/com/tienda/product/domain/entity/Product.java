package com.tienda.product.domain.entity;


import java.math.BigDecimal;
import java.util.List;

import com.tienda.category.domain.entity.Category;
import com.tienda.productsale.domain.entity.ProductSale;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Long idProduct;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_category")
    private Category category;

    @Column(nullable = false, unique = true, length = 150)
    private String name;

    @Column(nullable = false, unique = true, length = 150)
    private String barcode;

    @Column(precision = 16, scale = 2, nullable=false)
    private BigDecimal price;

    @Column
    private Integer stock = 0;

    @Column
    private Short state;

    @OneToMany(mappedBy = "product", fetch=FetchType.LAZY)
    private List<ProductSale> productProductsSale;
}
