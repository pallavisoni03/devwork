package com.pal.stringops;

public class JewelsStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String J = "aA", S = "aAAbbbb";
		//String J = "z", S = "ZZ";
		System.out.println(new JewelsStones().numJewelsInStones(J, S));
	}

	public int numJewelsInStones(String J, String S) {
        int count = 0;
        char[] charArr1 = J.toCharArray();
        char[] charArr2 = S.toCharArray();
        	for(char inputChar : charArr1){
        		for(char checkChar : charArr2){
        			if(inputChar==checkChar){
        				count++;
        			}
        		}
        	}
        return count;
    }
}
