package com.pal.intops;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   int numberTill = 2;//2;
	 if(numberTill > 0){
		System.out.println("Fibonacci series from recursion--->");	
		if(numberTill == 1 ){
			System.out.print("1 ");
		}
		if (numberTill == 2){
		    System.out.print("1 1 ");
		}else{
			System.out.print("1 1 ");
			for(int i=3; i<=numberTill;i++){
				System.out.print(genTheNumRecu(i)+" ");
			}
		}//else
			System.out.println(" ");	
		System.out.println("Fibonacci series from regular method--->");
			for(int nums: genTheNum(numberTill)){
			System.out.print(nums+" ");
			}
		}else{
			System.out.println("0");
		}
	}

	// recursion method
	private static int genTheNumRecu(int numberTill){
		if(numberTill == 0){
			return 0;
		}
		if(numberTill == 1 || numberTill == 2){
				return 1;
			}
		return genTheNumRecu(numberTill-1) + genTheNumRecu(numberTill-2);	
	
	}

	// regular method
	private static int[] genTheNum(int numberTill){
		int feboArr[] = new int[numberTill];
		int feboNum = 1, num1 =1 , num2 = 1;
		if(numberTill == 1){
			feboArr[0] = 1;
			return feboArr;
		}
		if(numberTill == 2){
			feboArr[0] = 1;
			feboArr[1] = 1;
			return feboArr;
		}
		else{
			feboArr[0] = 1;
			feboArr[1] = 1;
			for(int i=2; i<numberTill;i++){
				feboNum = num1 + num2;
				feboArr[i] = feboNum;
				num1=num2;
				num2=feboNum;
			}
			return feboArr;

		}

	}

}
