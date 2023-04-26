/*Input: 12345
Output: Number of digits: 5*/


package question1.count;

import java.util.Scanner;

public class Count {
	private static Scanner sc = new Scanner(System.in);
	private static int c =0;
	void count(int n) {
		if(n<=0) {}
		else {
			n/=10;
			Count.c++;
			count(n);
		}
			
	}
	public static void main(String[] args) {
		System.out.println("Enter a number.:");
		Count obj = new Count();
		obj.count(sc.nextInt());
		System.out.println("Count.: ");
		}

}
