package com.cg.pujadevi.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.pujadevi.bean.TransportBean;
import com.cg.pujadevi.exception.TicketException;
import com.cg.pujadevi.service.ITransportService;
import com.cg.pujadevi.service.TransportServiceImpl;

public class TransportServiceImplTest {
	TransportBean transportBean = new TransportBean(); 
	private static ITransportService service = null;
    @BeforeClass
    public static void createInstance() {
    service = new TransportServiceImpl();
    }
	@Test(expected = TicketException.class)
	public void testtransportDetailsNegative() throws exception {
	
	}

}
