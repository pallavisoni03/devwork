package com.pal.intops;


public class CountConsistentStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String allowed = "abc";//"cad";//"cad";//
		String[] words = {"a","b","c","ab","ac","bc","abc"};//{"cc","acd","b","ba","bac","bad","ac","d"};//{"ad","bd","aaab","baa","badab"};//{"cc","acd","b","ba","bac","bad","ac","d"};//{"ad","bd","aaab","baa","badab"};
		System.out.println(new CountConsistentStrings().countConsistentStrings(allowed, words));
	}
	
	public int countConsistentStrings(String allowed, String[] words) {
        int stringsCount = 0;
        char[] allowedArr = allowed.toCharArray(); 
        boolean[] boolArray = getAlphaBoolArray(allowedArr);
            for(String arrSts : words) {
	        	 for(char strChars: arrSts.toCharArray()){
	        		if(boolArray[strChars - 97] == false) {
	        			//not a consistent string
	        			stringsCount++;
	        			break;
	        		}
	        	 }
			}
        stringsCount = words.length-stringsCount;
        return stringsCount;
    }

	public boolean[] getAlphaBoolArray(char[] allowedArr) {
		
		boolean[] boolArray = new boolean[26];
		for (int i=0; i<allowedArr.length; i++) {
			boolArray[allowedArr[i] - 97] = true;
		}
		
		return boolArray;
	}

}
