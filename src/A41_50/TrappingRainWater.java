package A41_50;

/*
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

For example, 
Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 */

import java.util.Stack;

public class TrappingRainWater {
	
	public static void main(String[] args){
		int[] test = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(test));
	}
	
    public static int trap(int[] height) {
        int result = 0;
        int i = 0;
        //return trapRecursive(1, height, result);
        Stack<Integer> st = new Stack<Integer>();
        while(i<height.length){
        	while(!st.empty()&&height[i]>height[st.peek()]){
        		int pre = st.peek();
        		st.pop();
        		System.out.println("Pop " + pre);
        		if(st.isEmpty()){
        			break;
        		}
        		int h = Math.min(height[i], height[st.peek()])-height[pre];
        		int w = i - st.peek() -1;
        		result = result + h*w;
        		System.out.println("Here is the Result " + result + " " + h + " " + w);
        	}
        	System.out.println("Push " + i);
        	st.push(i++);
        }
        
        return result;
    }

	private static int trapRecursive(int waterLevel, int[] height, int result) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		int tempRes = 0;
		
		for(int i = 0; i<height.length;i++){
			if(height[i]>=waterLevel){
				if(!st.isEmpty() && st.peek()<i-1){
					System.out.println("Add new temp " + (i - st.peek() -1));
					tempRes = tempRes + i - st.peek() - 1;
				}
				st.push(i);
			}
		}
		
		System.out.println("Here is the tempRes " + tempRes);
		if(st.isEmpty()){
			return result;
		}else{
			//result = result + tempRes;
			System.out.println("Here is the Result " + result);
			return result + tempRes + trapRecursive(waterLevel+1, height, result);
		}
		
	}

}
