package org.cmbk.miu.cs525.lectures.lesson8.proxy;

public class CustomerService {
    CustomerDAO customerDAO = new CustomerDAOImpl();
    CustomerDAO cachingProxy = new CachingProxy(customerDAO);
    CustomerDAO loggerProxy = new LoggingProxy(cachingProxy);
    CustomerDAO stopWatchProxy = new StopWatchProxy(loggerProxy);

    public Customer getCustomer(String id) {
        return stopWatchProxy.findCustomerById(id);
    }
}
