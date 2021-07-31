package com.pal.fbint;

import java.util.HashMap;


public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "IV";//"III";
		int opt = new RomanToInteger().romanToInt(s);
		System.out.println(opt);
	}

	public int romanToInt(String s) {
		int sum = 0;

		HashMap<Character, Integer> valMap = new HashMap<Character, Integer>();
		// adding constants 
		valMap.put('I', 1);
		valMap.put('V', 5);
		valMap.put('X', 10);
		valMap.put('L', 50);
		valMap.put('C', 100);
		valMap.put('D', 500);
		valMap.put('M', 1000);

		char[] strArray = s.toCharArray();
		
		int length = strArray.length;
		sum = valMap.get(strArray[length-1]);
		
		for(int i = length-2; i>=0; i--) {
			System.out.println(strArray[i]);
			System.out.println(strArray[i+1]);
			if(valMap.get(strArray[i]) >= valMap.get(strArray[i+1])) {
				sum += valMap.get(strArray[i]);
			}else {
				sum -= 	valMap.get(strArray[i]);
			}
		}
		return sum;	
	}

}
