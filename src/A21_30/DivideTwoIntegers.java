package A21_30;

/*
Divide two integers without using multiplication, division and mod operator.

If it is overflow, return MAX_INT.
 */

public class DivideTwoIntegers {
	
	public static void main(String[] args){
		System.out.println(divide(45,4));
	}
	
    public static int divide(int dividend, int divisor) {
    	
    	if(dividend==Integer.MIN_VALUE && divisor==-1){
    		return Integer.MAX_VALUE;
    	}
    	
    	if(dividend >0 && divisor > 0){
    		return divideHelper(-dividend, -divisor);
    	}else if(dividend >0){
    		return -divideHelper(-dividend, divisor);
    	}else if(divisor >0){
    		return -divideHelper(dividend, -divisor);
    	}else{
    		return divideHelper(dividend, divisor);
    	}
        
    }

	private static int divideHelper(int dividend, int divisor) {
		// TODO Auto-generated method stub
		if(divisor<dividend){
			return 0;
		}
		int cur = 0, res = 0;
		while((divisor << cur) >= dividend && divisor << cur<0 && cur < 31){
			cur++;
		}
		
		res = dividend - (divisor << cur-1);
		
		if(res > divisor){
			return 1<<cur-1;
		}
		
		return (1<<cur-1)+divide(res, divisor);
	}

}
