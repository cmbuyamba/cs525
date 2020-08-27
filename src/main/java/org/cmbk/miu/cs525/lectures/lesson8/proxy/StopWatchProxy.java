package org.cmbk.miu.cs525.lectures.lesson8.proxy;

public class StopWatchProxy implements CustomerDAO {
    CustomerDAO dao;

    public StopWatchProxy(CustomerDAO dao) {
        this.dao = dao;
    }

    @Override
    public Customer findCustomerById(String id) {
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        Customer customer = dao.findCustomerById(id);
        stopwatch.stop();
        System.out.println("The method CustomerDAO.getCustomer took " + stopwatch.getMillis() + " ms");
        return customer;
    }
}
