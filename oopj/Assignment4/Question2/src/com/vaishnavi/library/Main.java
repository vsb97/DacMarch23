package com.vaishnavi.library;

import java.util.Scanner;

public class Main {

	static Scanner sc =new Scanner(System.in);
	
	public static void main(String[] args) {
		Library lib = new Library();
		int choice;
		while((choice=Main.menuList())!=0) {
			switch(choice) {
			case 1:
				lib.addBook();
				break;
			case 2:
				lib.removeBook();
				break;
			case 3:
				sc.nextLine();
				System.out.println("Enter title of book to be searched");
				lib.searchBook(sc.nextLine());
				break;
			case 4:
				System.out.println("Total number of Books.:"+lib.getTotalNoOfBooks());
				break;
			}
		}

	}

	private static int menuList() {
		System.out.println("0. exit");
		System.out.println("1. addBook");
		System.out.println("2. removeBook");
		System.out.println("3. searchBook");
		System.out.println("4. totalNoOfBooks");
		System.out.println("Enter choice.:");
		return sc.nextInt();
	}

}
