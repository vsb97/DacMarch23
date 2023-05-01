// How do you find the duplicate number on a given integer array? 
 
package Quesstion4;

import java.util.HashSet;
import java.util.Set;

public class Program {

//		n+1 arrSize nums{1-n} only 1 no repeated only one time..[1,2,3,4,5,6,4]1234567
	    static public int findDuplicate(int[] nums) {
	        int size = nums.length;
	        int sum = (size*(size+1))/2;
	        int arrsum=0;
	        for(int i: nums)
	            arrsum+=i;
	        return (size-(sum-arrsum));
	    }
	
//	    checking one by one each number for repetition
	    static public int findDuplicateusingNestedForLoop(int[] nums) {
	        for(int i=0;i<nums.length;i++){
	            for(int j=i+1;j<nums.length;j++){
	                if(nums[i]==nums[j])
	                  {return nums[j];}
	            }
	        }
	        return -1;
	     }
	    
//Using HashSet property
	    static public int findDuplicateusingSet(int[] nums) {
	    	Set<Integer> set= new HashSet<>();
	   	        for(int i=0;i<nums.length;i++){
	   	           if(!set.add(nums[i]))
	   	        	   return nums[i];
	   	        }
	   	        return -1;
	     } 
	  //Using Array... int->count;
	    static public int usingArr(int [] nums) {
	    	int [] arr = new int[nums.length+1];
	    	for(int i=0;i<nums.length;i++){
	    		   arr[nums[i]]++;
	   	           if(arr[nums[i]]>1)
	   	        	   return nums[i];
	   	        }
	   	        return -1;
	    }
	    
	public static void main(String[] args) {
		System.out.println(Program.usingArr(new int[]{1,2,3,4,5,5}));
		System.out.println(Program.usingArr(new int[]{6,1,1,2,3,4,5}));
//			
		
	}
}
