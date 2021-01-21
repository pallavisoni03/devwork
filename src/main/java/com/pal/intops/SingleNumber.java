package com.pal.intops;
/* https://leetcode.com/problems/single-number/ */
public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,1,2,1,2};//{2,2,1};
		System.out.println(new SingleNumber().singleNumber(nums));
	}
	
	public int singleNumber(int[] nums) {
        int output = 0;
	        for(int value : nums) {
	        	output = output^value;
	        }
		return output;
	}

}
