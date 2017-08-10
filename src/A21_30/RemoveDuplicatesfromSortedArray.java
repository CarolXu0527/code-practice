package A21_30;

import java.util.HashSet;
import java.util.Set;

/*
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 */

public class RemoveDuplicatesfromSortedArray {
	
	public static void main(String[] args){
		int[] nums = {2,4,4,4,5,5};
		System.out.println("test result " + removeDuplicates(nums));
		
	}
	
    public static int[] removeDuplicates(int[] nums) {
    	
    	if(nums.length<2){
    		return nums;
    	}
    	
    	int ptr1 = 0;
    	int ptr2 = 1;
    	
    	while(ptr2<nums.length){
    		if(nums[ptr1]==nums[ptr2]){
    			ptr2++;
    		}else{
    			nums[ptr1+1]=nums[ptr2];
    			ptr1++;
    			ptr2++;
    		}
    	}
    	
    	int[] result = new int[ptr1+1];
    	for(int i=0; i<ptr1+1;i++){
    		result[i] = nums[i];
    		System.out.println(result[i]);
    	}
    	
		return result;
    }

}
