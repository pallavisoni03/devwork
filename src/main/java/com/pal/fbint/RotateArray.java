package com.pal.fbint;


/*
 * https://leetcode.com/problems/rotate-array/
 * Rotate an array of n elements to the right by k steps.
 *  For example, with n = 7 and k = 3, the array 
 *  [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 *   How many different ways do you know to solve this problem?
 */

public class RotateArray {

	public static void main(String[] args) {
		int[] nums = {-1,-100,3,99};//{1,2,3,4,5,6,7};//
		int k = 2; 
		
		new RotateArray().rotate(nums, k);
		for(int arrVal : nums) {
			System.out.println(arrVal);
		}
		
		
		new RotateArray().rotate1(nums, k);
	}

	public void rotate(int[] nums, int k) {
		int arrLen = nums.length;
		int endIndx =  arrLen-(k % arrLen);
		
		int[] newArr = new int[arrLen];
		int j = 0;
		for(int i=endIndx; i<arrLen; i++) {
			newArr[j]=nums[i];
			j++;
		}
		for(int i=0; i<endIndx; i++) {
			newArr[j]=nums[i];
			j++;
		}
		j = 0;
		for(int i = 0; i<arrLen; i++) {
			nums[i]=newArr[j];
			j++;
		}
	}
	
	
	public void rotate1(int[] nums, int k) {
	    k %= nums.length;
	   // System.out.println(k %= nums.length);
	    reverse(nums, 0, nums.length - 1);
	    reverse(nums, 0, k - 1);
	    reverse(nums, k, nums.length - 1);
	}

	public void reverse(int[] nums, int start, int end) {
	    while (start < end) {
	        int temp = nums[start];
	        nums[start] = nums[end];
	        nums[end] = temp;
	        start++;
	        end--;
	    }
	}

}

