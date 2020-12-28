package com.pal.stringops;

import java.util.ArrayList;
import java.util.List;

/* https://leetcode.com/problems/design-an-ordered-stream/*/

public class OrderedStream {

	private static int n;
	private String[] values;
	int checkInt = 0;
	public OrderedStream(int n) {
        this.n = n;
        this.values = new String[n];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] inputStrAarray = {"ccccc","aaaaa","bbbbb","eeeee","ddddd"};
		int[] inputIntAarray = {3, 1, 2, 5, 4};
		n = 5;
		//System.out.println(n);
		//String[][] input = { {"3", "ccccc"}, {3, ""}};
		
		
		OrderedStream obj = new OrderedStream(n);
		List<String> param_1 = null;
		
		for(int i=0; i<inputStrAarray.length; i++) {
			param_1 = obj.insert(inputIntAarray[i],inputStrAarray[i]);
			//System.out.println(i);
			for(String strings : param_1){
			System.out.println(strings);
			}
		}
	}
	
	
    public List<String> insert(int id, String value) {
    	values[id] = value;
    	List<String> returnAL = new ArrayList<>();
		//System.out.println(id+"---"+value);
		checkInt = id;
		while(true){ 
			if(values[checkInt] == null) {
				break; 
			}
			checkInt++;
			returnAL.add(values[checkInt]); 
		}
		return returnAL;
    	
    }

}


