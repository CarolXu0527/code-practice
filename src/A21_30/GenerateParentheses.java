package A21_30;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
 */

public class GenerateParentheses {
	
	public static void main(String[] args){
		System.out.println(generateParenthesis(3));
	}
	
    public static List<String> generateParenthesis(int n) {
    	//Stack<Character> Result = new Stack<Character>();
    	List<String> result = new ArrayList<String>();
    	String singleResult = "";
    	RecursiveGP(n,n,result,singleResult);
    	System.out.println(result.size());
    	return result;
        
    }

	private static void RecursiveGP(int remain_left, int remain_right, List<String> result, String singleResult) {
		// TODO Auto-generated method stub
		
		if(remain_right==0){
			System.out.println(singleResult);
			result.add(singleResult);
		}
		
		if(remain_left > 0){
			System.out.println(remain_left + " " + remain_right + singleResult+"(");
			RecursiveGP(remain_left-1,remain_right,result,singleResult+"(");
		}
		
		if(remain_left<remain_right){
			System.out.println(remain_left + " " + remain_right + singleResult+")");
			RecursiveGP(remain_left,remain_right-1,result,singleResult+")");
		}

	}

}
