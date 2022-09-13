package com.example.FXTrading.service;
import java.util.ArrayList;
import com.example.FXTrading.entity.Book;
import com.example.FXTrading.entity.Print;
import org.springframework.stereotype.Repository;

	@Repository
	public class BookingServices {
		double amount ;
		double rate = 66.00;
		static int tradeNo = 0;
		static ArrayList<Print> data = new ArrayList<>();
		
		public ArrayList<Print> printTrade(){
			return data;
		}
		public String booking(Book book, String bookingconfirmation) {
	     if(book.getCustomerName().matches("^[a-zA-Z\\s\\.]*$")) {
	    	 if(book.getCurrencyPair().equalsIgnoreCase("USDINR")) {
	    		 if(book.getTransferAmount()>0) {
	    			 amount = book.getTransferAmount()*rate;
	    			 if(bookingconfirmation.equalsIgnoreCase("Book")) {
	    			 if(book.getGetRate().equalsIgnoreCase("yes")) {
	    				data.add(new Print(++tradeNo, book.getCurrencyPair(), book.getCustomerName(), book.getTransferAmount(), rate));
	    				
	    				return "Your Trade was booked succesfully  ";
	    			 }
	    			 else if(book.getGetRate().equalsIgnoreCase("no")) {
	    				 data.add(new Print(++tradeNo, book.getCurrencyPair(), book.getCustomerName(), book.getTransferAmount(), rate));
	    				return "Your Trade was booked succesfully";
	    			 }
	    			 else {
	    				 return "Invalid entry";
	    			 }
	    			 }
	    			 else if(bookingconfirmation.equalsIgnoreCase("cancel")) {
	    				 return "Your Trade was cancelled";
	    			 }
	    			 else {
	    				 return "Invalid entry";
	    			 }
	    			 }
	    		 else {
	    			 return "Invalid amount";
	    		}
	    		}
	    	 else {
	    		 return "Invalid currency pair";
	    		 }
	    	 }
	     else {
	    	 return "name is invalid";
	    	 }
		
		}
}




