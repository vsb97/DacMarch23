package resataurant.menu.vaishnavi;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	private static int menu() {
		
		System.out.println("1 to view the current menu.");
		System.out.println("2 to add new dish.");
		System.out.println("3 to remove dish.");
		System.out.println("4 modify the price of a dish.");
		System.out.println("5 to exit.");
		System.out.println("Enter your choice.: ");
		
		int i = sc.nextInt();
		//sc.nextLine();
		return i;	
	}

	public static void main(String[] args) {
		
		int a=0;
		MenuOperations mo = new MenuOperations();
		while(a != 5) {
			a = Main.menu();
		
		switch (a) {
		case 1: 
			mo.viewMenu();
			break;
		case 2: 
			mo.addDish();
			break;
		case 3:
			mo.removeDish();
			break;
		case 4:
			mo.modifyPrice();
			break;
		case 5:
			System.out.println("Thank you for using the app!!!");
			return;	
		default:System.out.println("Enter right input.(1,2,3,4,5) ");
			
		}
		}

	}

}
