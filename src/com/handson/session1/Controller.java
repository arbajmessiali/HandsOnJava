package com.handson.session1;

import java.util.*;

public class Controller {

	private static List<Guest> allGuest = new ArrayList<Guest>();
	private static List<Room> rooms = Hotel.getRooms();

	public static void register() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		System.out.println("Enter address: ");
		String address = sc.next();
		System.out.println("Enter email: ");
		String email = sc.next();
		Guest g = new Guest(name, age, address, email);
		allGuest.add(g);
		System.out.println(g.getName());
		System.out.println("Do you want to add more? [yes/no]");
		String a = sc.next();
		if (a.equalsIgnoreCase("yes"))
			register();
		else
			Hotel.options();
		sc.close();
	}

	public static void book() {
		Scanner sc = new Scanner(System.in);
		boolean status = true;
		System.out.println("select room number to book: ");
		for (int i = 0; i < 10; i++)
			System.out.println((100 + i) + "\t");
		int check = sc.nextInt();
		if ((check - 100) < 10) {
			if ((rooms.get(check - 100).getStatus()).equalsIgnoreCase("vacant")) {
				for (int i = 0; i < allGuest.size(); i++) {
					System.out.println((i + 1) + "\t" + allGuest.get(i).getName());
				}
				while (status) {
					System.out.println("Select Customer ID?");
					int custId = sc.nextInt();
					if (custId > allGuest.size()) {
						System.out.println("Wrong Id");
					} else {
						rooms.get(check - 100).setBookedBy(allGuest.get(custId - 1).getName());
						rooms.get(check - 100).setStatus("booked");
						System.out.println("Room "+check+" has been booked by "+rooms.get(check - 100).getBookedBy());
						status = false;
					}
				}
				Hotel.options();
			} else {
				System.out.println("Room is booked. Select another room.");
				book();
			}
		}
		sc.close();
	}

	public static void checkRoom() {
		Scanner sc = new Scanner(System.in);
		System.out.println("select room number to check: ");
		int check = sc.nextInt();
		if ((check - 100) > 9) {
			System.out.println("Wrong room number");
			checkRoom();
		} else {
			System.out.println(rooms.get(check - 100).getStatus());
			Hotel.options();
		}
		sc.close();
	}

	public static void email() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < allGuest.size(); i++) {
			System.out.println(allGuest.get(i).getName() + "\t\t\t" + allGuest.get(i).getAge() + "\t\t\t"
					+ allGuest.get(i).getAddress() + "\t\t\t" + allGuest.get(i).getEmail());
		}
		System.out.println("Select the guest to update email: ");
		int select = sc.nextInt();
		if (select >= allGuest.size()) {
			System.out.println("Select correct option");
			email();
		} else {
			System.out.println("Enter new email: ");
			String newAddress = sc.next();
			allGuest.get(select).setAddress(newAddress);
			for (int i = 0; i < allGuest.size(); i++)
				System.out.println(allGuest.get(i).getName() + "\t\t\t" + allGuest.get(i).getAge() + "\t\t\t"
						+ allGuest.get(i).getAddress() + "\t\t\t" + allGuest.get(i).getEmail());
			Hotel.options();
		}
		sc.close();
	}

	public static void getAllBookings() {
		for (int i = 0; i < rooms.size(); i++)
			System.out.println((rooms.get(i).getRoomNo()) + "\t\t" + (rooms.get(i).getStatus()) + "\t\t"
					+ (rooms.get(i).getBookedBy()));
		Hotel.options();
	}

	public static void getAllCustomers() {
		for (int i = 0; i < allGuest.size(); i++) {
			System.out.println(allGuest.get(i).getName() + "\t\t\t" + allGuest.get(i).getAge() + "\t\t\t"
					+ allGuest.get(i).getAddress() + "\t\t\t" + allGuest.get(i).getEmail());
		}
		Hotel.options();
	}

	public static boolean exit() {
		return false;
	}
}