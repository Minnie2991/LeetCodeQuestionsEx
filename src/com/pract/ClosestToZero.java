package com.pract;

import java.util.Arrays;

/*
 * Q. Given an array of integers, find the two numbers such that their sum is closest to zero.
 * */
public class ClosestToZero {

	public static void closeToZero(int[] arr) {
		
		int len = arr.length - 1 ;
		int left = 0 , right = len , minSum = Integer.MAX_VALUE;
		int first = 0 , second = 0 ;
		
		Arrays.sort(arr);
		
		while(left < right) {
			
			int sum = arr[left] + arr[right];
			
			if(Math.abs(sum) < Math.abs(minSum)) {
				
				minSum = sum;
				first = arr[left];
				second = arr[right];
			}
			
			if(sum < 0) {
				left ++;}
				else {
				right --;}
			}
		System.out.println("Pair: " + first + " , " + second);
		}
				
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 60, -10, 70, -80, 85};
		closeToZero(arr);
	}

}
