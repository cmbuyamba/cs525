package org.cmbk.miu.cs525.labs.lab8.bank.dao;

import org.cmbk.miu.cs525.labs.lab8.bank.domain.Account;

import java.util.*;

public class AccountDAO implements IAccountDAO {
    Collection<Account> accountList = new ArrayList<>();

    public void saveAccount(Account account) {
        accountList.add(account); // add the new
    }

    public void updateAccount(Account account) {
        Account accountExist = loadAccount(account.getAccountNumber());
        if (accountExist != null) {
            accountList.remove(accountExist); // remove the old
            accountList.add(account); // add the new
        }

    }

    public Account loadAccount(long accountNumber) {
        for (Account account : accountList) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public Collection<Account> getAccounts() {
        return accountList;
    }

}
