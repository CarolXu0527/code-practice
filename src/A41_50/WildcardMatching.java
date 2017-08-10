package A41_50;

/*
 * 
Implement wildcard pattern matching with support for '?' and '*'.

'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).

The matching should cover the entire input string (not partial).

The function prototype should be:
bool isMatch(const char *s, const char *p)

Some examples:
isMatch("aa","a") ? false
isMatch("aa","aa") ? true
isMatch("aaa","aa") ? false
isMatch("aa", "*") ? true
isMatch("aa", "a*") ? true
isMatch("ab", "?*") ? true
isMatch("aab", "c*a*b") ? false


"bbbababbabbbbabbbbaabaaabbbbabbbababbbbababaabbbab"
"a******b*"
 */
public class WildcardMatching {
	
	public static void main(String[] args){
		String test = "ababbbbababaabbbab";
		String expression = "a******b*";
		System.out.println(isMatch(test, expression));
	}
    
    public static boolean isMatch(String s, String p) {
        boolean matrix[][] = new boolean[s.length()+1][p.length()+1];
        matrix[0][0] = true;
        for(int i = 0; i<p.length();i++){
        	if(p.charAt(i)=='*'){
        		System.out.println("1.Put a true at " + (i+1));
            	matrix[0][i+1] = true;
        	}else{
        		break;
        	}
        	
        }
        
        for(int i = 1;i<=s.length();i++){
        	for(int j = 1;j<=p.length();j++){
    			if(s.charAt(i-1)==p.charAt(j-1)){
    				System.out.println("Case1 at " + (i-1) + " " + (j-1));
    				matrix[i][j]= matrix[i-1][j-1];
    			}else if(p.charAt(j-1)=='?'){
    				System.out.println("Case2 at " + (i-1) + " " + (j-1));
    				matrix[i][j] = matrix[i-1][j-1];
    			}else if(p.charAt(j-1)=='*'){
    				System.out.println("Case3 at " + (i-1) + " " + (j-1));
    				matrix[i][j] = matrix[i-1][j] || matrix[i][j-1];
    			}
        	}
        }
        
        return matrix[s.length()][p.length()];
    }

}
