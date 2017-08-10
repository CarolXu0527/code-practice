package A31_40;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

For "(()", the longest valid parentheses substring is "()", which has length = 2.

Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.
 */
public class LongestValidParentheses {
	
	public static void main(String[] args){
		System.out.println(longestValidParentheses(")()())"));
	}
	
    public static int longestValidParentheses(String s) {
    	int length = s.length();
    	int result = 0;
    	Stack<Integer> st = new Stack<Integer>();
    	
    	for(int i = 0;i<length;i++){
    		if(s.charAt(i)=='('){
    			System.out.println("push (");
    			st.push(i);
    		}else{
    			if(!st.isEmpty()){
    				if(s.charAt(st.peek())=='('){
    					System.out.println("pop");
    					st.pop();
    				}else{
    					System.out.println("push )");
    					st.push(i);
    				}
    			}else{
    				System.out.println("push )");
    				st.push(i);
    			}
    		}
    	}
    	
    	int ptr1 = length;
    	int ptr2 = 0;
    	while(!st.isEmpty()){
    		ptr2 = st.peek();
    		st.pop();
    		result = Math.max(result, ptr1-ptr2-1);
    		ptr1 = ptr2;
    		System.out.println(result);
    	}
    	
    	result = Math.max(result, ptr1);
    	
    	return result;

	}

}
