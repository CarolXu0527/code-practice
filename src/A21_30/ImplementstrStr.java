package A21_30;

/*
 * 
Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */

public class ImplementstrStr {
	public static void main(String args[]){
		System.out.println(strStr("mississippi","issip"));
		
	}
	
    public static int strStr(String haystack, String needle) {
    	//if(haystack.length()==0||needle.length()==0){
    	//	return 0;
    	//}
    	
    	int ptr1 = 0;
    	int ptr2 = 0;
    	
    	while(ptr1<haystack.length()&&ptr2<needle.length()){
    		if(haystack.charAt(ptr1)== needle.charAt(ptr2)){
    			ptr1++;
    			ptr2++;
    		}else{
    			System.out.println(ptr1 + " " + ptr2);
    			ptr1=ptr1-ptr2+1;
    			ptr2=0;
    		}
    	}
    	
    	if(ptr2==needle.length()){
    		return ptr1-ptr2;
    	}else{
    		return -1;
    	}
        
    }

}
