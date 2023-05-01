//How do you find the second-largest number in the array?
 
package Quesstion3;

public class Program {

	static public int search(int[] nums) {
		if(nums.length==1)
			return -1;
        int largest=0, secLargest=-1;
		for(int i :nums) {
			if(i>=largest) {
				secLargest = largest;
				largest = i;
			}
			else if(i>=secLargest) {
				secLargest=i;
			}
		}
		return secLargest;
    }
	public static void main(String[] args) {
		System.out.println(Program.search(new int[]{1,2,3,4,5,6}));
		System.out.println(Program.search(new int[]{6,0,1,2,3,4,5}));
		System.out.println(Program.search(new int[]{6,7,8,24,20,4}));
		System.out.println(Program.search(new int[]{6,7,8,9,0,4,5}));
		System.out.println(Program.search(new int[]{8,9,2,3,4}));
		System.out.println(Program.search(new int[]{1,0}));
		System.out.println(Program.search(new int[]{2}));
	}
}
