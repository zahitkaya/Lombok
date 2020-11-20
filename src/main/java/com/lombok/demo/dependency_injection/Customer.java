package com.lombok.demo.dependency_injection;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
@Slf4j
public class Customer {
    private final Product product;
    ArrayList arrayList = new ArrayList<Product>();
    public void addProduct(){
        arrayList.add(product);
        log.info("Product eklendi: "+ product.toString());
    }
    /*public Customer(Product product){
       this.product=product;
    }*/ //Lombok bu işlemi arkada kendisi yapıyor.
}
