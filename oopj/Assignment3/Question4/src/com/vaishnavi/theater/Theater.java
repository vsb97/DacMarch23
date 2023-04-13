package com.vaishnavi.theater;

public class Theater {
	
	static int rows;
	static int columns;
	static int totalStaffNo;
	static int tranCount;
	static int staffArrCount;
	
	static float priceOfSeat;
	private boolean seats[][]= new boolean[rows][columns];//true :available, false :NA
	
	private Staff staffArr[] = new Staff[totalStaffNo];
	
	 Transaction tran[]=new Transaction[rows*columns];
	
	private static Theater t;
	
	static{
		priceOfSeat=100f;
		 rows=10;
		 columns=10;
		 totalStaffNo=10;
		 tranCount=0;
		 staffArrCount=0;
		 
		 t = new Theater();
	}
	
	private Theater() {	}
	
	public static Theater getreference() {
		return t;
	}
	
	public boolean getSeatStatus(int i, int j) {
		return seats[i][j];
	}
	public void setSeatStatus(int i, int j) {
		 seats[i][j]=true;
	}
	public int getTotalNoOfAvailableSeats() {
		int c=0;
		for(int i=0; i<Theater.rows; i++) {
			for(int j=0; j<Theater.columns; j++) {
				if(seats[i][j]==false)
					c++;
			}
		}
		return c;
	}

	public void addStaff(Staff s) {
		staffArr[staffArrCount]=s;
		staffArrCount++;
		System.out.println("Staff added succefully");
		
	}

}
