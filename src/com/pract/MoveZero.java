package com.pract;

public class MoveZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4, 0, 5, 0};

		int left = 0;

		for (int right = 0; right < arr.length; right++) {
		    if (arr[right] != 0) {
		        int temp = arr[left];
		        arr[left] = arr[right];
		        arr[right] = temp;
		        left++;
		    }
		}
	
	}

}
