package com.pal.stringops;

import java.util.HashMap;

/* https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/ */
public class DecryptAlphabetInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "10#11#12";//"12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#";//"25#";//"10#11#12";//"1326#";//"10#11#12";
		System.out.println(new DecryptAlphabetInteger().freqAlphabets(s));
	}
	
	public String freqAlphabets(String s) {
        String outputStr = "";
        StringBuilder outputSB = new StringBuilder(); 
        for(int i=s.length()-1; i>=0;) {
        	if(s.charAt(i)=='#') {
        		outputSB.append(getAlpha(s,i));
        		i -=3;
        	}else {
				outputSB.append(Character.toChars((char)(s.charAt(i) -'0' + 96)));// not sure how it works 
        		i--;
        	}

        }
        outputStr = outputSB.reverse().toString(); 
        return outputStr;
    }
	
	public char getAlpha(String s, int i){
		int alpha = Integer.parseInt (s.substring(i-2, i)) + 96;
		return (char)alpha;
	}

	public HashMap<String, Character> getCharMap(){
		HashMap<String, Character> charMap = new HashMap<String, Character>(26);
		for(int i = 0; i < 26; i++){
			if((char)(97 + i)<'j')
				charMap.put(String.valueOf(i+1), (char)(97 + i));
			else
				charMap.put(String.valueOf(i+1)+"#", (char)(97 + i));
		}
		
		return charMap;
		
	}
	
}
