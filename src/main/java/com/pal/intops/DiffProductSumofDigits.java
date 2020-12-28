package com.pal.intops;
/*https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer*/

public class DiffProductSumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n = 114;//4421;//234;
			System.out.println(new DiffProductSumofDigits().subtractProductAndSum(n));
	}

	public int subtractProductAndSum(int n) {
        int output = 0;
        int sumOfDigits = 0;
        int prodOfDigits = 1;
        while (n != 0) {
        	int digit = n%10;
			 n = n/10;
			 	sumOfDigits+=digit;
			 	prodOfDigits *= digit;
		 }
        output = prodOfDigits-sumOfDigits;
        return output;
    }

}
