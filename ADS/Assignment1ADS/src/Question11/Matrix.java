package Question11;

import java.util.Scanner;

public class Matrix {

	private static Scanner sc  = new Scanner(System.in);
	
	private static boolean find(int[][] arr, int n) {
		int i=0,j=0;
		while(i<arr.length) {
			if(n>=arr[i][j] && n<=arr[i][arr[i].length-1]) {
				for(int k=0; k<arr[i].length; k++) {
					if(n== arr[i][k])
						return true;
				}
			}
			else
				i++;
		}
		return false;
	}
	public static void main(String[] args) {
		int[][] arr = {{1,5,9},{23,45,79},{88,97,100}};
		if(Matrix.find(arr, 79)) {
			System.out.println("Found");
		}
		else
			System.out.println("NOT Found.");
	}

}
