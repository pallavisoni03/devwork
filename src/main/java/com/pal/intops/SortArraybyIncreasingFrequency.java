package com.pal.intops;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/* https://leetcode.com/problems/sort-array-by-increasing-frequency/ */
public class SortArraybyIncreasingFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,2,2,3};
		int[] outputArr = new SortArraybyIncreasingFrequency().frequencySort(nums);
	}
	
	 public int[] frequencySort(int[] nums) {
		 int arrLength = nums.length;
		 int[] outputArr = new int[arrLength];
		 Map<Integer,Integer> freqMap = new HashMap<Integer,Integer>();
			 for(int val: nums) {
				freqMap.put(val, freqMap.getOrDefault(val,0)+1);
			}
			 for(Map.Entry<Integer, Integer> values: freqMap.entrySet()) {
				 
			 }
			 System.out.println(freqMap);
			 //PriorityQueue pq = new PriorityQueue<>(comparator);
	        
		 return outputArr;
	   }

}
