package com.pal.stringops;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"blue","green","bu"};//{"mass","as","hero","superhero"};//{"blue","green","bu"};//{"leetcode","et","code"};//{"mass","as","hero","superhero"};
		List<String> outputList = new StringMatchingInArray().stringMatching1(words);
		for(String word : outputList) {
			System.out.println(word);
		}
	}
	
	public List<String> stringMatching(String[] words) {
		List<String> outputList = new ArrayList<String>();
		for(int i=0; i<words.length; i++) {
			String word = words[i];
			for(int j=0; j<words.length; j++) {
				if (i != j) {
				String strToMatch = words[j];
				if(word.contains(strToMatch) && !outputList.contains(strToMatch)) {
					outputList.add(strToMatch);
					}
				}
				
			}
		}
		
		return outputList;
        
    }
	
	public List<String> stringMatching1(String[] words) {
		List<String> outputList = new ArrayList<String>();
		//int i=0;
		for(String word : words) {
			for(String strToMatch : words) {
				if(!word.equalsIgnoreCase(strToMatch)) {
				if(word.contains(strToMatch) && !outputList.contains(strToMatch)) {
					outputList.add(strToMatch);
				}
				
				/*if(strToMatch.contains(word) && !outputList.contains(word)) {
					outputList.add(word);
					}*/
				}
				//i++;
			}
		}
		
		return outputList;
        
    }
}


