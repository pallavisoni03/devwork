package com.pal.stringops;

import java.util.HashMap;
import java.util.Map;

public class UncommonWordsIIn2Sentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String A = "this apple is sweet", B = "this apple is sour";
		String A = "apple apple", B = "banana";
		String[] outputArr = new UncommonWordsIIn2Sentences().uncommonFromSentences(A, B);
		for(String values : outputArr) {
			System.out.println(values+",");
		}
	}
	public String[] uncommonFromSentences(String A, String B) {
		String[] firstArr = A.split("\\s");
        String[] secArr = B.split("\\s"); 
		
		HashMap<String, Integer> wordMap = new HashMap<String, Integer>(); 
		for(String aStrings : firstArr) {
			wordMap.put(aStrings, wordMap.getOrDefault(aStrings, 0)+1);
		}
		for(String bStrings : secArr) {
			wordMap.put(bStrings, wordMap.getOrDefault(bStrings, 0)+1);
		}
		int arrLen=0;
		for(Map.Entry<String, Integer> strings : wordMap.entrySet()) {
			if(strings.getValue()==1) {
				arrLen++;
			}
		}
		int i=0;
		String[] outputArr = new String[arrLen];
		for(Map.Entry<String, Integer> strings : wordMap.entrySet()) {
			if(strings.getValue()==1) {
				outputArr[i] = strings.getKey();
				i++;
			}
		}
		return outputArr;
	}
	/* public String[] uncommonFromSentences(String A, String B) {
		
        String[] firstArr = A.split("\\s");
        String[] secArr = B.split("\\s");
        String[] outputArr = new String[firstArr.length+secArr.length];
        int i = 0;
        for(String aStrings : firstArr) {
        	for(String bStrings : secArr) {
        		if(!aStrings.equalsIgnoreCase(bStrings)) {
        			outputArr[i] = aStrings;
        		}
        	}
        	i++;
        }
        return outputArr;
    }
*/
	
}
