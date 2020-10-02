package org.cmbk.miu.cs525.lectures.lesson9.factory.pattern;

import org.cmbk.miu.cs525.lectures.lesson9.factory.domain.Customer;
import org.cmbk.miu.cs525.lectures.lesson9.factory.domain.Product;
import org.cmbk.miu.cs525.lectures.lesson9.factory.pattern.dao.CustomerDAO;
import org.cmbk.miu.cs525.lectures.lesson9.factory.pattern.dao.ProductDAO;

public class Application {
    public static void main(String[] args) {
        Product product = new Product(3324, "DJI Mavic 2 Pro drone");
        Customer customer = new Customer("Frank Brown");

        DaoFactory mainFactory = new DaoFactory();
        MyFactory factory = mainFactory.getFactoryInstance();

        CustomerDAO customerDAO = factory.getCustomerDAO();
        ProductDAO productDAO = factory.getProductDAO();

        ProductService productService = new ProductService(productDAO);
        CustomerService customerService = new CustomerService(customerDAO);
        customerService.save(customer);
        productService.save(product);
    }
}
