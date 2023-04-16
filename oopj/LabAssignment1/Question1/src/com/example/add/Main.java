package com.example.add;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a[] = new int[1];
		int b[] = new int[1];
		
		System.out.println("Enter 2 int values.: ");
		a[0] = sc.nextInt();
		b[0] = sc.nextInt();
		
		System.out.println("a and b before swapping.:"+a[0] +"    "+ b[0]);
		function(a,b);
		System.out.println("a and b after  swapping.:"+a[0] +"    "+ b[0]);
		
	}

	private static void function(int[] a, int[] b) {
		
		a[0] = a[0]+b[0];
		b[0] = a[0]-b[0];
		a[0] = a[0]-b[0];
		
		
	}

}
