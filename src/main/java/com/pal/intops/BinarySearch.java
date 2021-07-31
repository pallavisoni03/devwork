package com.pal.intops;
/* https://leetcode.com/problems/binary-search/ */

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {-1,0,3,5,9,12};//{-1,0,3,5,9,12};
		int target = 12;
		//int result = new BinarySearch().binarySearchimpl(nums, target);
		//System.out.println(result);
		
		int resultRec = new BinarySearch().binarySearchimplRec(nums, target, 0, nums.length-1);
		System.out.println(resultRec);
		
	}

	public int binarySearchimpl(int[] arr, int target) {
		
		int end = arr.length-1, start=0, mid;
		while(start <= end) {
		 mid = start + (end - start) / 2;
		 //System.out.println(mid);
		 if(arr[mid] == target) return mid;
			if(target < arr[mid]) { end = mid - 1;}
			else {start = mid + 1;}
					
		}		
				
		return -1;
	}
	
	public int binarySearchimplRec(int[] arr, int target, int start, int end) {
		
		int mid = start + (end - start) / 2;
		
			 if(arr[mid] == target) {
				 return mid;
			 }
		 
			if(target < arr[mid]) {
				return binarySearchimplRec(arr, target, start , mid - 1);
				}
			else {
				return binarySearchimplRec(arr, target, mid + 1 , end);
			}
			
	}
	
}
