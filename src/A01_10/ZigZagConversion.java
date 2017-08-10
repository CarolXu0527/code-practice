package A01_10;

/*
 * 
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */

public class ZigZagConversion {
	
	public static void main(String[] args){
		String test = "PAYPALISHIRING";
		int rows = 1;
		System.out.println("The result is: " + ZigZagConversionTest(test, rows));
	}

	private static String ZigZagConversionTest(String test, int rows) {
		// TODO Auto-generated method stub
		String[] Temp = new String[rows];
		String result = "";
		
		if(rows == 1){
			return test;
		}
		
		for(int a = 0; a<rows;a++){
			Temp[a] = "";
		}

		for(int i = 0; i<test.length(); i++){
			int pos = (i)%(2*rows-2);
			if(pos < rows){
				System.out.println("position is type1: " + pos + test.charAt(i));
				Temp[pos] = Temp[pos] + String.valueOf(test.charAt(i));
				System.out.println("Current string for row " + pos + ": " + Temp[pos]);
			}else{
				System.out.println("position is type2: " + pos + test.charAt(i));
				Temp[2*rows-2-pos] = Temp[2*rows-2-pos] + String.valueOf(test.charAt(i));
				System.out.println("Current string for row " + pos + ": " + Temp[2*rows-2-pos]);
			}
		}
		
		for(int j = 0; j<rows;j++){
			result = result + Temp[j];
			System.out.println("Current Row: " + j + " " + result);
		}
		return result;
	}
}
