package com.lombok.demo.value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValueExampleTest {

    @Test
    void getName() {
        ValueExample valueExample=new ValueExample("Zahit",5,"Fatih mahallesi");
        //Name ve id fieldları final olduğundan setter metodları oluşmadı.
        valueExample.setAddress("Yenidoğan");
    }
}