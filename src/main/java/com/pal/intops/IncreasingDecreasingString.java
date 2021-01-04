package com.pal.intops;

import java.util.HashMap;
import java.util.Map;

/* https://leetcode.com/problems/increasing-decreasing-string/ */
public class IncreasingDecreasingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = "spo";//"ggggggg";//"leetcode";//"rat";//"aaaabbbbcccc";
			System.out.println(new IncreasingDecreasingString().sortString(s));
	}
	
	 public String sortString(String s) {
	     String output = "";
	     StringBuffer strOutput = new StringBuffer();
	     int strLength = s.length();
	     int[] array = new int[26];
	     for(int i = 0; i < s.length(); i++){
	         array[s.charAt(i) - 97]++;
	         
	     }
	     while(strLength>0) {
	     for(int i = 0; i < array.length; i++){
	            if(array[i] > 0){
	            	//output = output.concat((char)(i + 97)+"");
	            	strOutput.append((char)(i + 97));
	                array[i]--;
	            }
	        }
	        
	        for(int i = array.length - 1; i >= 0; i--){
	            if(array[i] > 0){
	            	//output = output.concat((char)(i + 97)+"");
	            	strOutput.append((char)(i + 97));
	                array[i]--;
	            }
	        }
	        strLength--;
	    }
	     output = strOutput.toString();
	     return output;
	 }
	     
}
