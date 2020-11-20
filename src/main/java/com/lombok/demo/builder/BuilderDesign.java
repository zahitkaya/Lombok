package com.lombok.demo.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class BuilderDesign {
    private String name;
    private String address;
    private int id;
    private int number;

}
