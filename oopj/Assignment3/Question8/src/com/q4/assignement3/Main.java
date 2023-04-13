package com.q4.assignement3;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Test t = new Test();
		
		System.out.println("1.sunday");
		System.out.println("2.monday");
		System.out.println("3.tuesday");
		System.out.println("4.wednesday");
		System.out.println("5.thursday");
		System.out.println("6.friday");
		System.out.println("7.saturday");
		System.out.print("Enter choice.:");
		
		switch(sc.nextInt()) {
			case 1:
				t.callingMethod(DayOfWeek.SUNDAY);
				break;
				
			case 2:
				t.callingMethod(DayOfWeek.MONDAY);
				break;
				
			case 3:
				t.callingMethod(DayOfWeek.TUESDAY);
				break;
			
			case 4:
				t.callingMethod(DayOfWeek.WEDNESDAY);
				break;
				
			case 5:
				t.callingMethod(DayOfWeek.THRUSDAY);
				break;
				
			case 6:
				t.callingMethod(DayOfWeek.FRIDAY);
				break;
				
			case 7:
				t.callingMethod(DayOfWeek.SATURDAY);
				break;
		
		}

	}

}
