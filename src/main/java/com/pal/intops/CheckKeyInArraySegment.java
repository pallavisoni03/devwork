package com.pal.intops;

import java.util.HashMap;

/*
 * https://www.geeksforgeeks.org/check-if-a-key-is-present-in-every-segment-of-size-k-in-an-array/
 * Input : 
arr[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3} 
x = 3 
k = 3 
Output : Yes 
There are 4 non-overlapping segments of size k in the array, {3, 5, 2}, {4, 9, 3}, {1, 7, 3} and {11, 12, 3}. 3 is present all segments.
Input : 
arr[] = { 21, 23, 56, 65, 34, 54, 76, 32, 23, 45, 21, 23, 25} 
x = 23 
k = 5 
Output :Yes 
There are three segments and last segment is not full {21, 23, 56, 65, 34}, {54, 76, 32, 23, 45} and {21, 23, 25}. 
23 is present all window.
Input :arr[] = { 5, 8, 7, 12, 14, 3, 9} 
x = 8 
k = 2 
Output : No
 * */

public class CheckKeyInArraySegment {
	public static void main(String args[]) {
		
		int arr[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3};
		int x = 3; 
		int k = 3; 
		
		System.out.println(new CheckKeyInArraySegment().checkIntInSegment(arr, x, k) );
		
	}
	
	public boolean checkIntInSegment(int[] arr, int x, int k) {
		
		boolean output = false;
		HashMap<Integer, Boolean> segHash = new HashMap<Integer, Boolean>();
		
		
		int keyInt = 0;
		for(int i=0; i<arr.length; i++) {
			int segCounter = 0; 
			while(segCounter<=x) {
				System.out.println(segCounter);
				if(arr[i]==k) {
					segHash.put(keyInt, true);
					break;
				}else {
					segHash.putIfAbsent(keyInt, false);
				}
				segCounter++;
			}
			
			keyInt++;
		}
			System.out.println(segHash);
		return output; 
		
	}

}
