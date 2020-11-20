package com.lombok.demo.equals_hash;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class EqualsAndHashTest {

    @Test
    void testEquals() {
        EqualsAndHash equalsAndHash=new EqualsAndHash("Kaya",1);
        EqualsAndHash equalsAndHash1=new EqualsAndHash("Kaya",1);

        Map <Integer,EqualsAndHash> list=new HashMap<>();
        list.put(1,equalsAndHash);
        list.put(2,equalsAndHash1);
        System.out.println(list.size());
        System.out.println(list.toString());

        //Equals metodu
        System.out.println(equalsAndHash.equals(equalsAndHash1));
        System.out.println(equalsAndHash.canEqual(equalsAndHash1));
    }
}