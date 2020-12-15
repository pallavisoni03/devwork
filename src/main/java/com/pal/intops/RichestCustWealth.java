package com.pal.intops;

public class RichestCustWealth {
	public static void main(String[] args) {
		int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};//{{1,5},{7,3},{3,5}};//{{1,2,3},{3,2,1}};
		maximumWealth(accounts);
	}

	private static int maximumWealth(int[][] accounts) {
		int maxValue = 0;
		int custTotal = 0;
		for(int[] values:accounts){
			for(int custValue:values){
				custTotal = custTotal+custValue;
			}
				if(custTotal>=maxValue){
					maxValue = custTotal;
				}
				custTotal=0;
		}
		System.out.println(maxValue);
		return maxValue;
	}
}