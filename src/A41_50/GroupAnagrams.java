package A41_50;

/*
Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	
	public static void main(String[] args){
		String[] test = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(test));
	}
	
    public static List<List<String>> groupAnagrams(String[] strs) {
    	
    	HashMap<String, List<String>> result = new HashMap<String, List<String>>();
    	List<List<String>> res = new ArrayList<List<String>>();
    	
    	for(int i = 0; i<strs.length;i++){
    		char[] ca = strs[i].toCharArray();
    		Arrays.sort(ca);
            String key = String.valueOf(ca);
    		if(!result.containsKey(key)){
        		result.put(key, new ArrayList<String>());
        		result.get(key).add(strs[i]);
    		}else{
    			result.get(key).add(strs[i]);
    		}
    	}
    	
    	result.forEach((k, v)-> res.add(v));
        return res;
    }

}
