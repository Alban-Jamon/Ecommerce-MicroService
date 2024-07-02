package com.ecommerce.microcommerce.web;

import com.ecommerce.microcommerce.model.Product;
import com.ecommerce.microcommerce.web.dao.ProductDao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ProductDaoImpl implements ProductDao {

    public static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(2L,"Ghost", 39.99, "Encore un Album mais celui-ci étant des chants de Noël qui ne convient pas à toutes les oreilles! "));
        products.add(new Product(3L,"PowerWolf", 29.99, "Si vous aimez l'opéra ce son est fait pour vous! "));
        products.add(new Product(4L,"Moscow Death Brigade", 29.99, "Un Album de musique Typique Russe soupoudré de folie sur son lit de Punk"));

    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(Long id) {
        for (Product product : products){
            if (product.getId().equals(id)){
                return product;
            }
        }
        return null;
    }



    @Override
    public Product save(Product product) {
        products.add(product);
        return product;
    }
}
