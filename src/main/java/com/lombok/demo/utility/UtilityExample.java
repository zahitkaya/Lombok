package com.lombok.demo.utility;

import lombok.experimental.UtilityClass;

@UtilityClass //Classı final, içerisindeki metodları ve değişkenleri static yapar.
public class UtilityExample {
    public String name;
    public String getName(){
        name="zahit";
        return name;
    }
    public void printName(){
        System.out.println(getName()); //getName'i obje kullanmadan çağırabildik.
    }
}
