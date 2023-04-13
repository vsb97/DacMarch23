package com.vaishnavi.theater;

import java.time.LocalDate;
import java.util.Scanner;

import com.vaishnavi.main.Customer;

public class Test {
	static Scanner sc= new Scanner(System.in);
	Theater th = Theater.getreference();

	public void showChartCust() {
		System.out.println("--------------Theater seats:--------------");
		for(int i=0; i<Theater.rows; i++) {
			for(int j=0; j<Theater.columns; j++) {
				if(th.getSeatStatus(i, j)==false)
					System.out.print("["+i+"]["+j+"]"+"Y   ");
				else
					System.out.print(i+"-"+j+"N  ");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
	}

	public void addStaff() {
		if(Theater.staffArrCount<Theater.totalStaffNo-1) {
			sc.nextLine();
			System.out.print("Enter staff name.:");
			String name= sc.nextLine();
			System.out.print("Enter staff address.:");
			String add= sc.nextLine();
			System.out.print("Enter staff phone number.:");
			String no= sc.nextLine();
			
			Staff s = new Staff(name,Integer.toString(Theater.staffArrCount),no,add);
			th.addStaff(s);
			
		}		
	}

	public void viewReport() {
		sc.nextLine();
		System.out.println("Enter password.:");
		if("VB".equals(sc.nextLine())) {
			//noof seats sold// revenue// transactions.
			revenue();
			System.out.println("---------------All Transactions!--------------");
			if(th.tran!=null) {
				for(int i=0;i<th.tran.length;i++) {
					if(th.tran[i]!=null)
						System.out.println(th.tran[i].toString());
//					else
//						System.out.print("t is null");
				}
//				for(Transaction t: th.tran) {
//					if(t!=null)
//						t.toString();
//					else
//						System.out.print("t is null");
//				}
			}
			else
				System.out.println("No transactions today!");
		}
		else
			System.out.println("Incorrect password!");
		
	}

	private void revenue() {
		float totalRevenue=0f;
		for(int i=0; i<Theater.rows; i++) {
			for(int j=0; j<Theater.columns; j++) {
				if(th.getSeatStatus(i, j)==true)
					totalRevenue+=Theater.priceOfSeat;
			}
		}
		System.out.println("Total Revenue.:"+totalRevenue);
	}

	public void viewAvailableSeatsStaff() {
		System.out.println("Enter password.:");
		sc.nextLine();
		if("VB".equals(sc.nextLine())) {
			System.out.println("Total no of available seats.: "+th.getTotalNoOfAvailableSeats());
			showChartCust();
		}
		else
			System.out.println("Incorrect password!");
	}

	public void bookTicket() {
		sc.nextLine();
		System.out.print("Enter your name.:");
		String name= sc.nextLine();
		System.out.print("Enter your address.:");
		String add= sc.nextLine();
		System.out.print("Enter your phone number.:");
		String no= sc.nextLine();
		
		Customer c = new Customer(name, add, no);
		System.out.println("Enter total seats you want to reserve.:");
		int total= sc.nextInt();
		if(th.getTotalNoOfAvailableSeats()>=total) {
			//showChartCust();
			String arr[]=new String[total];
			System.out.println(th.tranCount);
			th.tran[th.tranCount] = new Transaction(name+no, c, total, arr, LocalDate.now());		
			//System.out.println(th.tran[th.tranCount].toString());
			for(int k=0; k<total; k++) {
				System.out.println("Select your seat row.:");
				int i= sc.nextInt();
				System.out.println("Select your seat column.:");
				int j= sc.nextInt();
				
				if(th.getSeatStatus(i, j)==false) {
					th.setSeatStatus(i, j);
					arr[k]= "s"+i+j;
				}
				else 
					{System.out.println("Seat is already booked!");k--;}
			}
			System.out.println(th.tran[th.tranCount].toString());
			System.out.println("Seats booked!");
			
			th.tranCount++;
		}
		else
			System.out.println(total+" seat(s) is/are not available!");
		
	}
}
