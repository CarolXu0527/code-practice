package A11_20;

import java.util.HashMap;

/*
 * 
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.
 */

public class RomantoInteger {
	
	public static void main(String[] args){
		String Roman = "MMCCCXCIX";
		System.out.println(romanToInt(Roman));
	}

	private static int romanToInt(String roman) {
		// TODO Auto-generated method stub
		int I = 0, V = 0, X = 0, L = 0, C = 0, D = 0, M = 0;
		for(int i = roman.length()-1; i>=0;i--){
			if(roman.charAt(i) == 'I'){
				if(V == 0 && X == 0){I = I+1;}else{I = I-1;}
			}
			
			if(roman.charAt(i) == 'V'){
				V = V+5;
			}
			
			if(roman.charAt(i) == 'X'){
				if(L == 0 && C ==0){X = X+10;}else{X = X-10;}
			}
			
			if(roman.charAt(i) == 'L'){
				L = L+50;
			}
			
			if(roman.charAt(i) == 'C'){
				if(D == 0 && M == 0){C = C+100;}else{C = C-100;}
			}
			
			if(roman.charAt(i) == 'D'){
				D = D+500;
			}
			
			if(roman.charAt(i) == 'M'){
				M = M+1000;
			}
		}
		
		
		return I+V+X+L+C+D+M;
	}

}
