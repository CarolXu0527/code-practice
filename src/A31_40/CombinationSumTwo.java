package A31_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

Each number in C may only be used once in the combination.

Note:
All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8, 
A solution set is: 
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]
 */

public class CombinationSumTwo {

	public static void main(String[] args){
		int[] candidate = {10, 1, 2, 7, 6, 1, 5};
		int target = 8;
		System.out.println(combinationSumTwo(candidate, target));
	}

	private static List<List<Integer>> combinationSumTwo(int[] candidate, int target) {
		// TODO Auto-generated method stub
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(candidate);
		backtrack(result, new ArrayList<>(), candidate, target, 0);
		return result;
	}

	private static void backtrack(List<List<Integer>> result, ArrayList arrayList, int[] candidate, int TBD, int start) {
		// TODO Auto-generated method stub
		if(TBD < 0){
			return;
		}else if(TBD == 0){
			result.add(new ArrayList<>(arrayList));
		}else{
			for(int i = start; i<candidate.length; i++){
				if(i>start && candidate[i-1]==candidate[i]) continue;
				arrayList.add(candidate[i]);
				backtrack(result, arrayList, candidate, TBD-candidate[i],i+1);
				arrayList.remove(arrayList.size()-1);
			}
		}
		
		
	}
}
