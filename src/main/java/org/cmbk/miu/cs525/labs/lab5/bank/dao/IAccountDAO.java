package org.cmbk.miu.cs525.labs.lab5.bank.dao;

import org.cmbk.miu.cs525.labs.lab5.bank.domain.Account;

import java.util.Collection;

public interface IAccountDAO {
	void saveAccount(Account account);
	void updateAccount(Account account);
	Account loadAccount(long accountnumber);
	Collection<Account> getAccounts();
}
