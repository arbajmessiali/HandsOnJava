package com.handson.session1;

public class Room {
	private int roomNo;
	private String type;
	private String status;
	private String bookedBy;
	
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBookedBy() {
		return bookedBy;
	}
	public void setBookedBy(String bookedBy) {
		this.bookedBy = bookedBy;
	}
	
	public Room(int roomNo, String type, String status, String bookedBy)
	{
		this.roomNo = roomNo;
		this.type = type;
		this.status = status;
		this.bookedBy = bookedBy;
	}
}
