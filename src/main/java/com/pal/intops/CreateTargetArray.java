package com.pal.intops;

public class CreateTargetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,2,3,4};//{1};//
		int[] index = {0,1,2,2,1};//{0};//
		int[] targetArr = new CreateTargetArray().createTargetArray(nums,index);
			for(int value : targetArr){
				System.out.print(value+" ");
			}
	}

	public int[] createTargetArray(int[] nums, int[] index) {
		int arrLen = nums.length;
		int[] targetArr = new int[arrLen];

        for(int i = 0; i < arrLen; i++){
            int value = nums[i]; 
            int indexInt = index[i]; 
            // System.arraycopy(targetArr, index[i], targetArr, index[i] + 1, arrLen - 1);
            for (int j = arrLen-2; j >= indexInt; j--) {                
            	targetArr[j+1] = targetArr[j];
            }
          
            targetArr[indexInt] = value;
        }
        return targetArr;
    }
}
