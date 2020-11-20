package com.lombok.demo.equals_hash;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString

public class EqualsAndHash {
    @EqualsAndHashCode.Exclude
    private String surname;
    @EqualsAndHashCode.Include
    private int schoolNumber;

    public EqualsAndHash(String surname, int schoolNumber) {
        this.surname = surname;
        this.schoolNumber = schoolNumber;
    }
}
