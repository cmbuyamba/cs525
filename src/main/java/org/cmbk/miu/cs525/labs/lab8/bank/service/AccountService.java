package org.cmbk.miu.cs525.labs.lab8.bank.service;

import org.cmbk.miu.cs525.labs.lab8.bank.dao.AccountDAO;
import org.cmbk.miu.cs525.labs.lab8.bank.dao.IAccountDAO;
import org.cmbk.miu.cs525.labs.lab8.bank.domain.Account;
import org.cmbk.miu.cs525.labs.lab8.bank.domain.Customer;
import org.cmbk.miu.cs525.labs.lab8.bank.proxy.LoggingProxy;

import java.lang.reflect.Proxy;
import java.util.Collection;

public class AccountService implements IAccountService {
    IAccountDAO loggingProxy;

    public AccountService() {
        loggingProxy = (IAccountDAO) Proxy.newProxyInstance(
                IAccountDAO.class.getClassLoader(),
                new Class[]{IAccountDAO.class},
                new LoggingProxy(new AccountDAO()));
    }

    public Account createAccount(long accountNumber, String customerName) {
        Account account = new Account(accountNumber);
        Customer customer = new Customer(customerName);
        account.setCustomer(customer);
        loggingProxy.saveAccount(account);
        return account;
    }

    public void deposit(long accountNumber, double amount) {
        Account account = loggingProxy.loadAccount(accountNumber);
        account.deposit(amount);
        loggingProxy.updateAccount(account);
    }

    public AccountDTO getAccount(long accountNumber) {
        Account account = loggingProxy.loadAccount(accountNumber);
        return new AccountAdapter().getAccountDTO(account);
    }

    public Collection<Account> getAllAccounts() {
        return loggingProxy.getAccounts();
    }

    public void withdraw(long accountNumber, double amount) {
        Account account = loggingProxy.loadAccount(accountNumber);
        account.withdraw(amount);
        loggingProxy.updateAccount(account);
    }

    public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
        Account fromAccount = loggingProxy.loadAccount(fromAccountNumber);
        Account toAccount = loggingProxy.loadAccount(toAccountNumber);
        fromAccount.transferFunds(toAccount, amount, description);
        loggingProxy.updateAccount(fromAccount);
        loggingProxy.updateAccount(toAccount);
    }
}
