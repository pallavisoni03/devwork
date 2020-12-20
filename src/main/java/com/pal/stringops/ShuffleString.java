package com.pal.stringops;

import java.util.Arrays;

public class ShuffleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "codeleet";//"aiohn";//"codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};//{3,1,4,2,0};//{4,5,6,7,0,2,1,3};
		System.out.println(new ShuffleString().restoreString(s, indices));
	}

	public String restoreString(String s, int[] indices) {
        //System.out.println(indices.length);
        String resultString = "";
        char[] resultChrArr = new char[indices.length];
        int i=0;
        for(int value : indices) {
        	char resChar = s.charAt(i);
        	resultChrArr[value]=resChar;
        	i++;
        }
       /*for(char valueChr : resultChrArr) {
    	   resultString=resultString+valueChr;
       }*/
        resultString = String.valueOf(resultChrArr);
        return resultString;
    }
}
