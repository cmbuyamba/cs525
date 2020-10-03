package org.cmbk.miu.cs525.lectures.lesson13.listener;

import org.cmbk.miu.cs525.lectures.lesson13.event.StockChangeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class StockTrader {
    @Async
    @EventListener
    public void trade(StockChangeEvent stockChangeEvent) {
        System.out.println("StockTrader received event :" + stockChangeEvent);
    }
}