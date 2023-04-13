package com.vaishnavi.library;

import java.util.Scanner;

public class Library {
	
	private int capacityOfLibrary=50;
	private Librarian l;
	private Book book[] = new Book[capacityOfLibrary];
	private static int bookIndex = 0;
	static Scanner sc = new Scanner(System.in);
	
	void addBook() {
		if(bookIndex<=capacityOfLibrary-1) {
			System.out.println("Enter title of the book");
			String nameOfBook=sc.nextLine();
			Book b;
			if((b=searchBook(nameOfBook)) != null) {
				b.setNoOFCopies(b.getNoOFCopies()+1);
			//	book[bookIndex]=b;
				bookIndex++;
				System.out.println("Added book to the already available set");
			}
			else {
				System.out.println("Enter author of the book");
				String author=sc.nextLine();
				System.out.println("Enter ISBN of the book");
				String isbn=sc.nextLine();
				System.out.println("Enter publisher of the book");
				String publisher=sc.nextLine();
				
				b= new Book(nameOfBook,author,isbn,publisher,1);
				book[bookIndex]=b;
				bookIndex++;
				System.out.println("Added book newly!");
			}
			showBookArr();
		}
		else
			System.out.println("No more space in library");
	}
	
	
	void removeBook() {
		if(bookIndex>0) {
			System.out.println("Enter title of the book");
			String nameOfBook=sc.nextLine();
			Book b;
			if((b=searchBook(nameOfBook)) != null) {
				if(b.getNoOFCopies()>=2) {
					b.setNoOFCopies(b.getNoOFCopies()-1);
					bookIndex--;
					System.out.println("Removed book from the already available set");
				}
				else {
					for(int i=0;i<book.length;i++) {
						if(book[i]!=null && book[i].getTitile().equalsIgnoreCase(b.getTitile())) {
							book[i]=null;
							break;
						}
					}
					shiftarr();
					bookIndex--;
					System.out.println("Removed the only book!");
				}
				showBookArr();
			}
			else 				
				System.out.println("There is no such  book!");		
		}
		else
			System.out.println("No book available to remove from library");
	}
	
	
	private void shiftarr() {
		for(int i=0;i<book.length-1;i++) {
			if(book[i]==null && book[i+1]!=null) {
				book[i]=book[i+1];
			}
			else
				break;
			book[i]=null;
		}
		
	}
	Book searchBook(String nameOfBook) {
		for(int i=0;i<book.length;i++) {
			if(book[i]!=null && book[i].getTitile().equalsIgnoreCase(nameOfBook)) {
				System.out.println("Book found!");
				return book[i];
			}
		}
		System.out.println("Book NOT found!");
		return null;
	}
	int getTotalNoOfBooks() {
		return bookIndex;
	}
	void showBookArr() {
		for(int i=0;i<book.length;i++) {
			if(book[i]!=null ) {
				System.out.println(book[i].toString());
			}
		}
	}
}
