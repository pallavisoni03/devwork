package com.pal.intops;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,0,3,5,9,12};//{-1,0,3,5,9,12};
		int target = 12;
		System.out.println(new LinearSearch().linearSearch(nums, target));
	}

	public int linearSearch(int[] arr, int target) {
		
		for(int i=0; i<arr.length; i++) {
			if(target == arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
