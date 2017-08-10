package A31_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:
All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
For example, given candidate set [2, 3, 6, 7] and target 7, 
A solution set is: 
[
  [7],
  [2, 2, 3]
]
 */

public class CombinationSum {
	
	public static void main(String[] args){
		int[] candidate = {2,3,6,7};
		int target = 7;
		System.out.println(combinationSum(candidate, target));
	}
	
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        
    	combinationSumBacktrack(result, new ArrayList<>(),candidates,target,0);
    	
    	return result;
    	
    }

	private static void combinationSumBacktrack(List<List<Integer>> result, List<Integer> arrayList,
			int[] candidates, int TBD, int start) {
		// TODO Auto-generated method stub
		if(TBD == 0){
			result.add(new ArrayList<>(arrayList));
		}else if(TBD < 0){
			return;
		}else{
			for(int i=start; i<candidates.length;i++){
				arrayList.add(candidates[i]);
				combinationSumBacktrack(result,arrayList,candidates, TBD-candidates[i],i);
				arrayList.remove(arrayList.size()-1);
			}
		}
	}

}
