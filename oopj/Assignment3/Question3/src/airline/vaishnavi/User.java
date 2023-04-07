package airline.vaishnavi;

class User {

	String name;
	String email;
	String contactNo;
		
	String[] reservations= new String[3];
	int seat[]=new int[3];
	int count;
	
	User(String name,String email,String contactNo) {
		this.name=name;
		this.email=email;
		this.contactNo=contactNo;
	}
	
	
}
