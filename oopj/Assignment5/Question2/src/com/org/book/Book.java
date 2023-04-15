package com.org.book;

import java.time.LocalDate;

public class Book implements Comparable<Book>{

	String title;
	String author;
	LocalDate publicationYear;
	
	public Book(String title, String author, LocalDate publicationYear) {
		super();
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}

	@Override
	public int compareTo(Book o) {
		return this.publicationYear.compareTo(o.publicationYear);
	}

	@Override
	public String toString() {
		return String.format("%-15s%-10s%-10s", this.title, this.author, this.publicationYear);
	}
	
	

}
