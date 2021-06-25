package com.pal.intops;

public class Merge2SortedArrays {

	public static void main(String[] args) {
		int arr1[] = new int[5];
		int arr2[] = new int[5];
		int j=0;
		for(int i=0;i<10;i+=2) {
			//System.out.println(i);
			arr1[j] = i;
			j++;
		}

		int k=0;
		for(int i=1;i<11;i+=2) {
			//System.out.println(i);
			arr2[k] = i;
			k++;
		}
		int len1 = arr1.length;
		int len2 = arr2.length;
		int mergedArr[] = new int[len1+len2];

		mergedArr = new Merge2SortedArrays().mergeSortedArrays(arr1, arr2, len1, len2, mergedArr);

		for(int arrVal : mergedArr){
			System.out.println(arrVal);
		}
	}
	public int[] mergeSortedArrays(int arr1[],int arr2[], int len1, int len2, int mergedArr[]) {

		int i=0, j=0, k=0;
		while(i < len1 && j < len2) {
			if(arr1[i] < arr2[j]) 
				mergedArr[k++] = arr1[i++];
			else
				mergedArr[k++] = arr2[j++];
		}
		while(i < len1) {
			mergedArr[k++] = arr1[i++];
		}
		while(j < len2) {
			mergedArr[k++] = arr2[j++];
		}


		return mergedArr;
	}

}
