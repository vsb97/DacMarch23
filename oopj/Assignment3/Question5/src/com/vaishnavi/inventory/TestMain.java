package com.vaishnavi.inventory;

import java.util.Scanner;

public class TestMain {
	
	static Scanner sc = new Scanner(System.in);
	private static final int MAX_SHELF_NO =10;
	private Shelf[] shelf = new Shelf[MAX_SHELF_NO];
	static TestMain tm = new TestMain();
	TestMain() {
		for(int i =0; i<Shelf.SHELF_SIZE;i++) {
			shelf[i]= new Shelf();
		}
		System.out.println("Welcome!!!");
	}
	private static void display() {
		System.out.println("Shelf.....");
		for(int i=0; i<MAX_SHELF_NO;i++) {
			System.out.println("Shelf.:["+i+"]-> ");
			if(tm.shelf[i]!=null) {
				for(int j=0;j<Shelf.SHELF_SIZE;j++) {
					if(tm.shelf[i].getArr()[j]!=null) {
						System.out.print(tm.shelf[i].getArr()[j].getName()+", ");
					}
				}
			}
			System.out.println();
		}
		
	}

	private void removeItem() {
		System.out.println("Enter shelf number.:(0-9)");
		int shelfNo = sc.nextInt();
		if(shelfNo>=0 && shelfNo<10) {
			if(shelf[shelfNo]!=null && shelf[shelfNo].getShelfStatus()!=-1) {
				System.out.println("Enter item name.:");sc.nextLine();
				String str = sc.nextLine();
				for(Item item : shelf[shelfNo].getArr()) {
					if(item.getName()!=null && item.getName().equalsIgnoreCase(str)) {
						item.setName(null);
						shift(shelfNo);
						System.out.println("Removed succesfully");
						shelf[shelfNo].setShelfStatus((shelf[shelfNo].getShelfStatus())-1);
						break;
					}
				}
			}
			else
				System.out.println("Shelf is empty already!");
		}
		else
			System.out.println("Wrong shelf number entered!");
		
	}

	private void shift(int shelfNo) {
		int k=-1 ;
		for(int i=0;i<Shelf.SHELF_SIZE;i++ ) {
			if(shelf[shelfNo].getArr()[i]!=null && shelf[shelfNo].getArr()[i].getName()==(null)) {
				k=i;
				break;
			}
		}
		if(k!=-1) {
			for(int i=k;i<Shelf.SHELF_SIZE-1;i++ ) {
				if(shelf[shelfNo].getArr()[i]!=null/* && shelf[shelfNo].getArr()[i].getName()==null*/&&shelf[shelfNo].getArr()[i+1]!=null &&  shelf[shelfNo].getArr()[i+1].getName()!=null)
					shelf[shelfNo].getArr()[i].setName(shelf[shelfNo].getArr()[i+1].getName());
				else if(shelf[shelfNo].getArr()[i]!=null/* && shelf[shelfNo].getArr()[i].getName()==null*/&&shelf[shelfNo].getArr()[i+1]==null )
					shelf[shelfNo].getArr()[i].setName(null);
					
			}
//			if(shelf[shelfNo].getArr()[Shelf.SHELF_SIZE-1]!=(null))
//			shelf[shelfNo].getArr()[Shelf.SHELF_SIZE-1].setName(null);
		}
		
		
	}

	private void addItem() {
		System.out.println("Enter shelf number.:(0-9)");
		int shelfNo = sc.nextInt();
		if(shelfNo>=0 && shelfNo<10) {
			if(shelf[shelfNo]!=null && shelf[shelfNo].getShelfStatus()<9) {
				System.out.println("Enter item name.:");sc.nextLine();
				String item = sc.nextLine();
				shelf[shelfNo].getArr()[shelf[shelfNo].getShelfStatus()+1]= new Item(item);
				//shelf[shelfNo].getArr()[shelf[shelfNo].getShelfStatus()+1].setName(item);	
				System.out.println("Added succesfully");
				shelf[shelfNo].setShelfStatus((shelf[shelfNo].getShelfStatus())+1);
			}
			else
				System.out.println("Shelf is Full!");
		}
		else
			System.out.println("Wrong shelf number entered!");
		
	}


	private static int menuList() {
		System.out.println("1. add item");
		System.out.println("2. remove item");
		System.out.println("3. display content");
		System.out.println("Enter choice");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		int choice;
		while((choice=TestMain.menuList()) != 0) {
			switch(choice){
				case 1:tm.addItem();
					break;
					
				case 2:tm.removeItem();
					break;
					
				case 3:TestMain.display();
					break;
			}
		}

	}

}
