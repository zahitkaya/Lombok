package com.lombok.demo.field_default;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
@Data
public class FieldDefault {
    String name;
    int id;
}
