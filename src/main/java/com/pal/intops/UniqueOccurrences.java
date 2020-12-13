package javaexs.intops;

import java.util.HashMap;
import java.util.Map;

public class UniqueOccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputArr[] =  {-3,0,1,-3,1,1,1,-3,10,0}; //{1,2,2,1,1,3}; //{1,2};//
		System.out.println(checkUniqueOccurrences(inputArr));
	}
	
	
	private static HashMap <Integer, Integer> countOccurrences(int inputArr[]){
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
	
	private static boolean checkUniqueOccurrences(int inputArr[]){
		boolean checkBoolean = true;
		HashMap <Integer, Integer> mapOfOccurrences = countOccurrences(inputArr);
		int ccurrenceCounter[] = new int[mapOfOccurrences.size()+1];
		//int ccurrenceCounter = 0;
		for (Map.Entry<Integer, Integer> value : mapOfOccurrences.entrySet()){
			int valueToCheck = value.getValue();
			int valueKey = value.getKey();
			System.out.println("counter for "+valueKey+" is---->"+valueToCheck);
			if(mapOfOccurrences.containsValue(valueToCheck))
			{
				ccurrenceCounter[valueToCheck]++;
				//ccurrenceCounter++;
			}
			//System.out.println("ccurrenceCounter-->"+ccurrenceCounter[valueToCheck]);
			if(ccurrenceCounter[valueToCheck]>1){
					checkBoolean = false;
					break;
			}
			
		}
		return checkBoolean;
	}
	
	
	/*private static int[] countOccurrences(int inputArr[]){
	int arrLen = inputArr.length;
	int arrOfOccurrences[] = new int[arrLen];
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
		if(counter>0){
			System.out.println("counter for"+intToCheck+" is---->"+counter);
			arrOfOccurrences[i]=counter;
		}
		intToCheck = 0;
		counter = 0;
	}
	   //System.out.println(arrOfOccurrences.length);
		return arrOfOccurrences;
	
}*/

	
}
