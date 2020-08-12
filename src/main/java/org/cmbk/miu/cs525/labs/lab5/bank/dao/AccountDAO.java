package org.cmbk.miu.cs525.labs.lab5.bank.dao;

import org.cmbk.miu.cs525.labs.lab5.bank.domain.Account;

import java.util.*;

public class AccountDAO implements IAccountDAO {
	Collection<Account> accounts = new ArrayList<Account>();

	public void saveAccount(Account account) {
		accounts.add(account); // add the new
	}

	public void updateAccount(Account account) {
		Account existingAccount = loadAccount(account.getAccountNumber());
		if (existingAccount != null) {
			accounts.remove(existingAccount); // remove the old
			accounts.add(account); // add the new
		}

	}

	public Account loadAccount(long accountNumber) {
		for (Account account : accounts) {
			if (account.getAccountNumber() == accountNumber) {
				return account;
			}
		}
		return null;
	}

	public Collection<Account> getAccounts() {
		return accounts;
	}

}
