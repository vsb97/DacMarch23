package com.vaishnavi.library;

public class Book {
	private String titile; 
	private String author;
	private String ISBN;
	private String publisher;
	private int noOFCopies;
	public Book(String titile, String author, String iSBN, String publisher, int noOFCopies) {
		super();
		this.titile = titile;
		this.author = author;
		ISBN = iSBN;
		this.publisher = publisher;
		this.noOFCopies = noOFCopies;
	}
	public String getTitile() {
		return titile;
	}
	public void setTitile(String titile) {
		this.titile = titile;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "Book [titile=" + titile + ", author=" + author + ", ISBN=" + ISBN + ", publisher=" + publisher +noOFCopies+ "]";
	}
	public int getNoOFCopies() {
		return noOFCopies;
	}
	public void setNoOFCopies(int noOFCopies) {
		this.noOFCopies = noOFCopies;
	}
	
	
}
