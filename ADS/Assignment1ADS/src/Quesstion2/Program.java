//How do you search for an element in a sorted and rotated array in Java?
 
package Quesstion2;

public class Program {

	static public int search(int[] nums, int target) {
        int l=0, r=nums.length-1, mid;
        while(l<=r){
            if(nums[l] == target)
                return l;
            if(nums[r] == target)
                return r;
            mid = (l+r)/2;
            if(nums[mid] == target)
                return mid;
            
            if(nums[l]<=nums[mid]){
                if(target <= nums[mid] && target >= nums[l])
                    r=mid-1;
                else
                    l=mid+1;
            }
            else{
                if(target >= nums[mid] && target <= nums[r])
                    l=mid+1;
                else
                    r=mid-1;
            }
        }
        return -1;

    }
	public static void main(String[] args) {
		System.out.println(Program.search(new int[]{1,2,3,4,5,6}, 3));
		System.out.println(Program.search(new int[]{6,0,1,2,3,4,5}, 0));
		System.out.println(Program.search(new int[]{6,7,8,9,0,4}, 0));
		System.out.println(Program.search(new int[]{6,7,8,9,0,4,5}, 0));
		System.out.println(Program.search(new int[]{8,9,2,3,4}, 9));
		System.out.println(Program.search(new int[]{1}, 1));
		System.out.println(Program.search(new int[]{2}, 1));
	}
}
