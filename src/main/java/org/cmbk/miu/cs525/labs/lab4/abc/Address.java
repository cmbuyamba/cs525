package org.cmbk.miu.cs525.labs.lab4.abc;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    private String street;
    private String city;
    private int zipCode;
    private String state;
}
