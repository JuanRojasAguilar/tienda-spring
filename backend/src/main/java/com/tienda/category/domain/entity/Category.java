package com.tienda.category.domain.entity;

import java.util.Set;

import com.tienda.product.domain.entity.Product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category")
    private Integer idCategory;

    @Column(unique = true, nullable = false)
    private String description;

    @Column
    private Short state;

    @OneToMany
    private Set<Product> products;
}
