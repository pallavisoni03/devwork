package com.pal.intops;
/* https://leetcode.com/problems/maximum-69-number/*/
public class Maximum69Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 9996;//9669;
		System.out.println(new Maximum69Number().maximum69Number(num));
	}
	
	public int maximum69Number (int num){ 
		int output = 0;  
		output = num;
		String intString = String.valueOf(num);
		char[] intCharArray = intString.toCharArray();
		//for(char digit : intCharArray) {
		for(int i=0; i<intCharArray.length; i++) {
			if(intCharArray[i]=='6'){
				intCharArray[i] = '9';  
				Integer newNum = Integer.valueOf(String.valueOf(intCharArray));
	             if(output < (int)newNum){
	            	 output=(int)newNum;
	             }
	             intCharArray[i] = '6';
			}
            
		}
		
		return output;
		
	}
	
	/*
	 * public int maximum69Number (int num) { int output = 0; int[] digitArray =
	 * numLenth(num); int arrLen = digitArray.length; int[] retArray = new
	 * int[arrLen]; int number = 0; while(arrLen>=0) { for(int digit : digitArray) {
	 * if(digit==9) { digit = 6; } if(digit==6) { digit = 9; }
	 * 
	 * number *= 10; number += digit; System.out.println(number); } arrLen--; }
	 * return output; }
	 */
	
	

	/*
	 * public int maximum69Number (int num) { int output = 0; int[] numbers = new
	 * int[numLenth(num)]; int newNum = 0; int digit = 0; while(num!=0) { digit =
	 * num%10; if(digit==9) { digit = 6; }if(digit==6) { digit = 9; } num = num/10;
	 * newNum =
	 * 
	 * } return output;
	 * 
	 * }
	 */
	public int[] numLenth(int num) {
		int newNum = num;
		int intLength = 0;
		while(newNum!=0) {
			newNum = newNum/10;
			intLength++;
		}
		newNum = num;
		int[] digitArray = new int[intLength];
		int intForArray = 0;
		//while(num!=0) {
		for(int i=digitArray.length-1; i>=0; i--) {
			intForArray = newNum%10;
			digitArray[i] = intForArray;
			newNum = newNum/10;
			//}
		}
		return digitArray;
	}

}
