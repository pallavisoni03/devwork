package com.pal.intops;

public class FindMissingNumberInArr {

	public static void main(String args[]) {
		
		int[] numberArr = new int[100];
		int expSum = 0; 
		expSum = new FindMissingNumberInArr().getSum(numberArr, expSum);
		System.out.println("====="+expSum+"----"+numberArr.length);
		int missingNum = new FindMissingNumberInArr().getMissingNumber(numberArr, expSum);
		System.out.println("Missing Number is----"+missingNum);
	}
	
	public int getMissingNumber(int[] arr,int expSum) {
		int arrSum = 0;
		for(int arrValue: arr) {
			arrSum = arrValue + arrSum;
		}
		System.out.println("===="+arrSum);
		int missingNum = expSum - arrSum;
		
		return missingNum;
	}
	public int getSum(int[] arr, int expSum) {
		
		for (int i=0; i<100; i++) {
			arr[i] = i+1;
			
			expSum = expSum + arr[i];
			if(i==50) arr[i] = 0;
		}
		return expSum;
	}
}
