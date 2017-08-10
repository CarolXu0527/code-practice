package A01_10;

import java.util.HashMap;

public class PalindromeNumber {
	
	public static void main(String[] args){
		int test = -123321;
		System.out.println("The number is palindrome? " + PalindromeNumberTest(test));
	}

	private static boolean PalindromeNumberTest(int test) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> testMap = new HashMap<Integer,Integer>();
		int Temp = test;
		int cur, pos = 0;
		
		if(test < 0){
			return false;
		}
		
		while(Temp != 0){
			cur = Temp %10;
			testMap.put(++pos, cur);
			System.out.println(Temp);
			Temp = Temp/10;
		}
		System.out.println(testMap);
		if(pos%2 == 0){
			return CheckPalindrome(testMap, pos/2, pos/2+1, pos);
		}else{
			return CheckPalindrome(testMap, pos/2+1, pos/2+1, pos);
		}
	}

	private static boolean CheckPalindrome(HashMap<Integer, Integer> testMap, int i, int j, int pos) {
		// TODO Auto-generated method stub
		while(i>0 && j<=pos){
			if(testMap.get(i) != testMap.get(j)){
				return false;
			}
			i--;
			j++;
		}

		return true;
	}

}
