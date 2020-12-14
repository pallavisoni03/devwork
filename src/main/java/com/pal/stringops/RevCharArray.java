package com.pal.stringops;

public class RevCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char inputArray[] = {'H','a','n','n','a','h'};//{"h","e","l","l","o"};
		System.out.println("-----");
		for(char chars : revInputArray(inputArray)){
			System.out.print("---"+chars);
		}
	}

	private static char[] revInputArray(char inputArray[]){
		int start = 0;
		int end = inputArray.length;
		int mid = end/2;
		end = end-1;
		// reverse and print 
		/*for(int i = end-1 ; i >= 0; i--) {
			System.out.print(inputArray[i] +",");
			System.out.println("-----");
			}*/
		// reverse and put back in same array
		char tempChar = '\0';
		for(int j = start; j<mid; j++){
			tempChar = inputArray[j];
			inputArray[j] = inputArray[end];
			inputArray[end] = tempChar;
			tempChar = '\0';
			end--;
			}
		
		return inputArray;
	}
}
