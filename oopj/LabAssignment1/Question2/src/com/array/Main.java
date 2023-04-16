package com.array;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter size of array.:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.print("enter element.:");
			arr[i]=sc.nextInt();
		}


		System.out.println("The sum of the elements in the array is: "+function(arr));
		
		

	}
	private static int function(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
		
	}

}
