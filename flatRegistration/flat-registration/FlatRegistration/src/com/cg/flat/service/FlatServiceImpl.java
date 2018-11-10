package com.cg.flat.service;

import java.util.ArrayList;

import com.cg.flat.bean.FlatBean;
import com.cg.flat.dao.FlatDaoImpl;
import com.cg.flat.dao.IFlatDao;

public class FlatServiceImpl implements IFlatService {
	
	IFlatDao dao=new FlatDaoImpl();

	@Override
	public ArrayList<Integer> getFlatDetails() {
		// TODO Auto-generated method stub
		return dao.getFlatDetails();
	}
	@Override
	public ArrayList<String> getRoomDetails() {
		// TODO Auto-generated method stub
		return dao.getRoomDetails();
	}
	@Override
	public ArrayList<FlatBean> displayDetails(FlatBean bean) {
		// TODO Auto-generated method stub
		return dao.displaydetails(bean);
	}

}
