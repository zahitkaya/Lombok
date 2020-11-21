package com.lombok.demo.field_default;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldDefaultTest {

    @Test
    void getName() {
        FieldDefault fieldDefault=new FieldDefault("Zahit",2);
        fieldDefault.getName();// Name'e direkt ulaşamıyoruz çünkü private
        //fieldlar final olduğundan @Data'da setterlar yazılmadı.
    }
}