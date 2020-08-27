package org.cmbk.miu.cs525.lectures.lesson8.proxy;

import java.util.HashMap;
import java.util.Map;

public class CachingProxy implements CustomerDAO {
    private CustomerDAO dao;
    private Map<String, Customer> cache = new HashMap<>();

    public CachingProxy(CustomerDAO dao) {
        this.dao = dao;
    }

    @Override
    public Customer findCustomerById(String id) {
        Customer customer = cache.get(id);
        if (customer == null) {
            customer = dao.findCustomerById(id);
            cache.put(id, customer);
        }
        return customer;
    }
}
