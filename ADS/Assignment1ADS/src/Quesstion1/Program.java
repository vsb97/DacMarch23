//. How do you find the missing number in a given integer array of 1 to 100? 
package Quesstion1;

public class Program {

	public static void main(String[] args) {
	                           
		int arr [] = new int [99] ;
		for(int i =0;i<arr.length;i++) {
			if(i>=1) {
				arr[i]=i+2;
			}
			else
			arr[i]=i+1;
		}
		if(arr[arr.length/2]>50) {
			for(int i=1;i<=arr.length/2+1;i++) {
				if(arr[i-1]==i) {
					continue;
				}
				else {
					System.out.println(i);
					break;
				}
			}
		}	
		else if(arr[arr.length/2]==50) {
			int flag=0;
			for(int i = arr.length/2;i<arr.length;i++) {
				if(arr[i]==i+1) {
					
					continue;
				}
				else {
	                System.out.println(arr[i]-1);
	                flag=17;
	                break;
	            }
				
			}
			if(flag!=17) {
				System.out.println(arr.length+1);
			}
		}
	}
	}
