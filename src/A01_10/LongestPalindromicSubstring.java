package A01_10;

/*
 * 
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example:

Input: "babad"

Output: "bab"

Note: "aba" is also a valid answer.
Example:

Input: "cbbd"

Output: "bb"
 * 
 * 
 */

public class LongestPalindromicSubstring {
	
	public static boolean[][] matrix;
	public static int lo;
	public static int hi;
	public static int longest;
	public static String test = "a";
	public static int lengthOftest = test.length();
	
	public static void main(String[] args){
		
		LongestPalindromicSubstringTest(test);
	}

	private static void LongestPalindromicSubstringTest(String test) {
		// TODO Auto-generated method stub

		if(lengthOftest == 1){
			lo = 0;
			longest = 1;
			System.out.println("Result is: "  + test.substring(lo, lo + longest));
		}
		for(int i = 0; i < lengthOftest - 1; i++){
			LPS(test, i, i);
			LPS(test, i, i+1);
		}
		
		System.out.println("Result is: "  + test.substring(lo, lo + longest));
		
	}

	private static void LPS(String test, int start, int end) {
		// TODO Auto-generated method stub
		while (start >= 0 && end < lengthOftest && test.charAt(start) == test.charAt(end)){
			start--;
			end++;
		}
		if(longest < end - start - 1){
			lo = start + 1;
			longest = end - start -1;
		}	
	}
		
	
}
