package capg.ass2;

import java.util.*;

class Person {
	// complete the class
	static Scanner sc = new Scanner(System.in);
	static String name;
	static float age;
	static double balance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

}

class Account extends Person {
	// complete the class
	static long accNum;
	static double balance;
	Person accHolder;
	static double rupees;

	Account() {
		askName();
		askAge();
		askBalance();
	}

	private static String askName() {
		System.out.println("enter the name");
		name = sc.nextLine();
		return name;
	}

	private static float askAge() {
		System.out.println("enter the age");
		age = sc.nextFloat();
		return age;
	}

	private double askBalance() {
		System.out.println("enter the balance");
		balance = sc.nextDouble();
		Account.setAccountDetails(name, age, balance);
		return balance;
	}

	Account(String name, float age, double balance) {
		this.name = name;
		this.age = age;
		this.balance = balance;
		generateAccnNumber();
	}

	public void deposit(double rupees) {
		// Set the balance of the account after the money is deposited to the
		// account
		System.out.println("enter the rupees");
		rupees = sc.nextDouble();
		balance = balance + rupees;
		System.out.println("the total amount is " + balance);
	}

	public void withdraw(double rupees) {
		// Set the balance of the account after the money is withdrawn from the
		// account

		System.out.println("enter the rupees");
		rupees = sc.nextDouble();

		if (rupees < balance) {
			balance = balance + rupees;
			System.out.println("the total amount is " + balance);
		} else {
			System.out.println("Insufficient balance");
		}

	}

	public String toString() {
		// Should return the string in the format:
		// Name: TempName Age: 68.0 AccNumber: 1333339438704 Balance= 899.0
		return ("Name:" + Person.name + "\n" + "Age:" + Person.age + "\n"
				+ "AccnNumber:" + accNum + "\n" + "Balance" + balance + "\n");
	}

	public double getBalance() {
		// Should return the balance present in the Account
		System.out.println("your balance:");
		return balance;
	}

	public static void setBalance(double bal) {
		// Set the balance for the account holder
		Account.balance = bal;
		generateAccnNumber();
	}

	public static void setAccountDetails(String name, float age, double balance) {
		// Set the account details for the account holder
		Person.name = name;
		Person.age = age;
		Account.balance = balance;
		generateAccnNumber();
	}

	public Person getPerson(Person p) {
		// return the AccountHolder
		accHolder = p;
		return accHolder;
	}

	public static long generateAccnNumber() {
		if (Account.balance == 500) {
			System.out.println("balance should be greater than 500 ");
			double b;
			System.out.println("enter amount:");
			b = sc.nextDouble();
			setBalance(b);
		} else if (Account.balance < 500) {
			System.out.println("balance should be greater than 500 ");
			double b;
			System.out.println("enter amount:");
			b = sc.nextDouble();
			setBalance(b);
		} else {

			accNum = (long) (Math.random() * 100000 + 3524400000L);
		}
		return accNum;

	}

	public static void main(String[] args) {
		Account a = new Account();
		System.out.println(a.toString());

		Account a1 = new Account(Person.name, Person.age, Person.balance);
		System.out.println(a1.toString());
		a1.deposit(rupees);
	}
}
