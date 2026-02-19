package com.pract;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {

	public static int[] getTopKFreq(int[] nums , int k) {
		
		Map<Integer , Integer> freqMap = new HashMap();
		
		for(int num : nums) {
			freqMap.put(num ,freqMap.getOrDefault(num, 0) + 1);
			
			System.out.println(freqMap);
		}
		
		PriorityQueue<Integer> minHeap = new PriorityQueue((a,b) -> freqMap.get(a) - freqMap.get(b)) ;
		
		System.out.println(minHeap);
		
		for(int num : freqMap.keySet()) {
			minHeap.offer(num);
		}
		System.out.println(minHeap);
		
		if(minHeap.size() > k) {
			minHeap.poll();
		}
	    System.out.println(minHeap);
		
		int[] result = new int[k];
		for(int i = k -1 ; i >= 0; i--) {
			result[i] = minHeap.poll();
		 //System.out.println(Arrays.toString(result));
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,1,1,2,2,3};
			int	k = 2;
		getTopKFreq(nums ,k);
	}

}
