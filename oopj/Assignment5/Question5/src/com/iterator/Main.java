package com.iterator;

import java.util.Scanner;

public class Main {

	static Book barr[] = new Book[10];
	static int index=0;
	static BookCollection bcol=new BookCollection();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice=10;
		
		while((choice=Main.menuList())!=0) {
			switch(choice) {
			case 1:
				bcol.addBook(acceptRecord());
				break;
			case 2:
				sc.nextLine();
				System.out.print("Enter book name.:");
				String name = sc.nextLine();
				bcol.removeBook(name);
				break;
			case 3:
				bcol.getBooks();
				break;

			}		
		}
	}

	private static Book acceptRecord() {
		sc.nextLine();
		System.out.println("Enter title.:");
		String name = sc.nextLine();
		System.out.println("Enter author.:");
		String author = sc.nextLine();
		System.out.println("Enter publication year.:");
		int year = sc.nextInt();
		Book b = new Book(name,author,year);
		return b;
	}

	private static int menuList() {
		System.out.println("0. Exit");
		System.out.println("1. Add book");
		System.out.println("2. Remove book");
		System.out.println("3. Get Book");
		System.out.print("Enter your choice.:");
		return sc.nextInt();
	}
}
