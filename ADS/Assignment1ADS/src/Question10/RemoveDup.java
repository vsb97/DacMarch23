package Question10;

import java.util.Arrays;

public class RemoveDup {

	public static int removeDup(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }    
        int j = 0;//for next element  
        for (int i=0; i < n-1; i++){  
            if (arr[i] != arr[i+1]){  
                arr[j++] = arr[i];  
            }  
        }  
        arr[j++] = arr[n-1];  
        return j;  
    }  
       
    public static void main (String[] args) {  
        int arr[] = {23,40,23,30,40,23,50,50}; 
        Arrays.sort(arr);
        int length = arr.length;  
        length = removeDup(arr, length);  
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    }  
}  
