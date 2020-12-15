package com.pal.intops;

public class runningSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrNums[] = {3,1,2,10,1};//{1,1,1,1,1};//{1,2,3,4};
		int arrSums[] = calcRunningSum(arrNums);
		for(int sums:arrSums){
			System.out.print(sums+" ");
		}
	}
	
	private static int[] calcRunningSum(int arrNums[]){
		int arrLen = arrNums.length;
		int arrSums[] = new int[arrLen];
		//summing 
		int firstVal = arrNums[0];
		int sumTemp = firstVal;
			for(int i=0;i<arrLen; i++){
				if(i==0){ 
					arrSums[i] = firstVal;
				}else{
					sumTemp = sumTemp+arrNums[i];
					arrSums[i] = sumTemp;
				}
			}
		return arrSums;
	}
	

}


