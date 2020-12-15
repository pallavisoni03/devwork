package com.pal.intops;

public class ShuffleArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] nums = {2,5,1,3,4,7};
			int n = 3;
			int[] shuffledArr = shuffle(nums,n);
			for(int vals:shuffledArr){
				System.out.print(vals+" ");
			}
	}

	private static int[] shuffle(int[] nums, int n) {
		int arrLen = nums.length;
        int[] shuffledArr = new int[arrLen];
        int halfLen = arrLen-n;
         for(int i=0;i<halfLen;i++){
        	 for(int j=halfLen;j<arrLen;j++){
        	 shuffledArr[i]=nums[i];
        	 shuffledArr[j]=nums[j];
           } 
         }
        return shuffledArr;
		}
}
