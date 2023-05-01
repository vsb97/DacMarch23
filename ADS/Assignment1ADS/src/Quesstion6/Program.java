// . How do you find a number occurring the odd number of times in an array?
 
package Quesstion6;

import java.util.HashMap;
import java.util.Map;

public class Program {
	
	public static void find(int []arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i : arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i, 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()%2==1)
				System.out.println(entry.getKey()+" ");
		}
	}
	    
	public static void main(String[] args) {
		Program.find(new int[]{34,23,12,34,8,56,23,8,56,8});
			
	}
}
