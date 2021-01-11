package com.pal.intops;

import java.util.Arrays;

/* https://leetcode.com/problems/squares-of-a-sorted-array/ */
public class SquaresofSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-4,-1,0,3,10};
		int[] outputArr = new SquaresofSortedArray().sortedSquares(nums);
		for(int numbers : outputArr) {
			System.out.print(numbers+",");
		}
		System.out.println("\nWith 2 pointer approach");
		int[] outputArr1 = new SquaresofSortedArray().sortedSquares(nums);
		for(int numbers : outputArr1) {
			System.out.print(numbers+",");
		}
	}
	 
	public int[] sortedSquares(int[] nums) {
	     int[] outputArr = new int[nums.length];
	     //Arrays.sort(nums);
	     int i = 0;
	     for(int numbers : nums) {
	    	 int numSq = (int) Math.abs((Math.pow(numbers,2)));
	    	 outputArr[i] = numSq;
	    	 i++;
	     }
	     Arrays.sort(outputArr);
	     return outputArr;
	 }
	
	// 2 pointer approach 
	
	 public int[] sortedSquares1(int[] A) {
	        int n = A.length;
	        int[] result = new int[n];
	        int i = 0, j = n - 1;
	        for (int p = n - 1; p >= 0; p--) {
	            if (Math.abs(A[i]) > Math.abs(A[j])) {
	                result[p] = A[i] * A[i];
	                i++;
	            } else {
	                result[p] = A[j] * A[j];
	                j--;
	            }
	        }
	        return result;
	    }
}
