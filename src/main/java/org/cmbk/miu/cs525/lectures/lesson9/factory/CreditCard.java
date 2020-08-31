package org.cmbk.miu.cs525.lectures.lesson9.factory;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreditCard {
    private String type;
    private String number;
    private double limit;
    private double annualCharge;
}
