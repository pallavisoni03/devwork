package com.pal.stringops;

public class ChangeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//change the case to lower case
		String inputStr = "LOVELY"; //"Hello"; //"here" "LOVELY"
		System.out.println("To lower case--->"+changeStrCase(inputStr));
	}
		
	private static String changeStrCase(String inputStr){
		inputStr = inputStr.toLowerCase();
		return inputStr;
	}
}
