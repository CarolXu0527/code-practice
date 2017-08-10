package A31_40;

/*
Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4].


 */

public class SearchforaRange {
	
	public static void main(String[] args){
		int[] test = {1};
		int target = 1;
		int result[] = searchRange(test,target);
		System.out.println(result[0] + " " + result[1]);
	}
	
    public static int[] searchRange(int[] nums, int target) {
    	
    	int[] range = {Integer.MAX_VALUE,Integer.MIN_VALUE};
    	
    	if(nums.length==0){
    		range[0] = -1;
    		range[1] = -1;
            return range;
    	}
    	
    	BinarySearch(0,nums.length-1, nums, target, range);
    	
    	return range;
    	
        
    }

	private static void BinarySearch(int i, int j, int[] nums, int target, int[] range) {
		// TODO Auto-generated method stub
		
		int middle = (i+j)/2;
		
		if(i==j){
			if(nums[i]==target){
				range[0]=(i<range[0])?i:range[0];
				System.out.println("lower bound == " + range[0]);
				range[1]=(i>range[1])?i:range[1];
				System.out.println("uppper bound == " + range[1]);
			}else{
				range[0]=(range[0]==Integer.MAX_VALUE)?-1:range[0];
				range[1]=(range[1]==Integer.MIN_VALUE)?-1:range[1];
			}
			return;
		}
		
		if(nums[middle]==target){
			range[0]=(middle<range[0])?middle:range[0];
			System.out.println("lower bound TBD " + range[0]);
			range[1]=(middle>range[1])?middle:range[1];
			System.out.println("uppper bound TBD " + range[1]);
			BinarySearch(i,middle,nums,target,range);
			BinarySearch(middle+1,j,nums,target,range);
		}else if(nums[middle]>target){
			BinarySearch(i,middle,nums,target,range);
		}else if(nums[middle]<target){
			BinarySearch(middle+1,j,nums,target,range);
		}
		
	}

}
