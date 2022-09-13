package com.example.FXTrading.entity;

import org.springframework.stereotype.Component;


@Component
public class Book {
	private String customerName;
	private String currencyPair;
	private double transferAmount;
	private String getRate;
	private String tradeConfirmation;

	public Book(String customerName, String currencyPair, double transferAmount, String getRate,
			String tradeConfirmation) {
		super();
		this.customerName = customerName;
		this.currencyPair = currencyPair;
		this.transferAmount = transferAmount;
		this.getRate = getRate;
		this.tradeConfirmation = tradeConfirmation;
	}

	public Book() {
		super();
		//TODO Auto-generated constructor stub
	}

	public double getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(float transferAmount) {
		this.transferAmount = transferAmount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCurrencyPair() {
		return currencyPair;
	}

	public void setCurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}
	public String getGetRate() {
		return getRate;
	}

	public void setGetRate(String getRate) {
		this.getRate = getRate;
	}

	@Override
	public String toString() {
		return "Book [customerName=" + customerName + ", currencyPair=" + currencyPair + ", transferAmount="
				+ transferAmount + ", getRate=" + getRate +"]";
	}
	
}
