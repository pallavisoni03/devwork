package com.pal.stringops;

import java.util.Arrays;
/* https://leetcode.com/problems/valid-anagram/*/
public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anagram";//"rat";//"anagram";
		String t = "nagaram";//"car";//"nagaram";
		
		System.out.println(new ValidAnagram().isAnagram(s, t));
	}
	
	public boolean isAnagram(String s, String t) {
        boolean isTrue = false;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        String sortedS = String.valueOf(sArray);
        String sortedT = String.valueOf(tArray);
        
        if(sortedS.equals(sortedT)) {
        	isTrue = true;
        }
        return isTrue;
    }

}
