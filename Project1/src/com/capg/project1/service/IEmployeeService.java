package com.capg.project1.service;

import com.capg.project1.bean.EmployeeBean;
import com.capg.project1.exception.EmpException;

public interface IEmployeeService {
	public boolean saveEmployee(EmployeeBean e);
	public boolean validateEmployee(EmployeeBean e) throws EmpException;
}

