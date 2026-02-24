package com.pract;

import java.util.Arrays;

public class ProductArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] nums = {1,2,3,4};
		
		int len = nums.length;
		int[] result = new int[len];
		
		int suf = 1 , pre = 1;
		
		for(int i = 0 ; i < len ; i++) {
			
			result[i] = pre; //1 , 1 , 2 , 6
			pre *= nums[i]; // 1 , 1 , 2 , 6
			//System.out.println(Arrays.toString(result));
		}
		
		//result[] = [1 , 1 , 2 , 6] * [1,2,3,4]
		for(int j = len - 1 ; j>= 0 ;j--) {
			result[j] *= suf; // 24 , 12 , 4 ,1 
			suf *= nums[j];  // 4 , 12 , 24 ,24
			//System.out.println(Arrays.toString(result));
		}
		
		System.out.println(Arrays.toString(result));
	}

}
