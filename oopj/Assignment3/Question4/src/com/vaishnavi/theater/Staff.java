package com.vaishnavi.theater;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Staff {
	
//	static int i=1; //int to maintain id of staff.
	String name;
	String id;
	String phoneNo;
	@ToString.Exclude String address;

}
