package com.vaishnavi.vehicle;

import lombok.Data;

@Data
public class MotorCycle extends Vehicle{

	private int engineSize;
	
	public MotorCycle(String make, String model, int year, double dailyRentalRate, int engineSize) {
		super(make, model, year, dailyRentalRate);
		this.engineSize = engineSize;
	}

	@Override
	void calculateRentalFee(int days) {
		double rent;
		rent=days*dailyRentalRate;
		if(engineSize>1000) {
			rent = rent + (20*days);
		}
		System.out.println("Rent for Motorcycle is.: "+rent);
		
	}	
	
}
