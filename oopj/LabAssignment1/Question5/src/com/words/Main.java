package com.words;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static String function(){
		
		System.out.println("Enter string");
		while(true) {
			
			String str = sc.nextLine();
			int flag=0;
			for(int i=0; i<str.length(); i++) {
				Character c = str.charAt(i);
				if(!Character.isAlphabetic(c) ) {
					if(Character.isSpaceChar(c))
						continue;
					flag=1;break;
				}
			}
			if(flag==1) {
				System.out.println("Invalid input!");
				System.out.println("Re-enter the string.:");
				continue;
			}
			else {
				return str;
			}
		}
		
	}

	public static void main(String[] args) {
		
		String str = function();
		
		String arr[]=str.split(" ");
		
		System.out.println("No of words.:"+arr.length);

	}

}
