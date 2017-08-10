package A01_10;

import java.util.HashMap;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
		
public class TwoSum {

	public static void main(String[] args){
		int[] result = null;
		int[] nums = {3,2,4};
		result = TwoSumTest(nums,6);
		System.out.println("test result" + result);
		
	}
	
	public static int[] TwoSumTest(int[] nums, int target){
		HashMap<Integer, Integer> numHash = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++){
			numHash.put(target - nums[i], i);
		}
		
		System.out.println("test" + numHash);
		
		for (int i = 0; i < nums.length; i++){
			if(numHash.containsKey(nums[i]) && numHash.get(nums[i]) != i){
				int[] result = {i, numHash.get(nums[i])};
				System.out.println(i);
				System.out.println(numHash.get(nums[i]));
				return result;
			}
		}
		
		return null;
		
	}
}
