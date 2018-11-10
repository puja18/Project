package com.capg.bankapp1.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.capg.bankapp1.bean.Bank;
import com.capg.bankapp1.dao.BankDao;
import com.capg.bankapp1.ui.Main;

public class BankService implements IBankService {

	BankDao dao = new BankDao();
	Main m = new Main();
	static Scanner sc = new Scanner(System.in);

	@Override
	public boolean createAccount(Bank b) {
		return dao.createAccount(b);
	}

	@Override
	public Bank showBalance(long accno) {
		return dao.showBalance(accno);
	}

	@Override
	public double deposit(double rupees) {
		return dao.deposit(rupees);
	}

	@Override
	public double withdraw(double rupees) {
		return dao.withdraw(rupees);
	}

	@Override
	public Bank fundTransfer(long accno) {
		return dao.fundTransfer(accno);
	}

	public static boolean validateData(Bank b) {

		boolean isValid = false;
		if (b.getName().length() > 4 && b.getPin() > 999) {
			isValid = true;
		}

		return isValid;
	}

	public static boolean validateAccountNum(Bank b) {
		System.out.println("Enter account number..");
		long accno = sc.nextLong();
		boolean isValid = false;
		if (Main.acctNum == accno) {
			isValid = true;
		}
		return isValid;

	}
}
