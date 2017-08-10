package A51_60;

/*
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.
 */

public class LengthofLastWord {
	
	public static void main(String[] args){
		String test = " ";
		System.out.println("result is " + lengthOfLastWord(test));
	}
	
    public static int lengthOfLastWord(String s) {
    	String[] temp = s.split(" ");
    	return (temp.length == 0)?0:temp[temp.length-1].length();
    }
}
