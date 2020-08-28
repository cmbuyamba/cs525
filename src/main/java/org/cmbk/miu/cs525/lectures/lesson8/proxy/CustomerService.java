package org.cmbk.miu.cs525.lectures.lesson8.proxy;

public class CustomerService {
    CustomerDAO stopWatchProxy = new StopWatchProxy(
            new LoggingProxy(
                    new CachingProxy(
                            new CustomerDAOImpl())));

    public Customer getCustomer(String id) {
        return stopWatchProxy.findCustomerById(id);
    }
}
