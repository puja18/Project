package com.cg.flat.dao;

import java.util.ArrayList;

import com.cg.flat.bean.FlatBean;

public interface IFlatDao {

	ArrayList<Integer> getFlatDetails();

	ArrayList<String> getRoomDetails();
	
	ArrayList<FlatBean> displaydetails(FlatBean bean);
}
