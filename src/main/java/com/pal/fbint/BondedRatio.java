package com.pal.fbint;
/*
 * You are given an array of integers a and two integers l and r. 
 * You task is to calculate a boolean array b, where b[i] = true if there exists an integer x, such that a[i] = (i + 1) * x and l ≤ x ≤ r. 
 * Otherwise, b[i] should be set to false.
 * Example
 * For a = [8, 5, 6, 16, 5], l = 1, and r = 3, the output should be boundedRatio(a, l, r) = [false, false, true, false, true].
 * For a[0] = 8, we need to find a value of x such that 1 * x = 8, but the only value that would work is x = 8 which doesn't satisfy the boundaries 1 ≤ x ≤ 3, so b[0] = false.
 * For a[1] = 5, we need to find a value of x such that 2 * x = 5, but there is no integer value that would satisfy this equation, so b[1] = false.
 * For a[2] = 6, we can choose x = 2 because 3 * 2 = 6 and 1 ≤ 2 ≤ 3, so b[2] = true.
 * For a[3] = 16, there is no an integer 1 ≤ x ≤ 3, such that 4 * x = 16, so b[3] = false.
 * For a[4] = 5, we can choose x = 1 because 5 * 1 = 5 and 1 ≤ 1 ≤ 3, so b[4] = true.
 */

public class BondedRatio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {8, 5, 6, 16, 5};
		int l = 1;
		int r = 3;

		/* a: [65, 46, 60, 164, 243, 228, 231, 298, 231, 211]
		l: 20
		r: 50 */
		
		boolean b[] = new BondedRatio().boundedRatio(a, l, r);
		for(boolean flag : b) {
			System.out.print(flag + " ");
		}

	}
	
	boolean[] boundedRatio(int[] a, int l, int r) {
	    int arrLength = a.length;
	    boolean[] b = new boolean[arrLength];
	    int j = 0;
	    for(int i = 0 ; i<arrLength ; i++){
	    	boolean optFlag = false;
	        int x = calcboundedRatio(a[i], i);
	        if((x > 0) && (x >= l && x <= r)){
	            optFlag = true;
	        }
	        b[j] = optFlag;
	        j++;
	    }
	return b;
	}
	
	public int calcboundedRatio(int val, int indx){
	   if(val < 0 || indx < 0) return -1;
	   int x = -1;
	   if(val % (indx + 1) == 0){
	     x = val / (indx + 1);
	    }
	    return x;
	}

}
