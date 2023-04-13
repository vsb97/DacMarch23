package com.vaishnavi.vehicle;

import java.util.Scanner;

public class Main {
	
	static Scanner sc =new Scanner(System.in);
	
	public static void main(String[] args) {
		int loop = 3;
		Vehicle varr[]= new Vehicle[loop];
		int k;
		for(int i=0;i<loop;i++) {
			k=Main.menu();
			sc.nextLine();
			System.out.println("Enter make model year(int) and daily rentalrate(double) "+k);
			String make= sc.nextLine();
			String model= sc.nextLine();
			int year= sc.nextInt();
			double drr= sc.nextDouble();
			
			
			switch(k) {
			case 1: Main.car(make,model,year,drr,i,varr);break;
			case 2: Main.motorCycle(make,model,year,drr,i,varr);break;
			case 3: Main.truck(make,model,year,drr,i,varr);break;
			}
		}
		
		for(Vehicle v:varr) {//TODO
			if(v instanceof Car) {System.out.println("Enter days for Car");}
			if(v instanceof MotorCycle) {System.out.println("Enter days for MotorCycle");}
			if(v instanceof Truck) {System.out.println("Enter days for Truck");}
			v.calculateRentalFee(sc.nextInt());
		}
	}

	private static void truck(String make, String model, int i, double drr, int i2, Vehicle[] varr) {
		System.out.println("Enter cargo capacity.");
		double cc=sc.nextDouble();
		varr[i2]=new Truck(make,model,i,drr,cc);
		
	}

	private static void motorCycle(String make, String model, int i, double drr, int i2, Vehicle[] varr) {
		System.out.println("Enter engine size.");
		int es=sc.nextInt();
		varr[i2]=new MotorCycle(make,model,i,drr,es);
		
	}

	private static void car(String make, String model, int i, double drr, int i2, Vehicle[] varr) {
		System.out.println("Enter number of doors.");
		int nd=sc.nextInt();
		varr[i2]=new Car(make,model,i,drr,nd);
		
	}

	private static int menu() {
		System.out.println("1. Car");
		System.out.println("2. MotorCycle");
		System.out.println("3. Truck");
		System.out.print("Enter choice");
		
		return sc.nextInt();
	}

}
