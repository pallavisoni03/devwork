package com.pal.intops;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1,1,3};// { 1, 2, 3 };// {1,1,1,1};
		System.out.println(new NumberOfGoodPairs().numIdenticalPairs(nums));
	}

	public int numIdenticalPairs(int[] nums) {
		HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		for (int number : nums) {
			Integer counter = countMap.get(number);
			if (counter == null) {
				countMap.put(number, 1);
			} else {
				counter++;
				countMap.put(number, counter);
			}
		}
		int pairCounter = 0;
		int count = 0;
		for (Map.Entry<Integer, Integer> mapEntry : countMap.entrySet()) {
			count = mapEntry.getValue();
			if (count > 1) {
					count = (count * (count - 1)) / 2;
					pairCounter = pairCounter + count;
			}
			count = 0;
		}
		return pairCounter;
	}
}
