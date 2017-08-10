package A01_10;

/*
Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.

Update (2015-02-10):
The signature of the C++ function had been updated. If you still see your function signature accepts a const char * argument, please click the reload button  to reset your code definition. 
 */



public class StringtoInteger {
	
	public static void main(String[] args){
		String test = "-2147483647";
		System.out.println(StringtoIntegerTest(test));
	}

	private static int StringtoIntegerTest(String test) {
		// TODO Auto-generated method stub
		int result = 0;
		int length = test.length();
		int cur = 0;
		int sign = 1;

		System.out.println("Length is " + length);
		
        if(length==0)return 0;
        
        while(test.charAt(cur) == ' ' && cur < length){
        	cur++;
        	System.out.println(cur);
        }
        
        if(test.charAt(cur) == '-' || test.charAt(cur) == '+'){
        	sign = (test.charAt(cur) == '-')?-1:1;
        	System.out.println("Sign is: " + sign);
        	cur++;
        }
        
        while(cur<length){
        	if((int)test.charAt(cur) < 58 && (int)test.charAt(cur) > 47){
        		int check = result;
        		result = result * 10 + test.charAt(cur) - 48;
        		System.out.println("current result: " + result);
        		
        		if(Integer.MAX_VALUE/10 < check || Integer.MAX_VALUE/10 == check && Integer.MAX_VALUE %10 < test.charAt(cur) - 48)
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        	}else{break;}
        	cur++;
        }
        
        System.out.println("current result before result: " + result);
        result = result * sign;
        
        return result;
	}

}
