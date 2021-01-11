package com.pal.stringops;
/* https://leetcode.com/problems/goat-latin/ */
public class GoatLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inoutStr = "I speak Goat Latin";
		System.out.println(new GoatLatin().toGoatLatin(inoutStr));
	}
	
	public String toGoatLatin(String S) {
		String outputStr = "";
		String[] stringArr = S.split("\\s");
		int index  = 0;
		for(String words : stringArr) {
			//count ++;
			int count  = 0;
			int wordLen = words.length();
			index++;
			char[] outputCharArr = new char[wordLen + 3 + index];
			char[] wordArr = words.toCharArray();
				if(wordArr[0]=='a' || wordArr[0]=='e' || wordArr[0]=='i' || wordArr[0]=='o' || wordArr[0]=='u' || wordArr[0]=='A' || wordArr[0]=='E' || wordArr[0]=='I' || wordArr[0]=='O' || wordArr[0]=='U') {
				//if(i==0 && (chars =='a' || chars =='e' || chars=='i' || chars=='o' || chars=='u' || chars=='A' || chars=='E' || chars=='I' || chars=='O' || chars=='U')) {
					int i;
					for(i=0; i<wordArr.length; i++) {
					outputCharArr[i] = wordArr[i];
					}
					outputCharArr[i] = 'm';
					outputCharArr[i+1] = 'a';
					count = i+2;
				}else {
					int i;
					char temp = wordArr[0];
					for(i=0; i<wordArr.length-1; i++) {
						outputCharArr[i] = wordArr[i+1];
					}
					outputCharArr[i] = temp;
					outputCharArr[i+1] = 'm';
					outputCharArr[i+2] = 'a';
					count = i+3;
				}
	
			while(count<outputCharArr.length-1) {
				outputCharArr[count] = 'a';
				count++;
			}
			outputCharArr[count] = ' ';
			outputStr = outputStr + String.valueOf(outputCharArr);
		}
		return outputStr.trim();
	}
}
