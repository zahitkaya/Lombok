package com.lombok.demo.with;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithExampleTest {

    @Test
    void builder() {
        WithExample withExample=new WithExample().withAddress("Fatih").withAge(5).withId(10).withName("Zahit");
        withExample.withName("Ali").withId(20); //Burası nesneyi değiştirmeyecektir. With bize nesnede sabitlik sağlar.
        System.out.println(withExample);
    }
}