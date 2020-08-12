package org.cmbk.miu.cs525.lectures.lesson7.cor.order;

public class CompanyBTexasOrderHandler extends OrderHandler {
    public CompanyBTexasOrderHandler(OrderHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleOrder(String orderContent) {
        if (orderContent.lastIndexOf("Texas") != -1) {
            System.out.println("handle order for CompanyB from Texas");
        }
    }
}
