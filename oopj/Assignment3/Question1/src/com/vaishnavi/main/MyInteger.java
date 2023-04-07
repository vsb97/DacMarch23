package com.vaishnavi.main;

import java.util.Arrays;
import java.util.Scanner;

public class MyInteger {
	
	static Scanner sc = new Scanner(System.in);
	int[] arr;

	public void acceptArray() {
		// TODO Auto-generated method stub
		System.out.print("Enter size of array: ");
		arr = new int[sc.nextInt()];
		System.out.print("Enter elements of array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Succesfully accepted the array! ");
		System.out.println("------------------------------------------------- ");
		
	}

	public void displayArray() {
		if(arr!=null) {
		System.out.println("Elements of array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println("\nSuccesfully printed the array! ");
		System.out.println("------------------------------------------------- ");}
		else {
			System.out.println("\nFirst select option a to enter the array elements! ");
			System.out.println("------------------------------------------------- ");
		}
		
	}

	public void sumOfAllEle() {
		if(arr!=null) {
			System.out.print("Sum of array elements : ");
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i];
			}
			System.out.println(sum);
			System.out.println("------------------------------------------------- ");}
			else {
				System.out.println("\nFirst select option a to enter the array elements! ");
				System.out.println("------------------------------------------------- ");
			}		
	}

	public void averageOfAllEle() {
		if(arr!=null) {
			System.out.print("Average of array elements : ");
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i];
			}
			System.out.println((double)sum/(double)arr.length);
			System.out.println("------------------------------------------------- ");}
			else {
				System.out.println("\nFirst select option a to enter the array elements! ");
				System.out.println("------------------------------------------------- ");
			}		
	}

	public void largestEle() {
		if(arr!=null) {
			System.out.print("Largest element of array : ");
			int largest=Integer.MIN_VALUE;
			for(int i=0;i<arr.length;i++) {
				if(largest<arr[i])
					largest = arr[i];
			}
			System.out.println(largest);
			System.out.println("------------------------------------------------- ");}
			else {
				System.out.println("\nFirst select option a to enter the array elements! ");
				System.out.println("------------------------------------------------- ");
			}		
	}

	public void smallestEle() {
		if(arr!=null) {
			System.out.print("Smallest element of array : ");
			int smallest=Integer.MAX_VALUE;
			for(int i=0;i<arr.length;i++) {
				if(smallest>arr[i])
					smallest = arr[i];
			}
			System.out.println(smallest);
			System.out.println("------------------------------------------------- ");}
			else {
				System.out.println("\nFirst select option a to enter the array elements! ");
				System.out.println("------------------------------------------------- ");
			}			
	}

	public void sortArr() {
		if(arr!=null) {
			System.out.print("Sorted array : ");
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			System.out.println("------------------------------------------------- ");}
			else {
				System.out.println("\nFirst select option a to enter the array elements! ");
				System.out.println("------------------------------------------------- ");
			}			
	}

}
