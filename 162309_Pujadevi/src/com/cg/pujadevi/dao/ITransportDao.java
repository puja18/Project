package com.cg.pujadevi.dao;

import java.util.Map;

import com.cg.pujadevi.bean.TransportBean;
import com.cg.pujadevi.exception.TicketException;

public interface ITransportDao {

	public Map<String, String> getTransportDetails()  throws TicketException;

	public void addTransport(TransportBean bean)  throws TicketException;
	//public Map<Integer, TransportBean> displayTransportDetails();

	public void deleteBooking(int choiceDelete);

	public Map<Integer, TransportBean> displayAllTransportDetails();

	public void displayTransportDetails(int choiceDisplay);

	public void updateTransportDetails(int id);
}
