package A01_10;
/*
 * 
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

Example 1:
nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
 */
public class MedianofTwoSortedArrays {
	public static void main(String[] args){
		int[] nums1 = {1,3};
		int[] nums2 = {2};
		System.out.println(MedianofTwoSortedArraysTest(nums1, nums2));
 	}

	private static double MedianofTwoSortedArraysTest(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
		int m = nums1.length;
		int n = nums2.length;
		
		if(m<n){
			return MedianofTwoSortedArraysTest(nums2,nums1);
		}
		
		if(n==0){
			return ((double)nums1[(m-1)/2]+(double)nums1[m/2])/2;
		}
		
		int lo = 0, hi = n*2;
		while(lo<=hi){
			int mid2 = (lo+hi)/2;
			int mid1 = m+n-mid2;
			
	        double L1 = (mid1 == 0) ? Integer.MIN_VALUE: nums1[(mid1-1)/2];
	        double L2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[(mid2-1)/2];
	        double R1 = (mid1 == m * 2) ? Integer.MAX_VALUE : nums1[(mid1)/2];
	        double R2 = (mid2 == n * 2) ? Integer.MAX_VALUE : nums2[(mid2)/2];
	        
	        if(L1>R2) lo = mid2+1;
	        else if(L2>R1) hi = mid2-1;
	        else return (Math.max(L1, L2)+Math.min(R1, R2))/2;
		}
		
		return -1;
	}


}
