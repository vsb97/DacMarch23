package com.vaishnavi.menu;

public class Menu implements Comparable<Menu>{

	String name;
	double price;
	int calories;
	
	public Menu(String name, double price, int calories) {
		this.name = name;
		this.price = price;
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Menu [name=" + name + ", price=" + price + ", calories=" + calories + "]";
	}

	@Override
	public int compareTo(Menu o) {
		// TODO Auto-generated method stub
		return (int) (this.price-o.price);
	}
	
	
	
	
}
