package A41_50;

public class MultiplyStrings {
	
	public static void main(String[] args){
		String num1 = "9999";
		String num2 = "0";
		System.out.println(multiply(num1, num2));
	}
	
    public static String multiply(String num1, String num2) {
    	int[] result = new int[num1.length()+num2.length()];
    	
    	int temp = 0;
        for(int i = num1.length()-1; i>=0;i--){
        	for(int j = num2.length()-1; j>=0;j--){
        		temp = result[i+j+1] + (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
        		result[i+j+1] = temp%10;
        		result[i+j] = result[i+j] + temp/10;
        		System.out.println("Current pos " + (i+j+1) + " value is " + result[i+j+1]);
        	}
        }
        
        System.out.println("..............................");

        StringBuilder sb = new StringBuilder();
        int ptr = 0;
        while(result[ptr]==0 && ptr<result.length-1){
        	ptr++;
        }
        System.out.println("Zero cleared at " + ptr);
        for(int k = ptr; k<(num1.length()+num2.length());k++){
        	sb.append(result[k]);
        }
    	return sb.toString();
    }

}
