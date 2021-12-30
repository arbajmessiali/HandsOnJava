package com.handson.session1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {
	
	public static boolean status = true;
	public static int choice;
	private static List<Room> allRoom = new ArrayList<Room>();
	
	public static void main(String[] args) {
		for(int i=0; i<20; i++)
		{
			Room r;
			if(i%2==0)
				r = new Room((100+i),"nonAc", "vacant", "");
			else
				r = new Room((100+i),"AC", "vacant", "");
			allRoom.add(r);
		}
		options();
	}

	public static List<Room> getRooms() {
		return allRoom;
	}
	
	public static void options() {
		while (status) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose from menu: ");
			System.out.println("1. Register new customer");
			System.out.println("2. Book a room");
			System.out.println("3. Check room status");
			System.out.println("4. Change/update email");
			System.out.println("5. Check all bookings");
			System.out.println("6. Check all customer deatils");
			System.out.println("7. Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Controller.register();
				break;
			case 2:
				Controller.book();
				break;
			case 3:
				Controller.checkRoom();
				break;
			case 4:
				Controller.email();
				break;
			case 5:
				Controller.getAllBookings();
				break;
			case 6:
				Controller.getAllCustomers();
				break;
			case 7:
				status = Controller.exit();
				System.out.println("Thank You!");
				break;
			}
			sc.close();
		}
	}
}
