package com.handson.session1;

public class Reservation {
	private int resv_id;
	private int noOfDays;
	private String bookingDate;
	private int amount;
	
	public int getResv_id() {
		return resv_id;
	}
	public void setResv_id(int resv_id) {
		this.resv_id = resv_id;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Reservation(int resv_id, int noOfDays, String bookingDate, int amount)
	{
		this.resv_id = resv_id;
		this.noOfDays = noOfDays;
		this.bookingDate = bookingDate;
		this.amount = amount;
	}
}
