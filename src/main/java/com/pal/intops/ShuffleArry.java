package com.pal.intops;

public class ShuffleArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] nums = {1,1,2,2};//{1,2,3,4,4,3,2,1};//{2,5,1,3,4,7};
			int n = 2;//4;//3;
			int[] shuffledArr = shuffle(nums,n);
			for(int vals:shuffledArr){
				System.out.print(vals+" ");
			}
	}
	private static int[] shuffle(int[] nums, int n) {
		int arrLen = nums.length;
        int[] shuffledArr = new int[arrLen];
        int j=0;
        for(int i=0;i<arrLen-1;i+=2){
        	shuffledArr[i]=nums[j];
        	shuffledArr[i+1]=nums[n];
            j++;
            n++;
         }
        return shuffledArr;
	}
}
