package org.cmbk.miu.cs525.lectures.lesson9.factory.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private int productNumber;
    private String name;
}
