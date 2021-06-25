package com.pal.intops;

import java.util.Arrays;

public class FindMinValueArray {
	
	public static void main(String args[]) {
		
		int arr[] = { 12, 1234, 45, 67, 1 };
		int len = arr.length;
		
		
		int minNum = new FindMinValueArray().getMin(arr, len);
		System.out.println("Minimum number is -->"+ minNum);
		
		int maxNum = new FindMinValueArray().getMax(arr, len);
		System.out.println("Maximum number is -->"+ maxNum);
		
		int sum = new FindMinValueArray().runningSumArr(arr);
		System.out.println("Sum is -->"+ sum);
		
	}
	
	public int getMin(int arr[], int len) {
		int minNum = arr[0];
		
		System.out.println(len);
		for(int i=1; i<len; i++) {
			
			minNum = Math.min(minNum, arr[i]);
			//System.out.println("Minimum number is -->"+ minNum);
			
		}
		
		return minNum;
		
		
	}
	
	public int getMax(int arr[], int len) {
		int maxNum = arr[0];
		
		System.out.println(len);
		for(int i=1; i<len; i++) {
			
			maxNum = Math.max(maxNum, arr[i]);
			//System.out.println("Minimum number is -->"+ maxNum);
			
		}
		
		return maxNum;
		
		
	}
	
	public int runningSumArr(int arr[]) {
		int sum = 0;
		int fstValue = arr[0];
		for(int i=0; i < arr.length; i++) {
			if(i==0) {
				sum = fstValue;
			}else {
				sum = sum + arr[i];
			}
		}
		return sum;
		}

}
