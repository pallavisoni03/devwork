package com.pal.intops;
/* https://leetcode.com/problems/reverse-integer/ */
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -123;
	 
		System.out.println(new ReverseInteger().revInt(x));
	}
	

	public int revInt(int x) {
		int k = 0;
		int xr = 0;
		while(x > 0) {
			xr = x%10;
			System.out.println(xr);
			k = k * 10 + xr;
			x = x / 10;
		}
		return k;
		
	}
}
