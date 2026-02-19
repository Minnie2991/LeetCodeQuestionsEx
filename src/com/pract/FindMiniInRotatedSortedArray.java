package com.pract;

public class FindMiniInRotatedSortedArray {

	public static int findMinimumInRotatedSortedArray(int[] nums) {
		
		int left = 0;
		int right = nums.length - 1;
		
		while(left < right) {
			
			int mid = left + (right - left)/2 ;
			
			if(nums[mid] > nums[right]) {
				left = mid + 1;
			}
			else right = mid;
		}
		
		return nums[left] ;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3,5,4};
		//int[]  nums = {11,13,15,17};
		System.out.println(findMinimumInRotatedSortedArray(nums));
	
		
//nums = [11,13,15,17]
	}

}
