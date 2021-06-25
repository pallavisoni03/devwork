package com.pal.intops;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 12, 1234, 45, 67, 1 };
			
		 arr = new ReverseArray().revArray(arr);
		 for(int arrVal:arr) {
			 
			System.out.println(arrVal); 
		 }
	}

	public int[] revArray(int[] arr) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		return arr;
	}
}
