package Question9;

import java.util.HashMap;
import java.util.Map;

public class Dup {

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
			if(entry.getValue()>1)
				System.out.println(entry.getKey()+" "+entry.getValue()+" times repeated.");
		}
	}
	
	public static void main(String[] args) {
		Dup.find(new int[]{34,23,12,34,8,56,12,23,8,56,8});
		
	}

}
