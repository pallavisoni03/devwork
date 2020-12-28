package com.pal.stringops;
/* https://leetcode.com/problems/unique-morse-code-words/ */
import java.util.HashSet;
import java.util.Iterator;

public class UniqueMorseCodeWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"gin", "zen", "gig", "msg"};
		int output = new UniqueMorseCodeWords().uniqueMorseRepresentations(words);
		System.out.println(output);
	}
	
	private static final String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	
	 public int uniqueMorseRepresentations(String[] words) {
	         
	     int outputInt = 0;
	     HashSet<String> uniqueSet = new HashSet<String>();
	     int moreCodeLen = 0; 
	     char[] morseStringChars = null;
	     for(String word : words) {
	    	 char[] charArray = word.toCharArray();
	    	 for(char chars : charArray) {
	    		 moreCodeLen += morseCode[chars - 97].length();
		     }
	    	 
	    	 morseStringChars = new char[moreCodeLen];
	    	 int i = 0;
	    	 for(char chars : charArray) {
	    		for(char tempChars : morseCode[chars - 97].toCharArray()) {
	    			morseStringChars[i] = tempChars;
	    			i++;
	    		}
	    		
			  }
	    	 uniqueSet.add(String.valueOf(morseStringChars));
	    	 moreCodeLen = 0;
	     }
	     
			outputInt = uniqueSet.size();
		    return outputInt;
		  }
		 
	 
	/*
	 * public int uniqueMorseRepresentations(String[] words) { String[] morseCode =
	 * {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
	 * "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-",
	 * "-.--","--.."}; int outputInt = 0; HashSet<String> uniqueSet = new
	 * HashSet<String>(); String tempString = ""; for(String word : words) { char[]
	 * charArray = word.toCharArray(); for(char chars : charArray) { tempString =
	 * tempString.concat(morseCode[chars - 97]); } uniqueSet.add(tempString);
	 * tempString = ""; }
	 * 
	 * outputInt = uniqueSet.size(); return outputInt; }
	 */
}
