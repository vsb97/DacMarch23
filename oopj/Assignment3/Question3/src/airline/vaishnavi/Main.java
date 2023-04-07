package airline.vaishnavi;

import java.util.Scanner;


public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	private static int menu() {
		
		System.out.println("1 user registeration.");
		System.out.println("2 flight availability.");
		System.out.println("3 seat reservation.");
		System.out.println("4 view reservations.");
		System.out.println("5 cancel reservations.");
		System.out.println("6 exit.");
		System.out.println("Enter your choice.: ");
		
		int i = sc.nextInt();
		//sc.nextLine();
		return i;	
	}
	
	public static void main(String args[]) {
		int a=0;
		//UserOptions uo = new UserOptions();
		while(a != 6) {
			a = Main.menu();
		
		switch (a) {
		case 1: 
			UserOptions.registerUser();
			break;
		case 2: 
			UserOptions.flightAvailability();
			break;
		case 3:
			UserOptions.seatReservation();
			break;
		case 4:
			UserOptions.viewReservations();
			break;
		case 5:
			UserOptions.cancelReservations();
			break;
		case 6:
			System.out.println("Thank you for using the app!!!");
			return;	
		default:System.out.println("Enter right input.(1,2,3,4,5,6) ");
			
		}
		}
	}

}
