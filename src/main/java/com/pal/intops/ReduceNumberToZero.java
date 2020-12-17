package com.pal.intops;

public class ReduceNumberToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 14;//123;//8;//
		System.out.println(numberOfSteps(num));
	}
	 public static int numberOfSteps (int num) {
	    int steps = 0;
	    	if(num == 0) { steps =0;}
	    	if(num ==1) { steps =1;}
	    	int reducingNum = num;
	    		for(int i=1;i<=num;i++){  
	    			if(reducingNum%2!=0){
	    				reducingNum = reducingNum-1;
	    				steps++;
	    			}else{
	    				reducingNum = reducingNum/2;
	    				steps++;
	    			}
	    			if(reducingNum==0){ break; }
	    		}
	    	 return steps;
	 }
}
