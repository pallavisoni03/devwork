package com.pal.intops;
/* https://leetcode.com/problems/find-lucky-integer-in-an-array/ */
import java.util.HashMap;
import java.util.Map;

public class FindArrayLuckyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,7,7,7,7,7,7};//{5};//{2,2,2,3,3};//{1,2,2,3,3,3};//{2,2,3,4};
		FindArrayLuckyInteger findArrayLuckyInteger = new FindArrayLuckyInteger();
		int outputInt = findArrayLuckyInteger.findLucky(arr);
		System.out.println(outputInt);
	}
	
	 /*public int findLucky(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
       for(int value : arr) {
        	Integer counter = freqMap.get(value);
			if (counter == null) {
				freqMap.put(value, 1);
			} else {
				counter++;
				freqMap.put(value, counter);
			}
        }
        int outputInt = -1;
        for(Map.Entry<Integer, Integer> values : freqMap.entrySet()) {
        	int number = values.getKey();
        	int freq = values.getValue();
        	if(number==freq) {
        		if(number>outputInt) {}
        		outputInt = number;
        	}
        }
        return outputInt;
    }*/
        
        public int findLucky(int[] arr) {
            int res = -1;
            
            if (arr == null || arr.length == 0)
                return res;
            
            int[] store = new int[500+1]; // if we read the Constraints, the max length is 500
            
            for (int i = 0; i < arr.length; i++) {
                store[arr[i]]++; // increment each elements in the store arr
            }
            
            for (int i = store.length - 1; i >= 1; i--) { // iterate from the end
                if (store[i] == i) // find the max element from the end, which equals condtions of the lucky integer
                    return store[i];
            }
            
            return res;
        }

}
