package com.pal.stringops;

public class CheckEqualArrayStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] wordArr1 = {"abc", "d", "defg"};//{"a", "cb"};//{"ab", "c"};
		String[] wordArr2 = {"abcddefg"};//{"ab", "c"};//{"a","bc"};
		System.out.println(arrayStringsAreEqual(wordArr1,wordArr2));
	}
	
	private static  boolean arrayStringsAreEqual(String[] wordArr1, String[] wordArr2) {
		boolean result = false;
		String firstStr = "";//wordArr1.toString();
		for(String arrValue1 : wordArr1){
			firstStr = firstStr+arrValue1;
			
		}
		//System.out.println("----->"+firstStr);
		String secStr = "";//wordArr2.toString();
		for(String arrValue2 : wordArr2){
			secStr = secStr+arrValue2;
		}
		//System.out.println("----->"+secStr);
		if(firstStr.trim().equalsIgnoreCase(secStr.trim())){
			result = true;
			return result;
		}
		
		return result;
	}

}
