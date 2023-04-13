package com.q4.assignement3;

import java.util.Arrays;

public class Test {
	
	private void printDay(DayOfWeek dow) {
		System.out.println("Day is "+ dow.name());
	}
	
	private DayOfWeek getNextDay(DayOfWeek dow) {
		DayOfWeek arr[]=DayOfWeek.values();
		return arr[((dow.ordinal())+1)%7];
	}
	
	private int getDayNumber(DayOfWeek dow) {
		
		return ((dow.ordinal())+1);
	}
	
	private DayOfWeek[] getWeekendDays() {
		DayOfWeek arr[]=DayOfWeek.values();
		DayOfWeek arr2[]= {arr[6],arr[0]};
		return arr2;
	}
	
	void callingMethod(DayOfWeek dow) {
		System.out.println();
		System.out.println();
		printDay(dow);
		System.out.println("Next day is "+getNextDay(dow).name());
		System.out.println("day number.: "+getDayNumber(dow));
		System.out.println("weekend days.:"+Arrays.toString(getWeekendDays()));
	}

}
