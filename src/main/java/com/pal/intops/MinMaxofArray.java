package com.pal.intops;
/* https://www.geeksforgeeks.org/program-find-minimum-maximum-element-array/ */
public class MinMaxofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 12, 1234, 45, 67, 1 };
		 int n = arr.length;
		 
		 System.out.println(new MinMaxofArray().getMax(arr));
		 System.out.println(new MinMaxofArray().getMin(arr));
		 System.out.println(new MinMaxofArray().getMinRec(arr, n, 0));
		 System.out.println(new MinMaxofArray().getMaxRec(arr, n, 0));
	}

	public int getMin(int[] arr) {
		int minValue = arr[0];
		
		for(int arrValue : arr) {
			minValue = Math.min(minValue, arrValue);
		
		}
		return minValue;
		
	}
	
	
	public int getMinRec(int[] arr, int n, int i) {
		int minValue = arr[0];
		
			if(n==1) {
				minValue = arr[i];
			}else {
				minValue =  Math.min(arr[i],getMinRec(arr, --n, ++i));
				//System.out.println(arr[i]+"----"+i+"----"+n);
			}
		
		
		return minValue;
		
	}
	
	public int getMaxRec(int[] arr, int n, int i) {
		int maxValue = arr[0];
		
			if(n==1) {
				maxValue = arr[i];
			}else {
				maxValue =  Math.max(arr[i],getMaxRec(arr, --n, ++i));
				//System.out.println(arr[i]+"----"+i+"----"+n);
			}
		
		
		return maxValue;
		
	}
	
	public int getMax(int[] arr) {
		int maxValue = arr[0];
		
		for(int arrValue : arr) {
			maxValue = Math.max(maxValue, arrValue);
		}
		return maxValue;
		
	}
}
