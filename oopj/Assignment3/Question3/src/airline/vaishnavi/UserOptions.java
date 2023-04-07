package airline.vaishnavi;

import java.util.Scanner;

public class UserOptions {
	
	static private User noOfUsers[]=new User[5];
	static int count=noOfUsers.length;
	static Scanner sc = new Scanner(System.in);

	public static void registerUser() {
		if(count>0) {
			sc.nextLine();
			System.out.print("Enter Name of the user.: ");
			String name=sc.nextLine();
			System.out.print("Enter email of the user.: ");
			String email=sc.nextLine();
			System.out.print("Enter contact no of the user.: ");
			String no=sc.nextLine();
			noOfUsers[noOfUsers.length-count]=new User(name,email,no);
			System.out.println("USER REGISTERED SUCCESFULLY. index:"+(noOfUsers.length-count));
			count--;
			System.out.println("-------------------------------------------------------");
		}
		else {
			System.out.println("Maximum capacity of users is achieved!! No more space.");
		}
		
	}

	public static void flightAvailability() {
		for(int i =0;i<Flight.allFlights.length;i++) {
			Flight.allFlights[i].availableSeats();
		}
		
	}

	public static void seatReservation() {
		int userExist = isValidUser();
		if(userExist!=-1) {
			if(noOfUsers[userExist].count>=3) {
				System.out.println("You have already passed maximum ticket booking limit");
				return;
			}
			System.out.println("Enter number of flight(0,1,2,3,4).: ");
			int i =sc.nextInt();
			Flight.allFlights[i].availableSeats();
			if(Flight.allFlights[i].flightCount==0) {
				System.out.println("Oh this flight is full. check for other flights.: ");
				return;
			}
			System.out.println("Choose seat number.: ");
			int s=sc.nextInt();
			if(Flight.allFlights[i].seatsOfFlight[s]==false) {		
				noOfUsers[userExist].reservations[noOfUsers[userExist].count]=Flight.allFlights[i].nameOfFlight;
				noOfUsers[userExist].seat[noOfUsers[userExist].count]=s;
				Flight.allFlights[i].seatsOfFlight[s]=true;
				
				System.out.println("Seat booked succesfully for "+noOfUsers[userExist].name+"\nFlight name .:"+Flight.allFlights[i].nameOfFlight+" seat NO.: "+noOfUsers[userExist].seat[noOfUsers[userExist].count]);
				noOfUsers[userExist].count++;
			}
			else {
				System.out.println("The seat is not available.: ");
			}
		}
		else {
			System.out.println("User is not valid");
		}
		
	}

	private static int isValidUser() {
		System.out.println("Enter index of user.:");
		int i = sc.nextInt();
		
		if(i>=0 & i<5) {
			if(noOfUsers[i]!=null && noOfUsers[i].name!=null) {
				return i;
			}
		}
		return -1;
	}

	public static void viewReservations() {
		int userExist = isValidUser();
		if(userExist!=-1) {
			System.out.println("RESERVATIONS FOR .: "+noOfUsers[userExist].name);
			for(int i=0;i<3;i++) {
				if(noOfUsers[userExist].reservations[i]==null) {
					break;
				}
				else {
					System.out.println(noOfUsers[userExist].reservations[i]+"	 "+noOfUsers[userExist].seat[i]);
				}
			}
		}
		else {
			System.out.println("User is not valid");
		}
				
	}

	public static void cancelReservations() {
		int userExist = isValidUser();
		if(userExist!=-1) {
			viewReservations();
			if(noOfUsers[userExist].count == 0) {
				System.out.println("No reservations to cancel!");
				return;
			}
			System.out.println("Enter index of reservation to cancel (0,1,2).: ");
			int i =sc.nextInt();
			if(i>=0 && i<3 && noOfUsers[userExist].reservations[i]!=null) {
				int k;
				for(k=i;k<noOfUsers[userExist].count-1;k++) {
					noOfUsers[userExist].reservations[k]=noOfUsers[userExist].reservations[k+1];
					noOfUsers[userExist].seat[k]=noOfUsers[userExist].seat[k+1];
				}
				noOfUsers[userExist].reservations[k]=null;
				noOfUsers[userExist].seat[k]=0;
				System.out.println("RESERVATION CANCELED.");
				noOfUsers[userExist].count--;
			}
			else {
				System.out.println("Invalid index entered.");
			}
			//TODO
		}
		else {
			System.out.println("User is not valid");
		}
		
	}

}
