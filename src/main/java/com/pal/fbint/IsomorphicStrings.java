package com.pal.fbint;

import java.util.HashMap;

/*
 * https://leetcode.com/problems/isomorphic-strings/
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while 
 * preserving the order of characters. No two characters may map to the same 
 * character, but a character may map to itself.
 */
public class IsomorphicStrings {
	
	public static void main(String[] args) {
		
		String s = "paper", t = "title";// s = "foo", t = "bar";//s = "egg", t = "add";
		boolean output = new IsomorphicStrings().isIsomorphic(s, t);
		System.out.println(output);
	}
	
	 public boolean isIsomorphic(String s, String t) {
	     
		 if(s.length()!=t.length()) {
			 return false;
		 }
		 
		 char[] sChArr = s.toCharArray();
		 char[] tChArr = t.toCharArray();
		 
		 HashMap<Character, Character> charMap = new HashMap<Character, Character>();
		 HashMap<Character, Character> charMap1 = new HashMap<Character, Character>();
		 
		 for(int i=0; i<sChArr.length; i++) {	 
			 char a = sChArr[i];
			 char b = tChArr[i];
			
			 if(charMap.containsKey(a) || charMap1.containsKey(b)) {
				 if(charMap.get(a)==null || charMap.get(a)!=b) {
					return false;
				 }
			
			 }else {
				 charMap.put(a, b);
				 charMap1.put(b, a);
			 }
		 }
		 return true;
	    }

}
