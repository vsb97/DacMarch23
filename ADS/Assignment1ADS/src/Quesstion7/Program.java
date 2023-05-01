// How do you find all pairs of an integer array whose sum is equal to a given number?
 
package Quesstion7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Program {
	
	public static void find(int []arr, int sum) {
		Arrays.sort(arr);
		int i=0, j=arr.length-1;
		while(i<=j) {
			if(arr[i]+arr[j]==sum) {
				System.out.println(arr[i]+" + "+arr[j]+" = "+sum);
				i++;
				j--;
			}
			else if(arr[i]+arr[j]>sum)
				j--;
			else if(arr[i]+arr[j]<sum)
				i++;
			
		}
	}
	    
	public static void main(String[] args) {
		Program.find(new int[]{34,23,1,9,11,56,44,8,65}, 45);
		System.out.println("-----------------------------------");
		Program.find(new int[]{34,23,1,9,11,56,46,8,65}, 57);
			
	}
}
