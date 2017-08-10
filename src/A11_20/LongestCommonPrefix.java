package A11_20;

import java.util.HashSet;

/*
 * Write a function to find the longest common prefix string amongst an array of strings.
 */

public class LongestCommonPrefix {
	
	public static void main(String[] args){
		String[] strs = {"aca","cba"};
		System.out.println(longestCommonPrefix(strs));
	}

	private static String longestCommonPrefix(String[] strs) {
		// TODO Auto-generated method stub
		String result = "";
		
		if(strs.length == 0){System.out.println("Current result is: " + result);return result;}
		
		int lengthPre = Integer.MAX_VALUE;
		
		for(int i = 0; i<strs.length;i++){
			if(lengthPre > strs[i].length()){
				lengthPre = strs[i].length();
			}
		}
		
		for(int i = 0; i<lengthPre;i++){
			HashSet<Character> Temp = new HashSet<Character>();
			for(int j = 0; j<strs.length;j++){
				Temp.add(strs[j].charAt(i));
			}
			
			if(Temp.size() == 1){
				result = result + Temp.toString().charAt(1);
				System.out.println("Current result is: " + result);
			}else{System.out.println("Current result is: " + result);break;}
		}
		
		return result;
	}

}
