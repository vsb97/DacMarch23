package com.string.palindrome;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String n = "";
		System.out.println("Enter string");
		while(true) {
			
			String str = sc.nextLine();
			int flag=0;
			for(int i=0; i<str.length(); i++) {
				Character c = str.charAt(i);
				if(!Character.isAlphabetic(c)) {
					flag=1;
				}
			}
			if(flag==1) {
				System.out.println("Invalid input!");
				System.out.println("Re-enter the string.:");
				continue;
			}
			else {
				for(int i=str.length()-1; i>=0; i--) {
					n=n+(str.charAt(i));
				}
				if(str.equals(n))
					System.out.println("The string is a palindrome");
				else
					System.out.println("The string is NOT a palindrome");
				break;
			}
		}

	}

}
