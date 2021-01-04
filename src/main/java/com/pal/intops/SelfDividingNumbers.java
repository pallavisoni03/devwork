package com.pal.intops;

import java.util.ArrayList;
/* https://leetcode.com/problems/self-dividing-numbers/ */
import java.util.List;

public class SelfDividingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int left = 2, right = 22;//10;
		List<Integer> output = new SelfDividingNumbers().selfDividingNumbers(left, right);
		System.out.println(output.size());
		for (int value : output) {
			System.out.println(value);
		}
	}

	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> output = new ArrayList<Integer>();
		int counter = 0;
		int digitCounter = 0;
		boolean breakFlag = false;
		while (left <= right) {
			int noToCheck = left;
			while (noToCheck != 0) {
				int digit = noToCheck % 10;
				if (digit == 0) {
					breakFlag = true;
					break;
				}
				if (left % digit == 0) {
					counter++;
				}
				noToCheck /= 10;
				digitCounter++;
			}
			if ((counter == digitCounter) && !breakFlag) {
				output.add(left);
			}
			digitCounter = 0;
			counter = 0;
			breakFlag = false;
			left++;
		}
		return output;
	}

}
