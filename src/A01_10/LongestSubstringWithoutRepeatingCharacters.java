package A01_10;

import java.util.HashSet;
import java.util.Set;

/*
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/

public class LongestSubstringWithoutRepeatingCharacters {
	
	public static void main(String[] args){
		String test = "pwwkew";
		System.out.println(LongestSubstringWithoutRepeatingCharactersTest(test));
	}

	private static int LongestSubstringWithoutRepeatingCharactersTest(String test) {
		// TODO Auto-generated method stub
		int length = 0;
		int start = 0;
		int end = 0;
		Set<Character> testSet = new HashSet<>();
		
		while(start < test.length() && end < test.length()){
			if(!testSet.contains(test.charAt(end))){
				System.out.println("add " + test.charAt(end));
				testSet.add(test.charAt(end++));
				length = Math.max(length, end-start);
			}else{
				System.out.println("remove " + test.charAt(start));
				testSet.remove(test.charAt(start++));
				System.out.println("current size: " + testSet.size());
				//end++;
			}
		}

		return length;
	}

}
