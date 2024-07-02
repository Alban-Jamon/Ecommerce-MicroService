package com.ecommerce.microcommerce.web.controller;

import com.ecommerce.microcommerce.model.Product;
import com.ecommerce.microcommerce.web.dao.ProductDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductDao productDao;

    public ProductController(ProductDao productDao) {
        this.productDao = productDao;
    }

    @GetMapping("/products")
    public List<Product> listProduct() {
        return productDao.findAll();
    }

    @GetMapping("product/{id}")
    public Product displayProduct(@PathVariable Long id){
        return productDao.findById(id);
    }

    @PostMapping("Product")
    public void createOrUpdate(Product product){
        productDao.save(product);
    }


}
