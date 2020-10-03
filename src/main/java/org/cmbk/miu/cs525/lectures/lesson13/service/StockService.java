package org.cmbk.miu.cs525.lectures.lesson13.service;

import org.cmbk.miu.cs525.lectures.lesson13.event.StockChangeEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class StockService {
    @Autowired
    private ApplicationEventPublisher publisher;

    public void changeStockValue(String stockName, double value) {
        publisher.publishEvent(new StockChangeEvent(stockName, value));
    }
}
