package com.pal.fbint;

/*
* https://leetcode.com/problems/reverse-words-in-a-string/
* Given an input string, reverse the string word by word.
*  A word is defined as a sequence of non-space characters.
* The input string does not contain leading or trailing spaces and 
* the words are always separated by a single space.
* For example,
* Given s = "the sky is blue",
* return "blue is sky the".
*/

public class RevString {
	
	public static void main(String[] args) {
		String inputStr = "a good   example";//"  hello world  ";//"the sky is blue";
		
		System.out.println("With String Builder\n");
		String outPutStr1 = new RevString().revString(inputStr);
		System.out.println(outPutStr1);
		System.out.println("\n");
		System.out.println("W/o String Builder\n");
		
		String outPutStr = new RevString().revString2(inputStr);
		System.out.println(outPutStr);
		

	}
	
	public String revString(String inputStr) {
		String[] strArr = inputStr.split(" ");
		int arrLength = strArr.length;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=arrLength-1; i>=0; i--) {
			String arrString = strArr[i].trim();
				if(!arrString.isEmpty()) {
					sb.append(arrString+" ");
				}
		}
		
		return sb.toString().trim();
	}

	
	public String revString2(String inputStr) {
		char[] charArr = inputStr.toCharArray();
		int j=0;
		
		//cleaning whitespaces 
	//	if(Character.isWhitespace(charArr[0])
		for(int i=0; i<=charArr.length-1; i++) {
			if(Character.isWhitespace(charArr[i])){
				revWord(charArr, j, i-1);
				j=i+1;
			}

		}
		
		revWord(charArr, j, charArr.length-1);
		
		revWord(charArr, 0, charArr.length-1);
		
		return String.valueOf(charArr);
	}
	
	public void revWord(char[] charArr , int j, int i) {
		while(j<i) {
			char temp = charArr[j];
			charArr[j] = charArr[i];
			charArr[i] = temp;
			j++;
			i--;
		}
		
	}
}
