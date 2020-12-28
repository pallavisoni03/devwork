package com.pal.intops;
/*https://leetcode.com/problems/decompress-run-length-encoded-list/*/
public class DecompressEncodedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,3};//{1,2,3,4};
		int[] outputArr = new DecompressEncodedList().decompressRLElist(nums);
	}
	
	public int[] decompressRLElist(int[] nums) {
       int counter = 0;
       		for(int i = 0 ; i<nums.length; i+=2) {
       			int freq = nums[i];
				for(int j=0;j<freq;j++)  {
					counter++;
				}
			}
       	 int index = 0;
       		int[] outputArr = new int[counter];
       		for(int i = 0 ; i<nums.length; i+=2) {
       			int freq = nums[i];
				int val = nums[i+1];
				for(int j=0;j<freq;j++)  {
					outputArr[index]=val;
					index++;
							
				}
			}
    		return outputArr;
    }

}
