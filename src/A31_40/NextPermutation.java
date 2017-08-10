package A31_40;

/*
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place, do not allocate extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
1,2,3 → 1,3,2
3,2,1 → 1,2,3
1,1,5 → 1,5,1
 */

public class NextPermutation {
	
	public static void main(String[] args){
		int[] test = {1,3,2};
		int[] result = nextPermutation(test);
		System.out.println(result.toString());
		for(int i = 0; i<result.length;i++){
			System.out.println(result[i]);
		}
	}

	private static int[] nextPermutation(int[] nums) {
		// TODO Auto-generated method stub
		int temp = nums.length - 1;
		while(temp > 0){
			if(nums[temp]<nums[temp-1]){
				System.out.println(nums[temp]);
				temp--;
			}else{
                break;
            }
		}
		
		System.out.println("peek value" + nums[temp]);
		int peek = (temp==-1)?0:temp;
		
		if(peek == 0){
			System.out.println("peek == 0");
			asc(0,nums.length-1,nums);
			return nums;
		}
		
		int TBswitchPos = TBswitch(peek,nums);
		System.out.println(TBswitchPos);
		
		int tempVal = nums[TBswitchPos];
		nums[TBswitchPos] = nums[peek-1];
		nums[peek-1] = tempVal;
		
		System.out.println(nums[peek-1]);
		
		
		asc(peek,nums.length-1,nums);
		
		return nums;
	}

	private static void asc(int start, int end, int[] nums) {
		// TODO Auto-generated method stub
		
		System.out.println("asc:");
		
		for(int i = start; i<end+1;i++){
			System.out.println(nums[i]);
		}
		
		for(int i = start+1; i < end+1;i++){
			int temp = nums[i];
			int j = i-1;
			while(j>=start && nums[j]>temp){
				nums[j+1] = nums[j];
				j = j-1;
			}
			nums[j+1] = temp;
		}
		
	}

	private static int TBswitch(int peek, int[] nums) {
		// TODO Auto-generated method stub
		int temp = nums.length-1;
		
		while(temp>peek){
			if(nums[temp]>nums[peek-1]){
				return temp;
			}
			temp--;
		}
		
		return peek;
	}

}
