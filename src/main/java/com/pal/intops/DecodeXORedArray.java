package com.pal.intops;

public class DecodeXORedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] encoded = {6,2,7,3};//{1,2,3};
		int first = 4;//1;
		int[] resultArr = new DecodeXORedArray().decode(encoded, first);
		for(int nums : resultArr) {
			System.out.println(nums);
		}
	}
	
	public int[] decode(int[] encoded, int first) {
		int arrLen = encoded.length;
		int[] resultArr =new int[arrLen+1];
		resultArr[0] = first;
		for(int i=0; i<arrLen; i++) {
			resultArr[i+1] = resultArr[i] ^ encoded[i];
		}
		return resultArr;
    }

}
