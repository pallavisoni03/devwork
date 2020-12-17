package com.pal.intops;

public class SmallerThanCurrentNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {7,7,7,7};//{6,5,4,8};//{8,1,2,2,3};
		int[] outputArr = new SmallerThanCurrentNum().smallerNumbersThanCurrent(nums);
		for(int numcheck : outputArr){
			System.out.print(numcheck+" ");
		}
	}
	
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int arrLen = nums.length;
        int[] outputArr = new int[arrLen];
        int counter = 0;
        int numComp = 0;
        for(int i=0; i<arrLen; i++){
        	numComp = nums[i];
        	for(int numcheck : nums){
        			if(numcheck<numComp){
        				counter++;
        			}
        		}
        	outputArr[i]=counter;
        	counter=0;
        }
        return outputArr;
    }
}
