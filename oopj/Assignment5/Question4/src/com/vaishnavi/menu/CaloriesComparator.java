package com.vaishnavi.menu;

import java.util.Comparator;

public class CaloriesComparator implements Comparator<Menu>{

	@Override
	public int compare(Menu o1, Menu o2) {
		return o1.calories-o2.calories;
	}

}
