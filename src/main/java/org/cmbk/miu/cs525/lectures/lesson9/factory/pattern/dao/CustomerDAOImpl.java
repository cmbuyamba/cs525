package org.cmbk.miu.cs525.lectures.lesson9.factory.pattern.dao;

import org.cmbk.miu.cs525.lectures.lesson9.factory.domain.Customer;

public class CustomerDAOImpl implements CustomerDAO{
    @Override
    public void save(Customer customer) {
        System.out.println("CustomerDAOImpl saves customer");
    }
}
