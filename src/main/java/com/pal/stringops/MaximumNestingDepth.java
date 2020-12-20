package com.pal.stringops;

public class MaximumNestingDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(1+(2*3)+((8)/4))+1";//"1";//"1+(2*3)/(2-1)";//"(1)+((2))+(((3)))";//
		System.out.println(new MaximumNestingDepth().maxDepth(s));
	}

	 public int maxDepth(String s) {
	     int depth = 0;
	     int endDepth=0;
	     char[] charArr = s.toCharArray();
	     for(char value : charArr) {
	    	 if(value=='(') {
	    		 depth++;
	    		 if(depth>endDepth){
	    			 endDepth=depth;
	    				}	 
	    	 }
	    	 if(value==')') {
	    		 //break;
	    		 //depth = depth-1;
	    		 depth--;
	    	 }
	     }
	     return endDepth;
	 }
}
