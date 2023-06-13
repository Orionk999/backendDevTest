package com.cibernos.prueba.application.services;

import com.cibernos.prueba.application.repository.ProductRepository;
import com.cibernos.prueba.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class ProductService {

    private final ProductRepository productRepository;
    public ProductService( ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Iterable<Product> getProducts (Integer Id){
        return productRepository.getProducts(Id);
    }

    public Product getProductById(Integer Id){
        return productRepository.getProductsById(Id);
    }

    public Product saveProduct(Product product)
    {
        return productRepository.saveProduct(product);
    }
    public void deleteProductById(Integer Id){
        /*productRepository.deleteProductById(Id);*/
    }
}