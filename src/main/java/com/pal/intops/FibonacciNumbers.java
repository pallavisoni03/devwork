package com.pal.intops;

public class FibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberToTest = 4;//2;
		int numberTill = 10;
		System.out.println(genTheFeboNum(numberTill, numberToTest));
	}

	private static int genTheFeboNum(int numberTill, int numberToTest){
		int feboArr[] = new int[numberTill];
		int feboNum = 1, num1 =1 , num2 = 1;
		int feboNumToRet = 0;

		if(numberToTest==0){
			return feboNumToRet = 0;
		}
		if(numberToTest==1){
			return feboNumToRet = 1;
		}

		if(numberTill == 1){
			feboArr[0] = 1;
		}
		if(numberTill == 2){
			feboArr[0] = 1;
			feboArr[1] = 1;
		}
		else{
			feboArr[0] = 1;
			feboArr[1] = 1;
			for(int i=2; i<numberTill;i++){
				feboNum = num1 + num2;
				if(i==(numberToTest-1)){
					feboNumToRet = feboNum; 
					break;
			    }
				feboArr[i] = feboNum;
				num1=num2;
				num2=feboNum;
				
				/*for(int nums: feboArr){
				System.out.print(nums+" ");
			}
			if(feboArr.length>0){
				feboNumToRet = feboArr[numberToTest-1];
				return feboNumToRet;
			}else{ feboNumToRet = 0;}*/
		 }
		}
		return feboNumToRet;
	}

}
