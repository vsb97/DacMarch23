package com.vaishnavi.menu;

import java.util.Comparator;

public class PriceComparator implements Comparator<Menu>{

	@Override
	public int compare(Menu o1, Menu o2) {
		return (int) (o1.price-o2.price);
	}

}
