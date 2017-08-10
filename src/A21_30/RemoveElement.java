package A21_30;

/*
 * 
Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.
 */

public class RemoveElement {
	
	public static void main(String[] args){
		int[] nums = {2,4,4,4,5,5,6};
		System.out.println("test result " + removeElement(nums,4));
		
	}
	
    public static int removeElement(int[] nums, int val) {
    	
    	if(nums.length<1){
    		return nums.length;
    	}
    	
    	int endOfTested = 0;
    	int startOfTBD = 0;
    	
    	while(startOfTBD<nums.length){
    		if(nums[startOfTBD]==val){
    			startOfTBD++;
    		}else{
    			nums[endOfTested++]=nums[startOfTBD++];
    		}
    	}
    	
    	return endOfTested;      
    }

}
