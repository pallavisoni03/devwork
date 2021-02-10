package com.pal.datastructures;

public class GenerateSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = {1,4,2,5,3};
		new  GenerateSubarrays().printSubArrays(intArr, 0, 0);
	}
	
	public void printSubArrays(int[] intArr, int start, int end) {
	if(end == intArr.length) {
			return;
		}
		else if(start>end) {
			printSubArrays(intArr, 0, end+1);
		}else {
			for(int i=start; i<end; i++) {
				System.out.println(end);
				System.out.print(intArr[i]+",");
			}
			System.out.println("\n-----------------");
			printSubArrays(intArr, start+1, end);
		}
		return;	   
	}

}
