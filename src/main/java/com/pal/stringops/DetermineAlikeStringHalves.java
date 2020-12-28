package com.pal.stringops;
/*https://leetcode.com/problems/unique-morse-code-words/*/
public class DetermineAlikeStringHalves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AbCdEfGh";//"MerryChristmas";//"textbook";//"book";
		boolean outputFlag = new DetermineAlikeStringHalves().halvesAreAlike(s);
		System.out.println(outputFlag);
	}
	
	public boolean halvesAreAlike(String s) {
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        String fstHalf = s.subSequence(0, s.length()/2).toString();
        String scndHalf = s.subSequence(s.length()/2, s.length()).toString();
        int fstVowCounter = 0;
        int scndVowCounter = 0;
        for(char strChars : fstHalf.toCharArray()) {
        	for(char vowelChar : vowels) {
        		if(strChars==vowelChar) {
        			fstVowCounter++;
        			break;
        		}
        	}
        }
        for(char strChars : scndHalf.toCharArray()) {
        	for(char vowelChar : vowels) {
        		if(strChars==vowelChar) {
        			scndVowCounter++;
        			break;
        		}
        	}
        }
        if(fstVowCounter==scndVowCounter) {
        	return true;
        }else {
        	return false;
        }
    }

}
