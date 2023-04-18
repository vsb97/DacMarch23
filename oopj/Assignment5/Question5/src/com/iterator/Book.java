package com.iterator;

import java.util.Iterator;

public class Book implements Iterable<Book>{
	
	String title;
	String author;
	int year;
	Book next ;
	
	public Book() {}
	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.next = null;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
	}


	@Override
	public Iterator<Book> iterator() {
		Iterator<Book> itr = new BookCollection(this);
		return itr;
	}
	
	

}
