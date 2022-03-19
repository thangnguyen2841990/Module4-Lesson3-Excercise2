package com.codegym.service;


import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {

    static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Sting do", 12000, 150, "Nuoc tang luc vi cam"));
        products.add(new Product(2, "Sting vang", 13000, 250, "Nuoc tang luc vi dau"));
        products.add(new Product(3, "Pepsi", 14000, 350, "Nuoc ngot co ga"));
        products.add(new Product(4, "Cocacola", 15000, 450, "Nuoc ngot co ga"));
        products.add(new Product(5, "Fanta", 16000, 550, "Nuoc ngot co ga vi cam"));
        products.add(new Product(6, "Lavie", 17000, 650, "Nuoc khoang thien nhien"));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(int id) {
        int index = findById1(id);
        return products.get(index);
    }

    @Override
    public void update(int id, Product product) {
        int index = findById1(id);
        products.set(index, product);

    }

    @Override
    public void delete(int id) {
        int index = findById1(id);
        products.remove(index);
    }

    @Override
    public void create(Product product) {
        products.add(product);
    }

    @Override
    public int findById1(int id) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public Product findById(String name) {
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                index = i;
            }
        }
        return products.get(index);
    }
}
