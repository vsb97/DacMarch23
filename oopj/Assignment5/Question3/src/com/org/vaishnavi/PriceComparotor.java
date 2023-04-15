package com.org.vaishnavi;

import java.util.Comparator;

public class PriceComparotor implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return (int) (o1.price - o2.price);
	}

}
