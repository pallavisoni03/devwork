package com.pal.intops;

/* https://leetcode.com/problems/xor-operation-in-an-array/ */

public class ArrayXOROperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4, start = 3;
		System.out.println(new ArrayXOROperation().xorOperation(n, start));
	}

	public int xorOperation(int n, int start) {
		int intXOR = 0;
		int tempNum = 0; 
		for(int i=0; i<n; i++) {
			tempNum =  start + 2*i;
			intXOR = intXOR ^ tempNum;
			tempNum = 0;
		}
        return intXOR;
	}
}
