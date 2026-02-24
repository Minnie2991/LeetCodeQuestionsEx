package com.pract;

import java.util.Arrays;

/*
 * reduce() is a terminal operation used to:
Combine all elements of a stream into a single result.
Examples:
Sum
Multiply
Find max
Concatenate strings
Build custom objects
 * */

public class SumAllReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};

		
		System.out.println("Sum: " + Arrays.stream(arr).reduce(0, (a,b) -> a + b));
		
		System.out.println("Product :" + Arrays.stream(arr).reduce(1, (a,b) -> a * b));
		
		System.out.println("Max :" + Arrays.stream(arr).reduce(Integer.MIN_VALUE, Integer::max));
	}

}
