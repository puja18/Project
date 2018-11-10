package com.capg.project1.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capg.project1.bean.EmployeeBean;
import com.capg.project1.exception.EmpException;
import com.capg.project1.service.EmployeeServiceImp;
import com.capg.project1.service.IEmployeeService;

public class IEmployeeServiceTest {

	
	private static IEmployeeService employeeService = null;

	@BeforeClass
	public static void createInstance() {
		employeeService = new EmployeeServiceImp();
	}

	@Test(expected = EmpException.class)
	public void testEidForLength() throws Exception {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEid(18);
		employeeBean.setEname("puja");
		employeeBean.setSal(1000.23);
		employeeBean.setDepartment("Finance");
		boolean result = employeeService.validateEmployee(employeeBean);
		assertFalse(result);
	}

	@Test(expected = EmpException.class)
	public void testEidForNumber() throws Exception {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEid(22 % 67);
		employeeBean.setEname("puja");
		employeeBean.setSal(1000.23);
		employeeBean.setDepartment("Finance");
		boolean result = employeeService.validateEmployee(employeeBean);
		assertFalse(result);

	}

	@Test
	public void testEid() throws Exception {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEid(1221);
		employeeBean.setEname("puja");
		employeeBean.setSal(1000.23);
		employeeBean.setDepartment("Finance");
		boolean result = employeeService.validateEmployee(employeeBean);
		assertTrue(result);

	}

	@Test(expected = EmpException.class)
	public void testEnameForAlphabet() throws Exception {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEid(1001);
		employeeBean.setEname("1234");
		employeeBean.setSal(1000.23);
		employeeBean.setDepartment("Finance");
		boolean result = employeeService.validateEmployee(employeeBean);
		assertFalse(result);
	}

	@Test(expected = EmpException.class)
	public void testEnameForLength() throws Exception {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEid(1001);
		employeeBean.setEname("uma");
		employeeBean.setSal(1000.23);
		employeeBean.setDepartment("Finance");
		boolean result = employeeService.validateEmployee(employeeBean);
		assertFalse(result);
	}

	@Test(expected = NullPointerException.class)
	public void testEnameForNotNull() throws Exception {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEid(1001);
		employeeBean.setEname(null);
		employeeBean.setSal(1000.23);
		employeeBean.setDepartment("Finance");
		boolean result = employeeService.validateEmployee(employeeBean);
		assertFalse(result);
	}

	@Test
	public void testEname() throws Exception {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEid(1001);
		employeeBean.setEname("puja");
		employeeBean.setSal(1000.23);
		employeeBean.setDepartment("Finance");
		boolean result = employeeService.validateEmployee(employeeBean);
		assertTrue(result);

	}

	@Test(expected = EmpException.class)
	public void testSalForNumber() throws Exception {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEid(1001);
		employeeBean.setEname("puja");
		employeeBean.setSal(20 % 0.0);
		employeeBean.setDepartment("Finance");
		boolean result = employeeService.validateEmployee(employeeBean);
		assertFalse(result);

	}

	@Test(expected = EmpException.class)
	public void testSalForZero() throws Exception {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEid(1001);
		employeeBean.setEname("puja");
		employeeBean.setSal(-4);
		employeeBean.setDepartment("Finance");
		boolean result = employeeService.validateEmployee(employeeBean);
		assertFalse(result);

	}

	@Test
	public void testSal() throws Exception {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEid(1001);
		employeeBean.setEname("puja");
		employeeBean.setSal(0);
		employeeBean.setDepartment("Finance");
		boolean result = employeeService.validateEmployee(employeeBean);
		assertTrue(result);

	}

	@Test(expected = NullPointerException.class)
	public void testDepartmentForNotNull() throws Exception {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEid(1001);
		employeeBean.setEname("puja");
		employeeBean.setSal(1000.23);
		employeeBean.setDepartment(null);
		boolean result = employeeService.validateEmployee(employeeBean);
		assertFalse(result);
	}

	@Test(expected = EmpException.class)
	public void testDepartmentForAlphabet() throws Exception {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEid(1001);
		employeeBean.setEname("123");
		employeeBean.setSal(1000.23);
		employeeBean.setDepartment("1234");
		boolean result = employeeService.validateEmployee(employeeBean);
		assertFalse(result);
	}
	@Test
	public void testDepartment() throws Exception {
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEid(1001);
		employeeBean.setEname("puja");
		employeeBean.setSal(10000);
		employeeBean.setDepartment("Finance");
		boolean result = employeeService.validateEmployee(employeeBean);
		assertTrue(result);

	}
}
