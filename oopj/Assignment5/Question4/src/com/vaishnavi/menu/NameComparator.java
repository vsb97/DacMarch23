package com.vaishnavi.menu;

import java.util.Comparator;

public class NameComparator implements Comparator<Menu>{

	@Override
	public int compare(Menu o1, Menu o2) {
		return o1.name.compareTo(o2.name);
	}

}
