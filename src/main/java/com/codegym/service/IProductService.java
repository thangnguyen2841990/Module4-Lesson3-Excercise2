package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface IProductService {

    List<Product> findAll();

    Product findById(int id);

    void update(int id, Product product);

    void delete(int id);

    void create(Product product);

    int findById1(int id);

    Product findById(String name);

}
