package com.pal.fbint;

import java.util.PriorityQueue;


/* https://leetcode.com/problems/kth-largest-element-in-an-array/
 * Find the kth largest element in an unsorted array. 
 * Note that it is the kth largest element in the sorted order, 
 * not the kth distinct element.
 * For example, given [3,2,1,5,6,4] and k = 2, return 5.
 */

public class KthLargestElement {
	public static void main(String[] args) {
		int[] nums = {3,2,1,5,6,4};
		int k = 2;
		int opt = new KthLargestElement().findKthLargest(nums, k);
		System.out.println(opt);
	}
	
	 public int findKthLargest(int[] nums, int k) {
		 PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
		    for(int i: nums){
		        q.offer(i);
		 
		        if(q.size()>k){
		            q.poll();
		        }
		    }
		 
		    return q.peek();

     }
	 
	 public int[] quickSort(int[] nums, int begin, int end) {
		 while(begin < end) {
			 
		 }
		 
		 return nums;
	 }

}
