package org.cmbk.miu.cs525.lectures.lesson7.cor.order;

public class CompanyBNewYorkOrderHandler extends OrderHandler {
    public CompanyBNewYorkOrderHandler(OrderHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleOrder(String orderContent) {
        if (orderContent.lastIndexOf("New York") != -1) {
            System.out.println("handle order for CompanyB from New York");
        } else {
            nextHandler.handleOrder(orderContent);
        }
    }
}
