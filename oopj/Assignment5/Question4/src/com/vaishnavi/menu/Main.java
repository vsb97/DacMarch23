package com.vaishnavi.menu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static Menu[] getArr() {
		Menu arr[] = {
				new Menu("a",256,10),
				new Menu("b",450,46),
				new Menu("c",100,23),
				new Menu("d",46,67),
				new Menu("e",367,98),
				new Menu("f",243,12),
				new Menu("g",23,29),
				new Menu("h",2345,55),
				new Menu("i",45,33)
		};
		return arr;
	}
	
	private static int menuList() {
		System.out.println("0. Exit.");
		System.out.println("1. sort by name.");
		System.out.println("2. sort by price.");
		System.out.println("3. sort by calories.");
		System.out.print("Enter choice.:");
		return sc.nextInt();
	}


	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Menu arr[] = Main.getArr();
		int choice=10;
		Comparator c = null;
		while( (choice=Main.menuList())!=0) {
			
			switch(choice) {
			case 1:c=new NameComparator();
				break;
			
			case 2:c=new PriceComparator();
				break;
				
			case 3:c=new CaloriesComparator();
				break;
				
			}
			
			Arrays.sort(arr, c);
			
			for(Menu m : arr) {
				System.out.println(m.toString());
			}
		}
		

	}

}
