package com.iterator;

import java.util.Iterator;

public class BookCollection implements Iterator<Book>{
	
	private Book head = null;
	private Book tail = null;
	private Book trav;
	
	public BookCollection() {	}
	public BookCollection(Book head) {
		this.trav = head;
	}
	
	public boolean empty( ) {
		return this.head == null;
	}
	
	void addBook(Book book) {
		if( this.empty() ) 
			this.head = book;
		else
			this.tail.next = book;
		this.tail = book;
	}

	
	  void removeBook(String name) {
		  if(this.empty()) 
			  System.out.println("No book available to remove!");
		  else if(!this.empty() && this.head.title.equals(name) && this.head.next==null) {
			  this.head=null;
			  this.tail=null;
			  System.out.println("Removed the only book!");
		  }
		  else if(!this.empty() && this.head.title.equals(name) && this.head.next!=null) {
			  this.head=this.head.next;
			  System.out.println("Book found at index 1 .. removed successfully");
		  }
		  else if(!this.empty() && this.tail.title.equals(name)) {
			  this.trav=this.head;
			  while(this.trav.next!=this.tail) {
				  this.trav=this.trav.next;
			  }
			  this.trav.next=null;
			  this.tail=this.trav;
			  System.out.println("Book found at last .. removed successfully");
		  }
		  else {
			  this.trav=this.head;
			  while(!this.trav.next.title.equals(name)) {
				  this.trav=this.trav.next;
			  }
			  Book temp = this.trav.next;
			  this.trav.next=temp.next;
			  temp.next=null;
			  temp=null;
			  System.out.println("Book found in middle.. removed successfully");
		 
		  }
	  }
	 
	
	void getBooks() {
		if(!this.empty()) {
			for( Book element : this.head )
				System.out.println( element );
		}
		else 
			System.out.println("List is empty!");
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
