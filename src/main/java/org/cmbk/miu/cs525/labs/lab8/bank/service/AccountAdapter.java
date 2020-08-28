package org.cmbk.miu.cs525.labs.lab8.bank.service;

import org.cmbk.miu.cs525.labs.lab8.bank.domain.Account;

public class AccountAdapter {
    public Account getAccount(AccountDTO accountDTO){
        return new Account(accountDTO.getAccountNumber());
    }

    public AccountDTO getAccountDTO(Account account){
        return new AccountDTO(account.getAccountNumber());
    }
}
