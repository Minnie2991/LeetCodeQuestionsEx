package com.pract;

/* Sort the array 1,0,0,1,0,1 using one for loop?
 * Moving zero on either end?
 * */
public class MoveAllZerosToEnd {

	public static void moveZeros(int[] arr) {
		
		int count = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count ++;
				
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {1, 1, 0, 1, 1, 0, 1, 0};
		
		moveZeros(arr);
		
		for(int num : arr){
		System.out.println(num + "");
		
		}
	}
}
