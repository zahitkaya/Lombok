package com.lombok.demo.dependency_injection;

import lombok.*;

@NoArgsConstructor//No arg constructor üretir.
@AllArgsConstructor //Bütün fieldaları constructora koyar.
@Getter
@Setter
@ToString
public class Product {
    private String name;
    private int id;
    private int price;
}
