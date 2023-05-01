// How do you find the largest and smallest number in an unsorted integer array?  
 
package Quesstion5;

public class Program {
	public static void find(int[] arr) {
		int largest=Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
		for(int i : arr) {
			if(i>largest)
				largest = i;
			if(i<smallest)
				smallest = i;
		}
		System.out.println("Largest.: "+largest+" Smallest.: "+smallest);
	}
	    
	public static void main(String[] args) {
		Program.find(new int[]{34,23,12,90,11,56,44,8,65});
			
		
	}
}
