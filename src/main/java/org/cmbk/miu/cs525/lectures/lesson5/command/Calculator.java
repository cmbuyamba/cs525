package org.cmbk.miu.cs525.lectures.lesson5.command;

import lombok.Data;

@Data
public class Calculator {
    private int value = 10;

    public void add(int value) {
        this.value += value;
    }

    public void subtract(int value) {
        this.value -= value;
    }
}
