//How do you find pair whose sum is closest to zero in an array in Java?
 
package Quesstion8;

import java.util.Arrays;
import java.util.List;

public class Program {
	
	public static int find(int []arr) {
		 Arrays.sort(arr);// -54  -11  3 6 45
		 System.out.println(Arrays.toString(arr));
		 if(arr[0]<0) {
			 for(int i=0; i<arr.length;i++) {
				 if(arr[i]>0) {
					 
					 int one = -arr[i-1];
					 if(arr[arr.length-1]<=one)
					 	{return arr[arr.length-1] - one;}
					 if((Math.abs(arr[i-2])+Math.abs(arr[i-1]))<(Math.abs(arr[i-1])+arr[i]))
						 return (arr[i-2])+(arr[i-1]);
					 int j = i+1;
					 while(j<arr.length) {
						 if(arr[i]<one && arr[j]>one) {
							 if((one-arr[i])<(arr[j]-one))
								 return -one+arr[i];
							 else
								 return arr[j]-one;
						 }
						 i++;j++;
					 }
				 } 
			 }
			 return arr[arr.length-2]+arr[arr.length-1];
		 }
		 return arr[0]+arr[1];	 
	}
	    
	public static void main(String[] args) {
		System.out.println(Program.find(new int[]{34,23,1,9,11,56,44,8,65}));// 1 8 
		System.out.println("-----------------------------------");
		System.out.println(Program.find(new int[]{34,23,1,9,-11,56,-46,8,65}));//-11 9
		System.out.println("-----------------------------------");
		System.out.println(Program.find(new int[]{1,7,-11,-46,12}));//-11 12
		System.out.println("-----------------------------------");
		System.out.println(Program.find(new int[]{-34,-23,-1,-7,-11,-56,-46,-12,-65}));//-1 -7
		System.out.println("-----------------------------------");
		System.out.println(Program.find(new int[]{-34,-23,-1,-7,-11,56,-46,-12,-65}));//-7 -1
			
	}
}
