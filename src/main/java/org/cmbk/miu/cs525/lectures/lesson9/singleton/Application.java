package org.cmbk.miu.cs525.lectures.lesson9.singleton;

public class Application {
    public static void main(String[] args) {
        CustomerDAO customerDAO = new CustomerDAO();
        customerDAO.save();
        ProductDAO productDAO = new ProductDAO();
        productDAO.save();
    }
}
