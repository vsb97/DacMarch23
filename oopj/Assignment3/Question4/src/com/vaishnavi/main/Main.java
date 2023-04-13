package com.vaishnavi.main;

import java.util.Scanner;

import com.vaishnavi.theater.Test;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	static int menuList() {
		System.out.println("0. Exit");
		System.out.println("1. Show Seating chart customer");
		System.out.println("2. Book Ticket");
		//System.out.println("3. add staff");
		System.out.println("4. view report");
		System.out.println("5. view available seats staff");
		System.out.print("Enter your choice.: ");
		
		return sc.nextInt();
	}

	public static void main(String[] args) {
		int choice;
		Test test = new Test();
		while((choice=menuList())!=0) {
			switch(choice) {
			case 0:return;
			
			case 1:test.showChartCust();
					break;
					
			case 2:test.bookTicket();
			break;
			
//			case 3:test.addStaff();
//			break;
			
			case 4:test.viewReport();
			break;
			
			case 5:test.viewAvailableSeatsStaff();
			break;
			}
		}

	}

}
