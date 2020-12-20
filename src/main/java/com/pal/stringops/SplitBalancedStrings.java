package com.pal.stringops;

public class SplitBalancedStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputStr = "RLRRRLLRLL";//"LLLLRRRR";//"RLLLLRRRLR";//"RLRRLRLLRLRL";
		System.out.println(new SplitBalancedStrings().balancedStringSplit(inputStr));
	}

	public int balancedStringSplit(String s) {
		int charCounter = 0;
		//String tempString = "";
		int outputCounter = 0;
		char[] charArr = s.toCharArray();
		for(char value : charArr) {
			if(value=='R') {
				charCounter++;
			//	tempString = tempString.concat(value+"");
			}
			if(value=='L') {
				charCounter--;
				//tempString = tempString.concat(value+"");
			}
			if(charCounter==0) {
				//System.out.println(tempString+"");
				charCounter = 0;
				//tempString = "";
				outputCounter++;
			}
		}
		return outputCounter;
	}
}
