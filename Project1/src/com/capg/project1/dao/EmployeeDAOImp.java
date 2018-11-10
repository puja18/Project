package com.capg.project1.dao;

import java.util.ArrayList;

import com.capg.project1.bean.EmployeeBean;

public  class EmployeeDAOImp implements IEmployeeDAO {
	private static ArrayList<EmployeeBean> emp = new ArrayList<>();

	@Override
	public boolean saveEmployee(EmployeeBean e) {
		// TODO Auto-generated method stub
		return emp.add(e) ;
	
	}

	


}
