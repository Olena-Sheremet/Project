package com.project.demo.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductTest {

    @Test
    void getId() {
        Product product = new Product();
        Long id = 1L;
        product.setId(id);
        Assertions.assertEquals(id, product.getId());
    }

    @Test
    void setId() {
        Product product = new Product();
        Long id = 1L;
        product.setId(id);
        Assertions.assertEquals(id, product.getId());

    }

    @Test
    void getName() {
        Product product = new Product();
        String name = "Test Product";
        product.setName(name);
        Assertions.assertEquals(name, product.getName());
    }

    @Test
    void setName() {
        Product product = new Product();
        String name = "Test Product";
        product.setName(name);
        Assertions.assertEquals(name, product.getName());
    }

    @Test
    void getPrice() {
        Product product = new Product();
        double price = 9.99;
        product.setPrice(price);
        Assertions.assertEquals(price, product.getPrice());
    }

    @Test
    void setPrice() {
        Product product = new Product();
        double price = 9.99;
        product.setPrice(price);
        Assertions.assertEquals(price, product.getPrice());
    }
}