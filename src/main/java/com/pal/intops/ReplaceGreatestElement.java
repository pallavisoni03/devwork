package com.pal.intops;
/* https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/*/
public class ReplaceGreatestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {17,18,5,4,6,1};
		new ReplaceGreatestElement().replaceElements(arr);
		for(int value : arr) {
			System.out.print(value+",");
		}
	}
	
	public int[] replaceElements(int[] arr) {
	    
	     int max = arr[arr.length - 1];
	        arr[arr.length - 1] = -1;
	        for (int i = arr.length - 2; i >= 0; i--){
	            int val = arr[i];
	            arr[i] = max;
	            max = Math.max(max, val);
	        }
	        return arr;
	    }

}
