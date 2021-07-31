package com.pal.fbint;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/*
 * Given a string s, find the length of the longest substring without repeating characters.
 * 
 */

public class LongestSubstring {
	
	public static void main(String[] args) {
		
		String s = "abcabcbb";
				//"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ abcdefghijklmnopqrstuvwxyzABC";
//"pwwkew";
		
		long time1 = System.nanoTime();
		//int opt = new LongestSubstring().lengthOfLongestSubstring(s);
		//System.out.println("My method----->"+opt);
		long time2 = System.nanoTime();
		System.out.println((time2-time1)/1000000);
		
		
		int opt1 = new LongestSubstring().lengthOfLongestSubstring1(s);
		System.out.println("Optimized solution--->"+opt1);
	}
	
	public int lengthOfLongestSubstring(String s) {
		
		int opt = 0;
		if(s == null) return opt;
		if(s.isEmpty()) return opt;
		char[] charArr = s.toCharArray();
		int arrLen = charArr.length;
		HashMap<Integer, String> strMap = new HashMap<Integer, String>();		
		for(int i=0; i<arrLen; i++) {
			for(int j=i+1; j<=arrLen; j++){
				
				String subStr = s.substring(i, j);
				if(checkDuplicate(subStr)){
					strMap.put(subStr.length(), subStr);
				}
			}

		}
		//System.out.println(strMap);
		opt = Collections.max(strMap.keySet());
		return opt;
	}
	
	public boolean checkDuplicate(String str) {
		char[] subStrArr = str.toCharArray();
		HashSet<Character> charSet = new HashSet<Character>();
			for(char c : subStrArr) {
				if(charSet.contains(c)) {
					return false;
				}else {
					charSet.add(c);
				}
			}
		return true;
		}

	 public int lengthOfLongestSubstring1(String s) {
	        Integer[] chars = new Integer[128];

	        int left = 0;
	        int right = 0;

	        int res = 0;
	        while (right < s.length()) {
	            char r = s.charAt(right);

	            Integer index = chars[r];
	            if (index != null && index >= left && index < right) {
	                left = index + 1;
	            }

	            res = Math.max(res, right - left + 1);

	            chars[r] = right;
	            right++;
	        }

	        return res;
	    }
}
