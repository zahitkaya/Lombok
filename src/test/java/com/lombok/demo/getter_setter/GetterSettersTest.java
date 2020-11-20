package com.lombok.demo.getter_setter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetterSettersTest {

    @Test
    void setId() {
        GetterSetters getterSetters=new GetterSetters();
        getterSetters.setAddress("Fatih mahallesi");
        System.out.println(getterSetters.getAddress());
    }
}