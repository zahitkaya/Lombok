package com.lombok.demo.value;

import lombok.Setter;
import lombok.Value;
import lombok.experimental.NonFinal;

@Value //@Getter @EqualsAndHashCode @ToString @AllArgsConstructor @FieldDefaults
@Setter
//Oluşturulan sınıf finaldir
//Nonfinal olarak belirtilmeyen bütün fieldlar finaldır.
public class ValueExample {
    String name;
    int id;
    @NonFinal String address;
}
