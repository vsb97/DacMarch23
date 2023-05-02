package Question14;

import java.util.Arrays;

public class Rev {

	private static void reverse(int[] arr) {
		int i=0, j=arr.length-1, temp;
		while(i<=j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;j--;
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {11,79,97,55,66};
		System.out.println(Arrays.toString(arr));
		Rev.reverse(arr);
		System.out.println(Arrays.toString(arr));
	}

	

}
