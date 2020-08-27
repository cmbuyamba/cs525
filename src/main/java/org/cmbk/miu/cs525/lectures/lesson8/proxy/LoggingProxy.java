package org.cmbk.miu.cs525.lectures.lesson8.proxy;

public class LoggingProxy implements CustomerDAO{
    CustomerDAO dao;
    Logger logger = new Logger();
    public LoggingProxy(CustomerDAO dao) {
        this.dao = dao;
    }
    @Override
    public Customer findCustomerById(String id) {
        Customer customer = dao.findCustomerById(id);
        logger.log("Getting customer with id= " + id);
        return customer;
    }
}
