	package com.cg.pujadevi.ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;

import com.cg.pujadevi.bean.TransportBean;
import com.cg.pujadevi.exception.TicketException;
import com.cg.pujadevi.service.ITransportService;
import com.cg.pujadevi.service.TransportServiceImpl;

public class Client {
	public static void main(String[] args) {
		
		ITransportService service = new TransportServiceImpl();
		
		
		Scanner scanner = new Scanner(System.in);
		try {
			while(true){
				System.out.println("1.Add Booking details");
				System.out.println("2.Display one booking detail");
				System.out.println("3.Display All Booking Details");
				System.out.println("4.Delete a booking of ur choice");
				System.out.println("5.Update a booking details");
				System.out.println(".6 Exit");
				
				int ch = scanner.nextInt();
				switch(ch) {
		  case 1: TransportBean bean = new TransportBean();
			        Map<String, String> transportdetails = service.getTransportDetails();
			           System.out.println("Mode of Transport");
			        int count = 1;
		 	for (Map.Entry<String, String> entrySet : transportdetails
			 		.entrySet()) {
				System.out.println(count + ". " + entrySet.getValue());
				count++;
			}
			System.out.println("Enter Option");
			
			int choice = scanner.nextInt();
			int count1 = 1;
			for (Map.Entry<String, String> entrySet : transportdetails
					.entrySet()) {
				if (choice == count1) {
					System.out.println(count1 + "." + entrySet.getKey());
					bean.setTransportCategoryId(entrySet.getKey());
				}
				count1++;
			}
			int id = (int) (Math.random() * 9999);
			bean.setId(id);
			System.out.println("Enter reason");
			scanner.nextLine();
			String reason = scanner.nextLine();
			bean.setReason(reason);
			System.out.println("*** when ***");
			System.out.println("\n 1. this week\n 2.Next week \n 3.Next month");
			int whenChoice = scanner.nextInt();
			if (whenChoice == 1) {
				bean.setWhen("this week");
			}
			if (whenChoice == 2) {
				bean.setWhen("Next week");
			}
			if (whenChoice == 3) {
				bean.setWhen("Next month");
			}
			service.addTransport(bean);
		
			LocalDateTime ldt = LocalDateTime.now();
			DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MMMM yyyy hh : mm a");
			System.out.println("Booked with " + id + " on " + ldt.format(f));
			break;
	   case 2:
	    	System.out.println("Enter the id to display");
	    	int choiceDisplay = scanner.nextInt();
	    	service.displayTransportDetails(choiceDisplay);
			break;
			  
		case 3:
			 Map<Integer, TransportBean> transportdeatils = service.displayAllTransportDetails(); 
			
			for (Map.Entry<Integer,TransportBean> entrySet : transportdeatils.entrySet()) {
				System.out.println("key"+ entrySet.getKey()+"\n\nvalue"+ entrySet.getValue());
			
			}
			
			break;
		case 4:
			System.out.println("enter the id u want to delete");
			int choiceDelete=scanner.nextInt();
			service.deleteBooking(choiceDelete);
			break;
		case 5:
			System.out.println("enter the id that u want to update");
			int updateId = scanner.nextInt();
			service.updateTransportDetails(updateId);
		
		case 6 : 
			System.exit(0);
				}
			}	
		}
		 catch (TicketException ticketException) {
			System.out.println("Error in fetching details and adding data");
		 
		}catch (Exception e) {
			System.out.println(" internal error. try later.");
		}
		
				
}
	}

