package com.pal.intops;
/* https://leetcode.com/problems/missing-number/ */
import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0};//{9,6,4,2,3,5,7,0,1};//{0,1};//{3,0,1};
		System.out.println(new MissingNumber().missingNumber(nums));
	}
	
	public int missingNumber(int[] nums) {
		int outputInt = -1;
		int arrLen = nums.length;
		int sum = 0;
			for(int value : nums) {
					sum += value;
				}
			outputInt = ((arrLen*(arrLen+1))/2)-sum;
		return outputInt;
        
    }

}
