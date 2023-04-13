package com.vaishnavi.vehicle;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Car extends Vehicle{

	private int numDoors;
	
	public Car(String make, String model, int year, double dailyRentalRate, int numDoors) {
		super(make, model, year, dailyRentalRate);
		this.numDoors = numDoors;
	}

	@Override
	void calculateRentalFee(int days) {
		double rent;
		rent=days*dailyRentalRate;
		if(numDoors>2) {
			rent = rent + (10*days);
		}
		System.out.println("Rent for car is.: "+rent);
		
	}
	
	
}
