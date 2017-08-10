package A21_30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
You are given a string, s, and a list of words, words, that are all of the same length. Find all starting indices of substring(s) in s that is a concatenation of each word in words exactly once and without any intervening characters.

For example, given:
s: "barfoothefoobarman"
words: ["foo", "bar"]

You should return the indices: [0,9].
"wordgoodgoodgoodbestword"
["word","good","best","good"]
(order does not matter).
 */

public class SubstringwithConcatenationofAllWords {
	
	public static void main(String[] args){
		String s = "wordgoodgoodgoodbestword";
		String[] words = {"word","good","best","good"};
		System.out.println(findSubstring(s, words));
		
	}
	
    public static List<Integer> findSubstring(String s, String[] words) {
    	List<Integer> result = new ArrayList<Integer>();
    	
    	if(s.length()==0||words.length ==0||words[0].length()==0){
    		return result;
    	}
    	
        HashMap<String, Integer> test = new HashMap<String, Integer>();
        for(String w:words){
        	test.put(w, (test.containsKey(w))?(test.get(w)+1):1);
        }
        
        //System.out.println(test);
        
        for(int i = 0; i < s.length()-words.length*words[0].length()+1; i++){
        	HashMap<String, Integer> temp = new HashMap<String, Integer>(test);
        	int j = i;
        	while(j<i+words.length*words[0].length()){
        		String cur = s.substring(j, j+words[0].length());
        		if(temp.containsKey(cur)){
        			if(temp.get(cur)==1){
        				temp.remove(cur);
        				//System.out.println(cur + " found");
        			}else{
        				temp.put(cur, temp.get(cur)-1);
        				//System.out.println(cur + " found");
        			}
        		}else{
                    break;
                }
        		//System.out.println("...............");
        		j = j + words[0].length();
        	}
        	
        	if(temp.isEmpty()){
        		result.add(i);
        	}
        }
        
        return result;
    }

}
