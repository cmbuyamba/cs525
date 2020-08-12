package org.cmbk.miu.cs525.labs.lab4.abc;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    private String firstName;
    private String lastName;
    private int age;

    private Address address;
}
