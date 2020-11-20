package com.lombok.demo.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuilderDesignTest {

    @Test
    void builder() {
        BuilderDesign.BuilderDesignBuilder builderDesign=BuilderDesign.builder().address("Fatih mahallesi").id(5).number(123);
        System.out.println(builderDesign.toString());
    }
}