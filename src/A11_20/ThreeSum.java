package A11_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 */

public class ThreeSum {
	
	public static void main(String[] args){
		List<List<Integer>> result = null;
		int[] nums = {-1, 0, 1, 2, -1, -4};
		result = threeSum(nums);
		System.out.println("test result" + result);
		
	}

	private static List<List<Integer>> threeSum(int[] nums) {
		// TODO Auto-generated method stub
		List<List<Integer>> result = new ArrayList<>();
		
		if(nums.length<3){
			return result;
		}
		
		Arrays.sort(nums);
		
		for(int i = 0; i<nums.length-2;i++){
			if(i > 0 && nums[i] == nums[i-1]){
				continue;
			}
			int j = i+1;
			int k = nums.length-1;
			int target = -nums[i];
			while(j<k){
				if(nums[j]+nums[k]==target){
					result.add(Arrays.asList(nums[i],nums[j],nums[k]));
					j++;
					k--;
					while(nums[j]==nums[j-1]&&j<k){j++;}
					while(nums[k]==nums[k+1]&&j<k){k--;}
				}else if(nums[j]+nums[k]<target){
					j++;
				}else if(nums[j]+nums[k]>target){
					k--;
				}
			}
		}
		
		return result;
	}
}
