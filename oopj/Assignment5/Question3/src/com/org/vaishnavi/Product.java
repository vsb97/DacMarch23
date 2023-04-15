package com.org.vaishnavi;

public class Product implements Comparable<Product>{
	
	String name;
	double price;
	String category;
	
	public Product(String name, double price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}

	@Override
	public int compareTo(Product o) {
		System.out.println("Inside default compare to");
		return 0;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	
	

}
