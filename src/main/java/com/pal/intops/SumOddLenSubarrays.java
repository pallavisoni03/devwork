package com.pal.intops;


/* https://leetcode.com/problems/sum-of-all-odd-length-subarrays/ */
public class SumOddLenSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = {1,4,2,5,3};//{1,2};//
		int sum = new  SumOddLenSubarrays().sumOddLengthSubarrays(intArr);
		System.out.println(sum);
	}
	
	public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            int temp = 0;
            for (int j=i; j<arr.length; j++) {
                temp = temp + arr[j];
                System.out.println(temp);
                int suArrLen = j - i + 1;
                //System.out.println(suArrLen);
                if (suArrLen % 2 == 1)
                    sum = sum + temp;
            }
        }
        return sum;
            
    }

}
