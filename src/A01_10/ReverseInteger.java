package A01_10;

/*
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

click to show spoilers.

Note:
The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
 */

public class ReverseInteger {
	
	public static void main(String[] args){
		int test = 1000000003;
		System.out.println(reverse(test));
	}
	
    public static int reverse(int x) {
    	int result = 0;
    	int temp = x;
    	int move = 10;
    	
    	while(temp != 0){
    		int check = result;
    		result = result*move + temp%move;
    		if(result/move != check){
    			return 0;
    		}
    		temp = temp/move;
    		System.out.println(result);
    	}
    	
		return result;
    }
}
