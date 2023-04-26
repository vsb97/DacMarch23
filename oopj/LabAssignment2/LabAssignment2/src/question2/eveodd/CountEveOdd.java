/*Input: 24689
Output: Number of even digits: 4, Number of odd digits: 1*/


package question2.eveodd;

import java.util.Scanner;


public class CountEveOdd {

	private static Scanner sc = new Scanner(System.in);
	private static int eve =0, odd=0,r;
	void count(int n) {
		 if(n>0) {
			r=n%10;
			if(r%2==0)
				CountEveOdd.eve++;
			else
				CountEveOdd.odd++;
			n/=10;
			count(n);
		}
			
	}
	public static void main(String[] args) {
		System.out.println("Enter a number.:");
		CountEveOdd obj = new CountEveOdd();
		obj.count(sc.nextInt());
		System.out.println("Number of even digits.: "+CountEveOdd.eve+" Number of odd digits.: "+CountEveOdd.odd);
		}

}
