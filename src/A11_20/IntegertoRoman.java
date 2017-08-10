package A11_20;

/*
 * 
Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.
 */

public class IntegertoRoman {
	
	public static void main(String[] args){
		int num = 123;
		System.out.println(intToRoman(num));
	}

	private static String intToRoman(int num) {
		// TODO Auto-generated method stub
		String[] case1 = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String[] case2 = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String[] case3 = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String[] case4 = {"","M","MM","MMM"};
		
		return (case4[num/1000%10]+case3[num/100%10]+case2[num/10%10]+case1[num%10]);
	}

}
