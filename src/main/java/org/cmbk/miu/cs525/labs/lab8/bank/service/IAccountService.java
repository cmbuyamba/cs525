package org.cmbk.miu.cs525.labs.lab8.bank.service;

import org.cmbk.miu.cs525.labs.lab8.bank.domain.Account;

import java.util.Collection;

public interface IAccountService {
    Account createAccount(long accountNumber, String customerName);

    AccountDTO getAccount(long accountNumber);

    Collection<Account> getAllAccounts();

    void deposit(long accountNumber, double amount);

    void withdraw(long accountNumber, double amount);

    void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description);
}
