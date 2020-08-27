package org.cmbk.miu.cs525.lectures.lesson8.proxy;

public class CustomerDAOImpl implements CustomerDAO{
    @Override
    public Customer findCustomerById(String id) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Customer(id, "Celestin Mbuyamba");
    }
}
