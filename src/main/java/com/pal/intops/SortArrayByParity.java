package com.pal.intops;
/**
 * 
 * @author asoni
 *
 */
/*https://leetcode.com/problems/sort-array-by-parity/submissions/*/
public class SortArrayByParity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2, 5, 1,2,4};//{0,2,1};////{3,1,2,4};
		//int[] outputArr = new SortArrayByParity().sortArrayByParity(A);
		int[] outputArr = new SortArrayByParity().sortArrayByParity1(A);
		for(int num : outputArr) {
			System.out.print(num+",");
		}
	}
	public int[] sortArrayByParity1(int[] A) {
		int[] outputArr = new int[A.length];
		
		int i=0, j=A.length-1;
		
		while (i<j) {
			while (A[i] % 2 == 0) {
				outputArr[i] = A[i];
				i++;
			}
			while (A[j] % 2 != 0) {
				outputArr[j] = A[j];
				j--;
			}
			
			if (i<j) {
				outputArr[j] = A[i];
				outputArr[i] = A[j];
			}
			i++;
			j--;
		}
		
		return outputArr;
	}
	
	public int[] sortArrayByParity(int[] A) {
		int[] outputArr = new int[A.length];
		int evenCounter = 0;
		int oddCounter = 0;
		for(int number : A) {
			if(number % 2==0){
				evenCounter++;
			}else {
				oddCounter++;
			}
		}
		int i=0;
		int j=evenCounter;
		/*if(evenCounter==0) {
			j=0;
		}*/
		for(int number : A) {
			if(number % 2==0){
				if(evenCounter>0) {
					outputArr[i]=number;
					i++;
				}
			}else {
				if(oddCounter>0) {
					outputArr[j]=number;
					j++;
				}
			}
		}
		
		return outputArr;
    }

}
