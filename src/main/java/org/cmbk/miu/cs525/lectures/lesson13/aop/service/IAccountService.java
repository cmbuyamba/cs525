package org.cmbk.miu.cs525.lectures.lesson13.aop.service;

import org.cmbk.miu.cs525.lectures.lesson13.aop.domain.Customer;

public interface IAccountService {
    void addAccount(String accountNumber, Customer customer);
}
