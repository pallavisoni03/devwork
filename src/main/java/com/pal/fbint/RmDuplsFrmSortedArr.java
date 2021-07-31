package com.pal.fbint;


public class RmDuplsFrmSortedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int opt = new RmDuplsFrmSortedArr().removeDuplicates(nums);
		System.out.println("length--->"+opt);
		for(int arrVal : nums) {
			System.out.print(arrVal+" ");
		}
	}

	public int removeDuplicates(int[] nums) {
		int i = 0;
		for(int j = 1; j < nums.length; j++) {
			if(nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];

			}
		}

		return i+1;

	}

}