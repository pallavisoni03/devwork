package com.pal.intops;

import java.util.HashMap;
import java.util.Map;

public class UniqueOccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputArr[] = {-1,-1,-1,-3,-1,-1};//{-3,0,1,-3,1,1,1,-3,10,0}; //{1,2,2,1,1,3}; //{1,2};//
		System.out.println(checkUniqueOccurrences(inputArr));
	}
	
	private static HashMap <Integer, Integer> countOccurrences(int inputArr[]){
		HashMap <Integer, Integer> mapOfOccurrences = new HashMap<Integer, Integer>();
		 for(int intToCheck:inputArr){
			if(mapOfOccurrences.containsKey(intToCheck)){
				mapOfOccurrences.put(intToCheck, mapOfOccurrences.get(intToCheck)+1);
			}
			else{
				mapOfOccurrences.put(intToCheck, 1);
			}
			intToCheck = 0;
		}
		return mapOfOccurrences;
	}
	
	private static boolean checkUniqueOccurrences(int inputArr[]){
		boolean checkBoolean = true;
		HashMap <Integer, Integer> mapOfOccurrences = countOccurrences(inputArr);
		//System.out.println(mapOfOccurrences.size()+1);
		int ocurrenceCounter[] = new int[mapOfOccurrences.size()+1000];
		//int ccurrenceCounter = 0;
		for (Map.Entry<Integer, Integer> value : mapOfOccurrences.entrySet()){
			int valueToCheck = value.getValue();
			int valueKey = value.getKey();
			System.out.println("counter for "+valueKey+" is---->"+valueToCheck);
			if(mapOfOccurrences.containsValue(valueToCheck))
			{
				ocurrenceCounter[valueToCheck]++;
				//ccurrenceCounter++;
			}
			//System.out.println("ccurrenceCounter-->"+ccurrenceCounter[valueToCheck]);
			if(ocurrenceCounter[valueToCheck]>1){
					checkBoolean = false;
					break;
			}
			
		}
		return checkBoolean;
	}
	
	
	/*private static HashMap <Integer, Integer> countOccurrences(int inputArr[]){
	int arrLen = inputArr.length;
	HashMap <Integer, Integer> mapOfOccurrences = new HashMap<Integer, Integer>();
	//int arrOfOccurrences[] = new int[arrLen];
	int counter = 0;
	int intToCheck = 0;
	 //for(int intToCheck:inputArr){
	for(int i=0;i<arrLen;i++) {
		intToCheck = inputArr[i];
		//System.out.println("intToCheck--->"+intToCheck);
		for (int intToMatch:inputArr){
			//System.out.println("intToMatch--->"+intToMatch);
			if(intToCheck==intToMatch){
				 counter++;
			 }
		}
		if(counter>0 && !mapOfOccurrences.containsKey(intToCheck)){
			mapOfOccurrences.put(intToCheck, counter);
		}
		intToCheck = 0;
		counter = 0;
	}
	System.out.println(mapOfOccurrences);
	return mapOfOccurrences;
	
}
*/
	
}
