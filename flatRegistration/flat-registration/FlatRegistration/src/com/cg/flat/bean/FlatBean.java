package com.cg.flat.bean;

public class FlatBean {
	 private int FlatId;
	 private double Rent;
	 private double Deposit;
	 private double FlatArea;

	 
	 public int getFlatId() {
		return FlatId;
	}
	public void setFlatId(int flatId) {
		FlatId = flatId;
	}
	
	public double getRent() {
		return Rent;
	}
	public void setRent(double rent) {
		Rent = rent;
	}
	public double getDeposit() {
		return Deposit;
	}
	public void setDeposit(double deposit) {
		Deposit = deposit;
	}
	public double getFlatArea() {
		return FlatArea;
	}
	public void setFlatArea(double flatArea) {
		FlatArea = flatArea;
	}
	@Override
	public String toString() {
		return "FlatBean [FlatId=" + FlatId + ", Rent=" + Rent + ", Deposit="
				+ Deposit + ", FlatArea=" + FlatArea + "]";
	}
	
}
