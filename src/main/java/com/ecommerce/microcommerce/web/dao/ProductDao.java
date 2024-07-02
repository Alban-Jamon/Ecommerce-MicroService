package com.ecommerce.microcommerce.web.dao;

import com.ecommerce.microcommerce.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> findAll();
    Product findById(Long id);
    Product save(Product product);
}
