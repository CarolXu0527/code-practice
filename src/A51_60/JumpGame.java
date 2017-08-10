package A51_60;

/*
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

For example:
A = [2,3,1,1,4], return true.

A = [3,2,1,0,4], return false.
 */

public class JumpGame {
	
	public static void main(String[] args){
		int[] test = {3,2,1,1,4};
		System.out.println("result is " + canJump(test));
	}
	
	
    public static boolean canJump(int[] nums) {
        int length = nums.length;
        int curPos = 0;
        int nextStep = 0;
        int stepTaken = 0;
        
        while(curPos < length){
        	System.out.println("new round");
        	if(curPos == length-1){
        		return true;
        	}
        	
        	if(curPos!=length-1 && nums[curPos] == 0){
        		System.out.println("Current pos " + curPos);
        		return false;
        	}
        	
        	int temp = 0;
    		for(int i = 1; i<=nums[curPos]; i++){
    			if((curPos+i)<nums.length && i+nums[curPos+i]>temp){
    				temp = i+nums[curPos+i];
    				nextStep = i;
    				System.out.println("The current best choice is " + i + " from " + curPos);
    			}else if((curPos+i)>=nums.length-1){
    				return true;
    			}
    		}
    		stepTaken++;
    		curPos = curPos + nextStep;
        }
		return false;
    
    }
}
