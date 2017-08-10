package A41_50;

/*
Given an unsorted integer array, find the first missing positive integer.

For example,
Given [1,2,0] return 3,
and [3,4,-1,1] return 2.

Your algorithm should run in O(n) time and uses constant space.
 */

public class FirstMissingPositive {
	
	public static void main(String[] args){
		int[] test = {1,1};
		System.out.println(firstMissingPositive(test));
	}
	
    public static int firstMissingPositive(int[] nums) {
    	int length = nums.length;
    	
    	if(length == 0)return 1;
    	
    	for(int i = 0;i<length;i++){
    		while(nums[i]!=i+1 && nums[i]<length && nums[i]>0){
    			if(nums[nums[i]-1]!=nums[i]){
	    			int temp = nums[nums[i]-1];
	    			nums[nums[i]-1] = nums[i];
	    			nums[i] = temp;
    			}else{
    				break;
    			}
    		}
    	}
    	
    	for(int i = 0;i<length;i++){
    		System.out.println(nums[i]);
    	}
    	
    	int ptr = 0;
    	while(ptr<length){
    		if(nums[ptr]!=ptr+1){
    			return ptr+1;
    		}
    		ptr++;
    	}
    	
    	return length+1;
        
    }

}
