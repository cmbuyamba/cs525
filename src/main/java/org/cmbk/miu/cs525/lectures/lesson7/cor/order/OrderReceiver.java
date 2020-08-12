package org.cmbk.miu.cs525.lectures.lesson7.cor.order;

import java.io.IOException;

public class OrderReceiver {
    private OrderHandler orderHandler;

    public void setOrderHandler(OrderHandler orderHandler) {
        this.orderHandler = orderHandler;
    }

    public void receiveOrder(String fileName) throws IOException {
        FileReader fileReader = new FileReader();
        String orderContent = fileReader.getStringFromFile(fileName);
        orderHandler.handleOrder(orderContent);
    }
}
