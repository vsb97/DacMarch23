package com.org.vaishnavi;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Product arr[] = Main.accept();
		System.out.println();
		for(Product p: arr)
			System.out.println(p.toString());
		
		System.out.println("\n----------------------------------------\n");
		PriceComparotor c= new PriceComparotor();
		Arrays.sort(arr, c);
		
		for(Product p: arr)
			System.out.println(p.toString());
		
	}
	
	static Product[] accept() {
		System.out.println("Enter size of array.:");
		int size = sc.nextInt();
		Product parr[] = new Product[size];
		
		for(int i=0; i<size; i++) {
			sc.nextLine();
			System.out.print("Enter name.:");
			String name = sc.nextLine();
			
			System.out.print("Enter price.:");
			double p = sc.nextDouble();
			
			sc.nextLine();
			System.out.print("Enter category.:");
			String cat = sc.nextLine();
			
			parr[i] = new Product(name,p,cat);
			
		}
		return parr;
	}

}
