package com.pract;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/*
 * 23. Merge k Sorted Lists
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.

Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]

Example 2:

Input: lists = []
Output: []
Example 3:

Input: lists = [[]]
Output: []

 * 
 * */

 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

	public static ListNode getMergedKSortedList(ListNode[] list) {
		
		if(list == null || list.length == 0) {
			return null;
		}
		
		PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b) -> a.val -  b.val);
		
		for(ListNode node : list) {
			if(node != null) {
			minHeap.offer(node);}
		}
		
		
		
		
		
		
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
