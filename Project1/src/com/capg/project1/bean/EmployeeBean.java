package com.capg.project1.bean;

public class EmployeeBean  {
	private int eid;
	private String ename;
	private double sal;
	private String department;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "EmployeeBean [eid=" + eid + ", ename=" + ename + ", sal=" + sal
				+ ", department=" + department + "]";
	}
}
	