package org.cmbk.miu.cs525.lectures.lesson9.factory.pattern;

import org.cmbk.miu.cs525.lectures.lesson9.factory.domain.Customer;
import org.cmbk.miu.cs525.lectures.lesson9.factory.pattern.dao.CustomerDAO;

public class CustomerService {
    private CustomerDAO customerDAO;
    public CustomerService(CustomerDAO customerDAO) {
        this.customerDAO= customerDAO;
    }
    public void save(Customer customer) {
        customerDAO.save(customer);
    }
}
