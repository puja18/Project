package com.capg.project1.ui;

import java.util.Scanner;

import com.capg.project1.bean.EmployeeBean;
import com.capg.project1.exception.EmpException;
import com.capg.project1.service.EmployeeServiceImp;
import com.capg.project1.service.IEmployeeService;

public class Client {

	public static void main(String[] args) {
		EmployeeBean e = new EmployeeBean();
		IEmployeeService service = new EmployeeServiceImp();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("**Add Employee Details**");
			System.out.println("Enter eid");
			int eid = sc.nextInt();
			System.out.println("Enter ename");
			String ename = sc.next();
			System.out.println("Enter salary");
			double sal = sc.nextDouble();
			System.out.println("Enter department");
			String department = sc.next();
			e.setEid(eid);
			e.setEname(ename);
			e.setSal(sal);
			e.setDepartment(department);
			if ( service.validateEmployee(e)) 
			{
							
			if ( service.saveEmployee(e)) 
			{
				System.out.println("Employee details are saved");
			} 
			else {
					System.out.println("not saved");
			} 
			}
		}
		catch (EmpException exception) 
		 {
			  System.out.println(exception.getMessage());
		 }
	
		catch (Exception exception1) 
		 {
			  System.out.println("Invalid Details");
		 }
		 

	}
		}

