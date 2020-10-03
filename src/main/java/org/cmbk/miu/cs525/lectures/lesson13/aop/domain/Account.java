package org.cmbk.miu.cs525.lectures.lesson13.aop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account {
    private String accountNumber;
    private Customer customer;
}
