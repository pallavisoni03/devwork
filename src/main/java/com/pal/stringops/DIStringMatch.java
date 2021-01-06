package com.pal.stringops;
/* https://leetcode.com/problems/di-string-match/ */
public class DIStringMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "DDI";//"III";//"IDID";
		int[] outputArr = new DIStringMatch().diStringMatch(input);
		for(int value : outputArr) {
			System.out.print(value+",");
		}
		
	}
	
	public int[] diStringMatch(String S) {
		
        int strLen = S.length();
        char[] charArray = S.toCharArray();
        int[] outputArr = new int[strLen+1];
        
        int countD = strLen;
        int countI = 0;
        int i=0;
        for(char strChar :  charArray){
            if(charArray[i] == 'D'){
            	outputArr[i] = countD;
            	countD--;
                
            }else if(charArray[i] == 'I'){
            	outputArr[i] = countI;
            	countI++;
            }
            i++;
        }
        if(charArray[strLen-1] == 'D'){
        	outputArr[strLen] = countD;
        	countD--;
            
        }else if(charArray[strLen-1] == 'I'){
        	outputArr[strLen] = countI;
        	countI++;
        }
        
        return outputArr;
    }

}
