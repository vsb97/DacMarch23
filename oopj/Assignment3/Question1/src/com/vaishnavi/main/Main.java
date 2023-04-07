package com.vaishnavi.main;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	private static char menu() {
		
		System.out.println("a to accept array.");
		System.out.println("b to display array.");
		System.out.println("c to calcualte array ele sum.");
		System.out.println("d to find average of array ele.");
		System.out.println("e to find largest ele array.");
		System.out.println("f to find smallest ele array.");
		System.out.println("g sort the array.");
		System.out.println("h to exit.");
		System.out.println("Enter you choice from below options.: ");
		
		char ch = sc.nextLine().charAt(0);
		//sc.nextLine();
		return ch;
	}
	
	public static void main(String[] args) {
		char ch='A';
		MyInteger mi = new MyInteger();
		while(ch != 'h') {
			ch = Main.menu();
		
		switch (ch) {
		case 'a': 
			mi.acceptArray();
			break;
		case 'b': 
			mi.displayArray();
			break;
		case 'c':
			mi.sumOfAllEle();
			break;
		case 'd':
			mi.averageOfAllEle();
			break;
		case 'e':
			mi.largestEle();
			break;
		case 'f':
			mi.smallestEle();
			break;
		case 'g':
			mi.sortArr();
			break;
		case 'h':
			System.out.println("Thank you!!!");
			return;	
		default:System.out.println("Enter right input. ");
			
		}
		}

	}

	

}
