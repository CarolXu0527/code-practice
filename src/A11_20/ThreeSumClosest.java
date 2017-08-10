package A11_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 
Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

    For example, given array S = {-1 2 1 -4}, and target = 1.

    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */

public class ThreeSumClosest {
	
	public static void main(String[] args){
		int[] nums = {-1,2,1,-4};
		int target = 1;
		System.out.println("test result" + threeSumClosest(nums, target));
		
	}

	private static int threeSumClosest(int[] nums, int target) {
		// TODO Auto-generated method stub
		int result = nums[0] + nums[1] + nums[nums.length - 1];
		
		Arrays.sort(nums);
		
		for(int i = 0; i<nums.length-2;i++){
			int j = i+1;
			int k = nums.length-1;
			while(j<k){
				int sum = nums[i] + nums[j] + nums[k];
				if(sum<target){
					j++;
				}else{
					k--;
				}
				
				if(Math.abs(sum-target)<Math.abs(result-target)){
					result = sum;
				}
			}
		}
		
		return result;
	}
}
