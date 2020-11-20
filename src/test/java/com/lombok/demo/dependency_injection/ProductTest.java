package com.lombok.demo.dependency_injection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void test() {
        Product product=new Product();
        Product product1=new Product("zahit",1,15);
        Customer customer=new Customer(product1);
        customer.addProduct();

    }
}