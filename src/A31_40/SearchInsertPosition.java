package A31_40;

public class SearchInsertPosition {
	
	public static void main(String[] args){
		int[] test = {1,2,3};
		int target = 2;
		System.out.println(searchInsert(test,target));
	}
	
    public static int searchInsert(int[] nums, int target) {
    	
    	int position = Integer.MAX_VALUE;
    	
    	return RecursiveSI(nums, 0, nums.length-1, target, position);
        
    }

	private static int RecursiveSI(int[] nums, int i, int j, int target, int position) {
		// TODO Auto-generated method stub
		if(i == j){
			if(target <= nums[i]){
				position = i;
				System.out.println("result is " + i);
			}else{
				position = i+1;
				System.out.println("result is " + (i+1));
			}
			return position;
		}
		
		if(target > nums[(i+j)/2]){
			System.out.println("Soooo big");
			return RecursiveSI(nums, (i+j)/2+1, j, target, position);
		}else{
			System.out.println("Soooo small");
			return RecursiveSI(nums, i , (i+j)/2, target, position);
		}
		
	}

}
