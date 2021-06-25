package com.pal.intops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Find2NumsAddTon {
	
	public static void main(String args[]) {
		
		int[] arr = {3,5,1,8};
		int n = 4;
		 
		new Find2NumsAddTon().findSum(arr,  n);
		
	}

	public void findSum(int[] arr, int n) {
	
	  HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();
	  //int arrVal = 0;
	  for (int arrVal : arr) {
		int valToChaeck = n - arrVal;
		//System.out.println(valToChaeck);
		 if(numMap.containsValue(valToChaeck)) {
			 System.out.println(valToChaeck+"---");
			 System.out.println(arrVal+"----");
		  }
		 numMap.put(valToChaeck, arrVal);	  
		
		 for(Map.Entry<Integer, Integer> mapVal : numMap.entrySet()) 
		 {
			int num =  mapVal.getValue();
			System.out.println(num);
		 }
	  } 
	  
		
	/*	
		HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for (int arrVal : arr) {
            int temp = n - arrVal;
 
            // checking for condition
            if (numMap.containsValue(temp)) {
                System.out.println(arrVal+"----"+temp+"");
            }
            numMap.put(temp,arrVal);
            for(Map.Entry<Integer, Integer> mapEntry : numMap.entrySet()) {
            	System.out.println(mapEntry.getValue());
            }
            }
            */
        }
	}

