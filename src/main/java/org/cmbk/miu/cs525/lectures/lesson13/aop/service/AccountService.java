package org.cmbk.miu.cs525.lectures.lesson13.aop.service;

import org.cmbk.miu.cs525.lectures.lesson13.aop.domain.Account;
import org.cmbk.miu.cs525.lectures.lesson13.aop.domain.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class AccountService implements IAccountService {
    Collection<Account> accountList = new ArrayList<>();

    public void addAccount(String accountNumber, Customer customer) {
        Account account = new Account(accountNumber, customer);
        accountList.add(account);
        System.out.println("in execution of method addAccount");
    }
}
