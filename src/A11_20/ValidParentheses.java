package A11_20;

import java.util.Stack;

/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */

public class ValidParentheses {
	
	public static void main(String[] args) {
		String s = "([)";
		System.out.println(isValid(s));
	}

	private static boolean isValid(String s) {
		// TODO Auto-generated method stub
		Stack<Character> TestStack = new Stack<Character>();
		
		for(int i = 0; i<s.length();i++){
			if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
				TestStack.push(s.charAt(i));
			}
			
			if(TestStack.isEmpty()){return false;}
			
			if(s.charAt(i)==')'){
				if(TestStack.peek()=='('){
					TestStack.pop();
				}else{
					TestStack.push(s.charAt(i));
				}
			}
			
			if(s.charAt(i)==']'){
				if(TestStack.peek()=='['){
					TestStack.pop();
				}else{
					TestStack.push(s.charAt(i));
				}
			}
			
			if(s.charAt(i)=='}'){
				if(TestStack.peek()=='{'){
					TestStack.pop();
				}else{
					TestStack.push(s.charAt(i));
				}
			}
		}
		
		return TestStack.empty();
	}

}
