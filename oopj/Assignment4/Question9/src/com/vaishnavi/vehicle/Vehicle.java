package com.vaishnavi.vehicle;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public abstract class Vehicle {
	
	private String make;
	private String model;
	private int year;
	protected double dailyRentalRate;
	
	abstract void calculateRentalFee(int days);

}
