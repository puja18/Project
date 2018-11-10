package com.capg.bankapp1.dao;

import java.util.ArrayList;

import com.capg.bankapp1.bean.Bank;

public interface IBankDao {

	public boolean createAccount(Bank b);

	public Bank showBalance(long accno);

	public double deposit(double rupees);

	public double withdraw(double rupees);

	public Bank fundTransfer(long accno);

}
