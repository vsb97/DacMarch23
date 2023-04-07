package airline.vaishnavi;

public class Flight {
	
	String nameOfFlight;
	int capacity;
	boolean[] seatsOfFlight;
	static Flight[] allFlights= {new Flight("IndiGo",20),new Flight("Air India",50),new Flight("SpiceJet",30),new Flight("Go First",20),new Flight("AirAsia India",40)};
	int flightCount;
	
	Flight(String name, int capacity){
		this.nameOfFlight=name;
		this.capacity=capacity;
		this.seatsOfFlight=new boolean[capacity];
		
	//	int i =(int)(Math.random()*100);
		int i = 3;
		
		for(int k=0;k<capacity;k++) {
			if(k%i==0)
				this.seatsOfFlight[k]=true;
			else
				this.seatsOfFlight[k]=false;
		}
	}
	
	
	void availableSeats() {
		int i = 0;
		System.out.println("\n"+this.nameOfFlight+"Available seat numbers.: ");
		while(i<this.capacity) {
			if(this.seatsOfFlight[i]==false) {
				System.out.print(i+", ");
				this.flightCount++;
			}
			i++;
		}
		if(this.flightCount>0) {
			System.out.println("\nTotal available seats.: "+this.flightCount);
		}
		else {
			System.out.println("Opps seats are full!!!");
		}
	}
	
	
}
