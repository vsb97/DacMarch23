
package question3.sum;

import java.util.Scanner;


public class SumDigits {

	private static Scanner sc = new Scanner(System.in);
	private static int sum =0,r;
	void count(int n) {
		 if(n>0) {
			r=n%10;
			SumDigits.sum+=r;
			n/=10;
			count(n);
		}
			
	}
	public static void main(String[] args) {
		System.out.println("Enter a number.:");
		SumDigits obj = new SumDigits();
		obj.count(sc.nextInt());
		System.out.println("Sum of digits.: "+SumDigits.sum);
		}

}
