package A41_50;

//Implement pow(x, n).

public class Pow {
	
	public static void main(String[] args){
		double num1 = 0.1;
		int num2 = -3;
		System.out.println(myPow(num1, num2));
	}
	
    public static double myPow(double x, int n) {
    	
    	double result = 0;
    	
    	if(n==0){
    		return 1;
    	}
    	
        double temp = myPow(x, n/2);
    	if(n%2 == 0){
    		return temp*temp;
    	}else{
    		if(n>0){
    			return temp*temp*x;
    		}else{
    			return temp*temp/x;
    		}
    	}
    }

}