package org.cmbk.miu.cs525.lectures.lesson13.event;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class StockChangeEvent {
    private String stockName;
    private double newValue;
}
