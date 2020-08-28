package org.cmbk.miu.cs525.labs.lab8.bank.domain;

import lombok.Data;

import java.util.*;

@Data
public class Account {
    long accountNumber;
    Collection<AccountEntry> entryList = new ArrayList<>();
    Customer customer;

    public Account(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        double balance = 0;
        for (AccountEntry entry : entryList) {
            balance += entry.getAmount();
        }
        return balance;
    }

    public void deposit(double amount) {
        AccountEntry entry = new AccountEntry(new Date(), amount, "deposit", "", "");
        entryList.add(entry);
    }

    public void withdraw(double amount) {
        AccountEntry entry = new AccountEntry(new Date(), -amount, "withdraw", "", "");
        entryList.add(entry);
    }

    private void addEntry(AccountEntry entry) {
        entryList.add(entry);
    }

    public void transferFunds(Account toAccount, double amount, String description) {
        entryList.add(new AccountEntry(new Date(), -amount, description, "" + toAccount.getAccountNumber(), toAccount.getCustomer().getName()));
        toAccount.addEntry(new AccountEntry(new Date(), amount, description, "" + toAccount.getAccountNumber(), toAccount.getCustomer().getName()));
    }
}
