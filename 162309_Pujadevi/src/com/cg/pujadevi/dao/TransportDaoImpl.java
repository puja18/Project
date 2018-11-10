package com.cg.pujadevi.dao;

import java.util.Map;

import com.cg.pujadevi.bean.TransportBean;
import com.cg.pujadevi.util.DataBase;

public class TransportDaoImpl implements ITransportDao {

	@Override
	public Map<String, String> getTransportDetails() {
		// TODO Auto-generated method stub
		return DataBase.getTransportDetails();
	}

	@Override
	public void addTransport(TransportBean bean) {
		// TODO Auto-generated method stub
		 DataBase.addTransport(bean);
	}
	@Override
	public void deleteBooking(int choiceDelete) {
		// TODO Auto-generated method stub
		DataBase.deleteBooking(choiceDelete);
	}

	@Override
	public Map<Integer, TransportBean> displayAllTransportDetails() {
		// TODO Auto-generated method stub
		return DataBase.displayAllTransportDetails();
	}

	@Override
	public void displayTransportDetails(int choiceDisplay) {
		// TODO Auto-generated method stub
		 DataBase.displayTransportDetails(choiceDisplay);
	}

	@Override
	public void updateTransportDetails(int id) {
		// TODO Auto-generated method stub
		DataBase.updatetransportDetails(id);
	}

}
