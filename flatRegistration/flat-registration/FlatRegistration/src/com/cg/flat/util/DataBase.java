	package com.cg.flat.util;

import java.lang.reflect.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import com.cg.flat.bean.FlatBean;

public class DataBase {
	private static ArrayList<Integer> flatDetails = new ArrayList<Integer>();
	private static ArrayList<String> roomDetails=new ArrayList<String>();
	private static ArrayList<FlatBean> arrayList = new ArrayList<FlatBean>();
	static {

		flatDetails.add(1);

		flatDetails.add(2);

		flatDetails.add(3);
	
	roomDetails.add("1-1BHK");
	roomDetails.add("2-2BHK");
	
	}

	public static ArrayList<Integer> getFlatDetails() {
		// TODO Auto-generated method stub
		return  flatDetails;
		
	}
	public static ArrayList<String> getRoomDetails() {
		// TODO Auto-generated method stub
		return  roomDetails;
	}
	public static  ArrayList<FlatBean> displayDetails(FlatBean bean) {
		arrayList.add(bean);
		
		return arrayList;
	}
}