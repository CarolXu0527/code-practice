package A11_20;

import java.util.LinkedList;
import java.util.List;

/*
 * 
Given a digit string, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.

Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

 */

public class LetterCombinationsofaPhoneNumber {
	
	static String[] sample = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
	public static void main(String[] args){
		String digits = "";
		System.out.println(letterCombinations(digits));
	}
	
    public static List<String> letterCombinations(String digits) {
    	List<String> result = new LinkedList<String>();
    	
    	if(digits.length()==0){
    		return result;
    	}
    	
    	recursiveLC(result, 0, digits, "");
    	
    	return result;
        
    }

	private static void recursiveLC(List<String> result, int i, String digits, String Temp) {
		// TODO Auto-generated method stub
		if(i>=digits.length()){
			result.add(Temp.trim());
			return;
		}
		
		
		for(int j=0; j<sample[digits.charAt(i)-'0'].length();j++){
			System.out.println("Doing " + Temp+sample[digits.charAt(i)-'0'].charAt(j) + " now!");
			recursiveLC(result, i+1,digits,Temp+sample[digits.charAt(i)-'0'].charAt(j));
		}
		
	}

}
