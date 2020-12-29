package com.pal.intops;

/*https://leetcode.com/problems/hamming-distance/*/

public class HammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1, y = 4;
		System.out.println(new HammingDistance().hammingDistance(x, y));
	}
	 public int hammingDistance(int x, int y) {
		int n = x ^ y; 
		System.out.println(n);
	    int setBits = 0; 
	  
	    while (n > 0)  
	    { 
	        setBits += n & 1; 
	        n >>= 1; 
	    } 
	  
	    return setBits; 
	 }

}
