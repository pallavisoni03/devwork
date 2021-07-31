package com.pal.fbint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* https://leetcode.com/problems/3sum/
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
 * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * Notice that the solution set must not contain duplicate triplets.
 */

public class ThreeSum {
	
	int k = 0;
	
	public static void main(String[] args) {
		
		int[] nums = {-1,0,1,2,-1,-4};
		List<List<Integer>> resultList = new ThreeSum().threeSum(nums);
		for(List sumList : resultList) {
			System.out.println(sumList);
		}
		
	}
	
	public List<List<Integer>> threeSum(int[] nums) {
		
		HashMap<Integer, Integer> arrHash = new HashMap<Integer, Integer>();
		int arrLen = nums.length;
		List<List<Integer>> optList = new ArrayList<List<Integer>>();
		
		for(int i=0; i<=arrLen-1; i++) {
			arrHash.put(nums[i], i);
		}
		for(int arrayVal : nums) {
			int twoSumNo = 0 - arrayVal;
		
			List<Integer> resultList = twoSum(nums, twoSumNo, arrHash);
			resultList.add(arrayVal);
			optList.add(resultList);
			
		}

		return optList;
        
    }
	
	 public List<Integer> twoSum(int[] nums, int target, HashMap<Integer, Integer> arrHash) {
	        List<Integer> resultList = new ArrayList<Integer>();
	        int arrLen = nums.length;
			for(int i=0; i<=arrLen-1; i++) {
				int numToCheck = target-nums[i];
				if(arrHash.containsKey(numToCheck) && arrHash.get(numToCheck)!=i) {
					resultList.add(i);
					resultList.add(arrHash.get(numToCheck));
				}
			}
			
			return resultList;
	    }

}
