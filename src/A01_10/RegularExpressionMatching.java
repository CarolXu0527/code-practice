package A01_10;

/*
 * Regular Expression Matching
Implement regular expression matching with support for '.' and '*'.

'.' Matches any single character.
'*' Matches zero or more of the preceding element.

The matching should cover the entire input string (not partial).

The function prototype should be:
bool isMatch(const char *s, const char *p)

Some examples:
isMatch("aa","a") ? false
isMatch("aa","aa") ? true
isMatch("aaa","aa") ? false
isMatch("aa", "a*") ? true
isMatch("aa", ".*") ? true
isMatch("ab", ".*") ? true
isMatch("aab", "c*a*b") ? true
 */

public class RegularExpressionMatching {
	
	public static void main(String[] args){
		String test = "aab";
		String expression = "c*a*b";
		System.out.println(RegularExpressionMatchingTest(test, expression));
	}

	private static boolean RegularExpressionMatchingTest(String test, String expression) {
		// TODO Auto-generated method stub
		System.out.println("total pos: " + test.length() + " " + expression.length());
		
		if(test == null || expression == null){
			return false;
		}
		
		boolean[][] testMatrix = new boolean[test.length()+1][expression.length()+1];
		testMatrix[0][0] = true;
		//System.out.println("test " + testMatrix[1][1]);
		
		for(int i = 0; i < expression.length();i++){
			if(expression.charAt(i)=='*' && testMatrix[0][i-1]){
				testMatrix[0][i+1] = true;
			}
		}
		
		for(int i = 0; i < test.length(); i++){
			for(int j = 0; j < expression.length(); j++){
				if(test.charAt(i)==expression.charAt(j) || expression.charAt(j)=='.'){
					testMatrix[i+1][j+1] = testMatrix[i][j];
				}
				
				if(expression.charAt(j)=='*'){
					if(expression.charAt(j-1)!=test.charAt(i) && expression.charAt(j-1)!='.'){
						testMatrix[i+1][j+1] = testMatrix[i+1][j-1];
					}else{
						testMatrix[i+1][j+1] = testMatrix[i+1][j-1]||testMatrix[i+1][j]||testMatrix[i][j+1];
					}
				}
			}
		}
		return testMatrix[test.length()][expression.length()];
		
	}

}
