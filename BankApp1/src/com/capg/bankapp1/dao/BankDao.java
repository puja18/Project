package com.capg.bankapp1.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

import com.capg.bankapp1.bean.Bank;
import com.capg.bankapp1.ui.Main;

public class BankDao implements IBankDao {

	Scanner sc = new Scanner(System.in);
	ArrayList<Bank> banklist = new ArrayList<Bank>();
	Bank b = new Bank();
	Main m = new Main();

	@Override
	public boolean createAccount(Bank b) {

		return banklist.add(b);
	}

	@Override
	public Bank showBalance(long accno) {

		System.out.println("enter the name more than 4 characters");
		String ename1 = sc.next();
		System.out.println("enter the pin atleast 4 characters");
		int pin1 = sc.nextInt();
		if (pin1 == b.getPin()) {

			System.out.println("Welcome " + b.getName());
			System.out.println("the total balance in your account is "
					+ b.getBalance());
		} else {
			System.out.println("Invalid");
		}
		return null;

	}

	@Override
	public double deposit(double rupees) {

		rupees = b.getBalance() + rupees;
		b.setBalance(rupees);
		System.out.println("the total balance deposited is " + b.getBalance());
		return 0;
	}

	@Override
	public double withdraw(double rupees) {

		if (rupees < b.getBalance()) {
			rupees = b.getBalance() - rupees;
			b.setBalance(rupees);
			System.out.println("the total balance  is " + b.getBalance());
		} else {
			System.out.println("Your account is having insufficient balance");
		}
		return 0;
	}

	@Override
	public Bank fundTransfer(long accno) {

		System.out.println("The total balance in your account is "
				+ b.getBalance());
		System.out
				.println("Enter the details of another account to transfer money");
		System.out.println("enter the name");
		String oname = sc.next();
		System.out.println("enter the aNum");
		long aNum = sc.nextLong();
		System.out.println("enter the phone number");
		BigInteger phoneNum = sc.nextBigInteger();
		System.out.println("enter the amount to transfer");
		double amt = sc.nextDouble();
		if (amt < b.getBalance()) {
			amt = b.getBalance() - amt;
			b.setBalance(amt);
			System.out.println("Transaction is successful");
			System.out.println("The total balance in your account is given as "
					+ b.getBalance());
		} else {
			System.out.println("Tansaction failed due to low balance");
		}
		return null;
	}

}
