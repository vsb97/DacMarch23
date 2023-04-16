package com.iterator;

import java.util.Iterator;

public class BookCollection implements Iterator<Book>{
	
	
	void addBook(Book book) {
		if(Main.index<10) {
			Main.barr[Main.index]=book;
			Main.index++;
			System.out.println("Added the Book!");
		}
		else 
			System.out.println("Book array is full!");
	}
	void removeBook(String name) {
		if(Main.index==0) {
			System.out.println("There is no Book to remove!");
		}
	else {
		for(int i=0;i<Main.barr.length;i++) {
			if(Main.barr[i]!=null && Main.barr[i].title.equals(name)) {
				shift(i);
				System.out.println("Removed the Book!");
				Main.index--;
				break;
			}
		}
	}
	}
	private void shift(int i) {
		
		for(int k=i;k<Main.barr.length-1; k++) {
			Main.barr[i]=Main.barr[i+1];
		}
		Main.barr[Main.barr.length-1]=null;
		
	}
	void getBooks() {
		for(int k=0;k<Main.index; k++) {
			if(Main.barr[k]!= null) {
				System.out.println(Main.barr[k].toString());
			}
		}
	}

	private Book trav;
	
	public BookCollection() {	}
	public BookCollection(Book head) {
		this.trav = head;
	}
	@Override
	public boolean hasNext() {
		return this.trav != null;
	}

	@Override
	public Book next() {
		Book b = trav;
		trav=trav.next;
		return b;
	}

}
