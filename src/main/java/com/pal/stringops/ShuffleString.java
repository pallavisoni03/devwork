package com.pal.stringops;

import java.util.Arrays;

public class ShuffleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};
		System.out.println(new ShuffleString().restoreString(s, indices));
	}

	public String restoreString(String s, int[] indices) {
        String resultStr = "";
        System.out.println(s);
        Arrays.sort(indices);
        String resultString = "";
        for(int value : indices) {
        	resultString = resultString+s.charAt(value);
        	//System.out.println();
        }
        return resultStr;
    }
}
