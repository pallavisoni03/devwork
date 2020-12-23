package com.pal.intops;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberoFCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candies = {7,2,5,6,9,9,4,5};//{4,2,1,1,2};//{2,3,5,1,3};//{12,1,12};//
		int extraCandies = 3;
		
		List<Boolean> bolList = new GreatestNumberoFCandies().kidsWithCandies(candies, extraCandies);
		for(boolean bolValue : bolList) {
			System.out.print(bolValue+",");
		}
	}
	
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	        List<Boolean> bolList = new ArrayList<Boolean>();
	        int gratest = 0;
	        for(int arrValue : candies) {
	        	if(arrValue>gratest) {
	        		gratest=arrValue;
	        	}
	        }
	        //System.out.println("gratest--->"+gratest);
	        int noTocheck = 0;
	        boolean listValue = false;
	        for(int arrValue : candies) {
	        	noTocheck = arrValue+extraCandies;
		        	if(noTocheck>=gratest) {
		        		//gratest=arrValue;
		        		//System.out.println("noTocheck---->"+noTocheck);
		        		listValue = true;
		        	}
	        	else {
	        		listValue = false;
	        	}
	        	bolList.add(listValue);
	        }
	        return bolList;
	 }
	 
}
