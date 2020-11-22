package com.lombok.demo.with;

import lombok.*;

@With
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WithExample {
    private String name;
    private String address;
    private int age;
    private int id;
}
