package com.capg.project1.service;

import com.capg.project1.bean.EmployeeBean;
import com.capg.project1.dao.EmployeeDAOImp;
import com.capg.project1.dao.IEmployeeDAO;
import com.capg.project1.exception.EmpException;
import com.capg.project1.exception.EmpExceptionErrorMessages;




public class EmployeeServiceImp implements IEmployeeService {
	IEmployeeDAO dao = new EmployeeDAOImp();


	@Override
	public boolean saveEmployee(EmployeeBean e) {
		// TODO Auto-generated method stub
		return dao.saveEmployee(e);
	}
	 public boolean validateEmployee(EmployeeBean e) throws EmpException {
         boolean isValid=true;
         if(!((e.getEid()) > 999) ) {
        	 throw new EmpException(EmpExceptionErrorMessages.ERROR1);
         }
         if(!(e.getEname().length() >= 4 && e.getEname().matches("[A-Za-z]{4,}"))) {
        	throw new EmpException(EmpExceptionErrorMessages.ERROR2);
         }
         if(((e.getEname()) == null)) {
         	throw new EmpException(EmpExceptionErrorMessages.ERROR3);
          }
         if(!((e.getSal()) >= 0) ) {
        	 throw new EmpException(EmpExceptionErrorMessages.ERROR4); 
         }
         if((e.getDepartment() == null)) {
        	 throw new EmpException(EmpExceptionErrorMessages.ERROR5);
         
         }  
	 
         return isValid;
		
         }
}
         


