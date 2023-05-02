package Question15;

import java.util.Arrays;

public class Duplicates {

	private static void remDup(int[] arr) {
		int j = 0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]!=arr[i+1])
				arr[j++]=arr[i];
		}
		arr[j++] = arr[arr.length-1];
		for(int i=0;i<j;i++)
			System.out.print(arr[i]+" ");
	}

	private static void quicksort(int[] arr, int l, int r) {
		if(l<r) {
			int p= partition(arr, l, r);
			quicksort(arr, l, p-1);
			quicksort(arr, p+1, r);
		}		
	}
	
	private static int partition(int[] arr, int l, int r) {
		int pivot = arr[r];
		int i=l, j=r-1, t;
		while(i<j) {
			while(i<r && arr[i]<= pivot) 
				i++;
			while(j>1 && arr[j]>pivot)
				j--;
			if(i<j) {
				t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}		
		}
		if(arr[i]>arr[r]) {
			t = arr[r];
			arr[r] = arr[i];
			arr[i] = t;
		}
		return i;
	}

	public static void main(String[] args) {
		int arr[]= {3,45,22,3,79,65,45,22,60};
		Duplicates.quicksort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		Duplicates.remDup(arr);

	}

}
