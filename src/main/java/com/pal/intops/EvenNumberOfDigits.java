package com.pal.intops;

public class EvenNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {555,901,482,1771};//{12,345,2,6,7896};
		System.out.println(new EvenNumberOfDigits().findNumbers(nums));
	}
	
	public int findNumbers(int[] nums) {
        int digitCounter = 0;
        int noOfDigit = 0;
        for(int number : nums) {
        	noOfDigit = countDigitsOfInt(number);
        	if(noOfDigit % 2==0) {
        		digitCounter++;
        	}
        }
        return digitCounter;
       }
		
	public int countDigitsOfInt(int number){
		int noOfDigit = 0;
		 while (number != 0) {
			 number = number/10;
		      noOfDigit++;
		    }

		return noOfDigit;
	}

}
