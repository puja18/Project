package com.cg.flat.service;

import java.util.ArrayList;

import com.cg.flat.bean.FlatBean;

public interface IFlatService {

	ArrayList<Integer> getFlatDetails();

	ArrayList<String> getRoomDetails();
	
	ArrayList<FlatBean> displayDetails(FlatBean bean);
}
