package com.vaishnavi.vehicle;

import lombok.Data;

@Data
public class Truck extends Vehicle{

	private double cargoCapacity;
	
	public Truck(String make, String model, int year, double dailyRentalRate, double cargoCapacity) {
		super(make, model, year, dailyRentalRate);
		this.cargoCapacity=cargoCapacity;
	}

	@Override
	void calculateRentalFee(int days) {
		double rent;
		rent=days*dailyRentalRate;
		if(cargoCapacity>5000) {
			rent = rent + (30*days);
		}
		System.out.println("Rent for truck is.: "+rent);
		
	}
	

}
