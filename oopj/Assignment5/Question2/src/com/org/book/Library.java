package com.org.book;

import java.time.LocalDate;
import java.util.Arrays;

public class Library {
	
	private Book arr[]=new Book[5];

	public static void main(String[] args) {
		
		Library lb = new Library();
		lb.arr[0] = new Book("adasbc","abc",LocalDate.parse("1980-10-17"));
		lb.arr[1] = new Book("xyz","xyz",LocalDate.parse("1980-09-17"));
		lb.arr[2] = new Book("pdasqr","pqr",LocalDate.parse("1980-10-27"));
		lb.arr[3] = new Book("lmn","sadlmn",LocalDate.parse("1980-03-17"));
		lb.arr[4] = new Book("stu","stu",LocalDate.parse("1967-02-22"));
		
		for(Book b:lb.arr)
			System.out.println(b.toString());
		
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println();
		
		Arrays.sort(lb.arr);
		
		for(Book b:lb.arr)
			System.out.println(b.toString());

	}

}
