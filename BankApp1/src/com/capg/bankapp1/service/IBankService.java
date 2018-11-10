package com.capg.bankapp1.service;

import java.util.ArrayList;

import com.capg.bankapp1.bean.Bank;

public interface IBankService {

	public boolean createAccount(Bank b);

	public Bank showBalance(long accno);

	public double deposit(double rupees);

	public double withdraw(double rupees);

	public Bank fundTransfer(long accno);

}
