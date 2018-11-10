package com.cg.flat.ui;

import java.awt.Choice;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import com.cg.flat.bean.FlatBean;
import com.cg.flat.service.FlatServiceImpl;
import com.cg.flat.service.IFlatService;

public class Client {

	public static void main(String[] args) {
		FlatBean bean = new FlatBean();

		Scanner sc = new Scanner(System.in);
		IFlatService service = new FlatServiceImpl();
		while (true) {
			System.out.println("FLAT REGISTRATION ");
			System.out.println("1.Register");
			System.out.println("2.Display customer details");
			System.out.println("3.Exit");

			System.out.println("enter your choice");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Flat Registration");
				ArrayList<Integer> list = service.getFlatDetails();
				System.out.println("existing owner id:" + list);
				System.out.println("Please enter the your owner id");
				int ownerid = sc.nextInt();
				ArrayList<String> list1 = service.getRoomDetails();
				System.out.println("please select your flatType" + list1);
				String flatType = sc.next();
				int FlatId = (int) (Math.random() * 10000);
				bean.setFlatId(FlatId);
				System.out.println("enter the FlatArea in sqft:");
				double Area = sc.nextDouble();
				bean.setFlatArea(Area);
				System.out.println("Enter the desired rent amount ");
				double Rent = sc.nextDouble();
				bean.setRent(Rent);
				System.out.println("enter the desired deposited amount");
				double Deposit = sc.nextDouble();
				bean.setDeposit(Deposit);
				System.out.println("Flat Successfully Registered  "
						+ bean.getFlatId());
				System.out.println(bean);
				break;
			case 2:
				ArrayList<FlatBean> list2 = service.displayDetails(bean);
				System.out.println(list2);
				break;
				
			case 3:
				System.out.println("registration ended");
				System.exit(0);
				break;

			}
		}
	}

}
