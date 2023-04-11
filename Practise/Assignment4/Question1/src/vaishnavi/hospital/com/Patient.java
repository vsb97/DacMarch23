package vaishnavi.hospital.com;

public class Patient {

	String name;
	int age;
	String gender;
	String address;
	
	int mrCount;
	
	public Patient(String name, int age, String gender, String address) {
		//super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + ", mrCount="
				+ mrCount + "]";
	}

}
