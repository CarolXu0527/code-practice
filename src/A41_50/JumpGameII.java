package A41_50;

/*
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

For example:
Given array A = [2,3,1,1,4]

The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.)

Note:
You can assume that you can always reach the last index.
 */

public class JumpGameII {
	
	public static void main(String[] args){
		int[] test = {1,2,1,1,1};
		System.out.println("result is " + jump(test));
	}
	
	
    public static int jump(int[] nums) {
        int length = nums.length;
        int curPos = 0;
        int nextStep = 0;
        int stepTaken = 0;
        
        while(curPos < length){
        	System.out.println("new round");
        	if(curPos == length-1){
        		return stepTaken;
        	}
        	
        	int temp = 0;
    		for(int i = 1; i<=nums[curPos]; i++){
    			if((curPos+i)<nums.length && i+nums[curPos+i]>temp){
    				temp = i+nums[curPos+i];
    				nextStep = i;
    				System.out.println("The current best choice is " + i + " from " + curPos);
    			}else if((curPos+i)>=nums.length-1){
    				return stepTaken+1;
    			}
    		}
    		stepTaken++;
    		curPos = curPos + nextStep;
        }
        
    	return stepTaken;
    }
	
    public static int jump2(int[] nums) {
        return jumpRC(0,0,nums);
    	
    }

	private static int jumpRC(int CurPos, int Taken, int[] nums) {
		// TODO Auto-generated method stub
		if(CurPos==nums.length-1){
			return Taken;
		}else if(nums[CurPos]<1 && CurPos<nums.length-1){
			return -1;
		}
		
		int temp = 0;
		int move = 0;
		
		for(int i = 1; i<=nums[CurPos]; i++){
			if((CurPos+i)<nums.length && i+nums[CurPos+i]>temp){
				temp = i+nums[CurPos+i];
				move = i;
				System.out.println("The current best choice is " + i + " from " + CurPos);
			}else if((CurPos+i)>=nums.length){
				return Taken+1;
			}
		}
		return jumpRC(CurPos+move, Taken+1,nums);
	}

}
