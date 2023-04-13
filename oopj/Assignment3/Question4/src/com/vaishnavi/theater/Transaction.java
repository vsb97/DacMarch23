package com.vaishnavi.theater;

import java.time.LocalDate;
import java.util.Arrays;

import com.vaishnavi.main.Customer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Transaction {
	
	String id;
	Customer user;
	int noOfTickets;
	String seats[];
	LocalDate ld;
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", user=" + user.getName() + ", noOfTickets=" + noOfTickets + ", seats="
				+ Arrays.toString(seats) +  "]";
	}
	
	
	

}
