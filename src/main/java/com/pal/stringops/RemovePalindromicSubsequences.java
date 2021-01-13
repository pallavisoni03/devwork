package com.pal.stringops;
/* https://leetcode.com/problems/remove-palindromic-subsequences/submissions/ */
public class RemovePalindromicSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ababa";//"baabb";
		int outputInt = new RemovePalindromicSubsequences().removePalindromeSub(s);
		System.out.println(outputInt);
	}
	
	public int removePalindromeSub(String s) {
        int outputInt = 0;
        if(s.length() == 0) { outputInt =  0;}
        else if(checkPalindrome(s)) { outputInt = 1;}
        else { outputInt = 2;}
        return outputInt;
    }
	
	
	static boolean checkPalindrome(String str) 
    { 
        int i = 0, j = str.length() - 1; 
        while (i < j) { 
            if (str.charAt(i) != str.charAt(j)) {
                return false; 
            }
            i++; 
            j--; 
        } 
        return true; 
    } 

}
