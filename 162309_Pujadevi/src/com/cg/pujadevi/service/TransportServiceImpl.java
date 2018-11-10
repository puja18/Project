package com.cg.pujadevi.service;

import java.util.Map;

import com.cg.pujadevi.bean.TransportBean;
import com.cg.pujadevi.dao.ITransportDao;
import com.cg.pujadevi.dao.TransportDaoImpl;
import com.cg.pujadevi.exception.TicketException;

public class TransportServiceImpl implements ITransportService {
      ITransportDao dao = new TransportDaoImpl();
	@Override
	public Map<String, String> getTransportDetails() throws TicketException {
		// TODO Auto-generated method stub
		return dao.getTransportDetails();
	}
	@Override
	public void addTransport(TransportBean bean) throws TicketException {
		// TODO Auto-generated method stub
		dao.addTransport(bean);
	}
	@Override
	public void deleteBooking(int choiceDelete) {
		// TODO Auto-generated method stub
		dao.deleteBooking(choiceDelete);
	}
	@Override
	public Map<Integer, TransportBean> displayAllTransportDetails() {
		// TODO Auto-generated method stub
		return dao.displayAllTransportDetails();
	}
	@Override
	public void displayTransportDetails(int choiceDisplay) {
		// TODO Auto-generated method stub
		dao.displayTransportDetails(choiceDisplay);
	}
	@Override
	public void updateTransportDetails(int id) {
		// TODO Auto-generated method stub
		dao.updateTransportDetails(id);
	}
	
}
