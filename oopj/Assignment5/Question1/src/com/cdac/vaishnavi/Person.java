package com.cdac.vaishnavi;

public class Person implements Cloneable{
	
	String name;
	Address ad;
	

	public Person(String name, Address ad) {
		super();
		this.name = name;
		this.ad = ad;
	}

	@Override
	protected Person clone() throws CloneNotSupportedException {
		Person other = (Person) super.clone();
		other.ad= this.ad.clone();
		return other;	
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", ad=" + ad.toString() + "]";
	}

	public static void main(String[] args) {
		
		Address ad= new Address("ShreeNagar","Nanded","Maharashtra");
		Person p1 = new Person("Vaishanvi",ad);
		
		try {
			Person p2 = p1.clone();
			System.out.println(p1.toString());
			System.out.println(p2.toString());
			p2.name="Athrva";
			p2.ad.city="Zansi";
			System.out.println(p1.toString());
			System.out.println(p2.toString());
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
