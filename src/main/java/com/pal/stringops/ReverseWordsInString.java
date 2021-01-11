package com.pal.stringops;
/* https://leetcode.com/problems/reverse-words-in-a-string-iii/ */
public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputStr = "Let's take LeetCode contest";
		String outputStr = new ReverseWordsInString().reverseWords(inputStr);
		System.out.println(outputStr);
	}
	
/*	public String reverseWords(String s) {
		String outputStr = "";
		String[] inputArr = s.split("\\s");
		for(String words : inputArr) {
			char[] wordArr = words.toCharArray();
			String revWord = "";
			for(int i=wordArr.length-1; i>=0; i--) {
				revWord =  revWord+wordArr[i];
			}
			outputStr =  outputStr+" "+revWord;
		}
		return outputStr.trim();       
	}
	*/
	
public String reverseWords(String s) {
        
        char[] c = s.toCharArray();
        int start = 0, end = 0;
        for(; end < c.length; end++){
            if(c[end] == ' '){
                reverse(c, start, end-1);
                start = end+1;
            }
        }
        reverse(c, start, end-1);
        return new String(c);
    }
    
    private void reverse(char[] c, int start, int end){
        while(start < end){
            char tmp = c[end];
            c[end] = c[start];
            c[start] = tmp;
            start++;
            end--;
        }
    }
    
}

