package com.jpm.bank.app.daos;

import com.jpm.bank.app.entities.Account;
import com.jpm.bank.app.exception.AccountException;

public interface IAccountDao {

	public void addAccount(Account account) throws AccountException;

	public double withdrawAmount(double amount) throws AccountException;

	public double checkBalance() throws AccountException;

}
