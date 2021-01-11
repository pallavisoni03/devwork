package com.pal.stringops;
/* https://leetcode.com/problems/fizz-buzz/ */
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		List<String> outputList = new FizzBuzz().fizzBuzz(n);
		for(String values : outputList) {
			System.out.println(values);
		}
	}

	public List<String> fizzBuzz(int n) {
		List<String> outputList = new ArrayList<String>();
			for(int i=1; i<=n; i++) {
				
				if (i % 3 == 0 && i % 5 == 0) {
					outputList.add("FizzBuzz");
	            } else if (i % 3 == 0) {
	            	outputList.add("Fizz");
	            } else if (i % 5 == 0) {
	            	outputList.add("Buzz");
	            } else {
	            	outputList.add(String.valueOf(i));
	            }
				
			}
			return outputList;
		}
	}
