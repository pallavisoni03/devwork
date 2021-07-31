package com.pal.intops;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,3,3};
		int target = 6;
		int[] resultArr = new TwoSum().twoSumImpl(nums, target);
			for(int intVal : resultArr) {
				System.out.println(intVal);
			}
		
	}
	
	
	
	public int[] twoSumImpl(int[] nums, int target) {
		int[] resultArr = {-1,-1};
		HashMap<Integer, Integer> arrHash = new HashMap<Integer, Integer>();
		int arrLen = nums.length;
		for(int i=0; i<=arrLen-1; i++) {
			arrHash.put(nums[i], i);
		}
		System.out.println(arrHash);
		for(int i=0; i<=arrLen-1; i++) {
			int numToCheck = target-nums[i];
			if(arrHash.containsKey(numToCheck) && arrHash.get(numToCheck)!=i) {
				resultArr[0]=i;
				resultArr[1]=arrHash.get(numToCheck);
			}
		}
		
		return resultArr;
		
	}

	
	
	
	public int[] twoSumImpl1(int[] nums, int target) {
		int[] resultArr = new int[2];
		//int firstVal = nums[0];
			for(int i=0; i<nums.length-1; i++) {
				int tempSum = nums[i] + nums[i+1];
				if(tempSum == target) {
					resultArr[0] = i;
					resultArr[1] = i+1;
				}else {
					resultArr[0] = -1;
					resultArr[1] = -1;
				}
			}
		
		
		return resultArr;
	}

}
