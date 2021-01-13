package com.pal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.pal.intops.ArrayXOROperation;
import com.pal.intops.ConvertLLBinaryNumber;
import com.pal.intops.CountConsistentStrings;
import com.pal.intops.CreateTargetArray;
import com.pal.intops.DecompressEncodedList;
import com.pal.intops.DesignParkingSystem;
import com.pal.intops.DiffProductSumofDigits;
import com.pal.intops.EvenNumberOfDigits;
import com.pal.intops.FindArrayLuckyInteger;
import com.pal.intops.GreatestNumberoFCandies;
import com.pal.intops.HammingDistance;
import com.pal.intops.IncreasingDecreasingString;
import com.pal.intops.Maximum69Number;
import com.pal.intops.MissingNumber;
import com.pal.intops.NumberOfGoodPairs;
import com.pal.intops.ReduceNumberToZero;
import com.pal.intops.ReplaceGreatestElement;
import com.pal.intops.SelfDividingNumbers;
import com.pal.intops.SortArrayByParity;
import com.pal.intops.SquaresofSortedArray;
import com.pal.stringops.ChangeCase;
import com.pal.stringops.DIStringMatch;
import com.pal.stringops.DetermineAlikeStringHalves;
import com.pal.stringops.FindPrefixInSentence;
import com.pal.stringops.FizzBuzz;
import com.pal.stringops.MaximumNestingDepth;
import com.pal.stringops.RemovePalindromicSubsequences;
import com.pal.stringops.ReverseWordsInString;
import com.pal.stringops.ShuffleString;
import com.pal.stringops.SplitBalancedStrings;
import com.pal.stringops.UncommonWordsIIn2Sentences;
import com.pal.stringops.UniqueMorseCodeWords;
import com.pal.utils.ListNode;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @DisplayName("Change case test")
    @ParameterizedTest
    @MethodSource("changeCaseInput")
    void testChangeCase(String input, String expectedOutput) {
    	ChangeCase changeCase = new ChangeCase();
    	String actualOutput = changeCase.changeStrCase(input);
    	Assertions.assertEquals(expectedOutput, actualOutput);
    	
    	
    }
    static Stream<Arguments> changeCaseInput() {
    	return Stream.of(
    			Arguments.of("LOWER", "lower"),
    			Arguments.of("lower", "lower"),
    			Arguments.of("Lower", "lower")
    			);
    	
    }
    
   
    @DisplayName("Reduce Number To Zero")
    @ParameterizedTest
    @MethodSource("numberOfStepsInput")
    void testnumberOfSteps(int input, int expectedOutput) {
    	//ReduceNumberToZero reduceNotoZero = new ReduceNumberToZero();
		int actualOutput = ReduceNumberToZero.numberOfSteps(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
    
    static Stream<Arguments> numberOfStepsInput() {
    	return Stream.of(
    			Arguments.of(123, 12),
    			Arguments.of(8, 4),
    			Arguments.of(14, 6)
    			);
    }
    
    
    @DisplayName("Change Target Array")
    @ParameterizedTest
    @MethodSource("createTargetArrayInput")
    void testCreateTargetArray(int[] input,int[] index, int[] expectedOutput) {
    	CreateTargetArray createTargetArray = new CreateTargetArray();
		int[] actualOutput = createTargetArray.createTargetArray(input, index);
        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }
    
    static Stream<Arguments> createTargetArrayInput() {
    	return Stream.of(
    			Arguments.of(new int[]{0,1,2,3,4},new int[]{0,1,2,2,1}, new int[]{0,4,1,3,2}),
    			Arguments.of(new int[]{1,2,3,4,0},new int[]{0,1,2,3,0}, new int[]{0,1,2,3,4}),
    			Arguments.of(new int[]{1}, new int[]{0}, new int[] {1})
    			);
    }
    
    @DisplayName("Maximum Nesting Depth")
    @ParameterizedTest
    @MethodSource("maxDepth")
    void testMaxDepth(String input, int expectedOutput) {
    	MaximumNestingDepth maximumNestingDepth = new MaximumNestingDepth();
    	int actualOutput = maximumNestingDepth.maxDepth(input);
    	Assertions.assertEquals(expectedOutput, actualOutput);
    	
    	
    }
    static Stream<Arguments> maxDepth() {
    	return Stream.of(
    			Arguments.of("(1+(2*3)+((8)/4))+1", 3),
    			Arguments.of("(1)+((2))+(((3)))", 3),
    			Arguments.of("1+(2*3)/(2-1)", 1),
    			Arguments.of("1)", 0)
    			);
    	
    }
    
    @DisplayName("Shuffle String")
    @ParameterizedTest
    @MethodSource("restoreString")
    void testRestoreString(String input, int[] inputIndices, String expectedOutput) {
    	ShuffleString shuffleString = new ShuffleString();
    	String actualOutput = shuffleString.restoreString(input, inputIndices);
    	Assertions.assertEquals(expectedOutput, actualOutput);
    	
    	
    }
    static Stream<Arguments> restoreString() {
    	return Stream.of(
    			Arguments.of("codeleet", new int[]{4,5,6,7,0,2,1,3},"leetcode"),
    			Arguments.of("aiohn", new int[]{3,1,4,2,0} ,"nihao"),
    			Arguments.of("abc", new int[]{0,1,2} ,"abc"),
    			Arguments.of("aaiougrt", new int[]{4,0,2,6,7,3,1,5} ,"arigatou"),
    			Arguments.of("art", new int[]{1,0,2} ,"rat")
    			);
    	
   }
    
    @DisplayName("Split Balanced Strings")
    @ParameterizedTest
    @MethodSource("balancedStringSplit")
    void testBalancedStringSplit(String input, int expectedOutput) {
    	SplitBalancedStrings splitBalancedStrings = new SplitBalancedStrings();
    	int actualOutput = splitBalancedStrings.balancedStringSplit(input);
    	Assertions.assertEquals(expectedOutput, actualOutput);    	
    }
    static Stream<Arguments> balancedStringSplit() {
    	return Stream.of(
    			Arguments.of("RLRRLLRLRL",4),
    			Arguments.of("RLLLLRRRLR", 3),
    			Arguments.of("LLLLRRRR", 1),
    			Arguments.of("RLRRRLLRLL", 2)
    			);
    	
   }
   
    
	
	@DisplayName("Convert LL Binary Number")
	@ParameterizedTest
	@MethodSource("getDecimalValue")
	void testGetDecimalValue(ListNode input, int expectedOutput) {
		ConvertLLBinaryNumber convertLLBinaryNumber = new ConvertLLBinaryNumber();
		int actualOutput = convertLLBinaryNumber.getDecimalValue(input);
		Assertions.assertEquals(expectedOutput, actualOutput);
	}

	static
	  Stream<Arguments> getDecimalValue() { 
		return Stream.of( 
					Arguments.of(convertArrayToList(new int[]{1,0,1}),5),
					Arguments.of(convertArrayToList(new int[]{0}),0),
					Arguments.of(convertArrayToList(new int[]{1}),1),
					Arguments.of(convertArrayToList(new int[]{1,0,0,1,0,0,1,1,1,0,0,0,0,0,0}),18880),
					Arguments.of(convertArrayToList(new int[]{0,0}),0)
					);
	  }
	 
	 @DisplayName("Greatest Number oF Candies")
	    @ParameterizedTest
	    @MethodSource("kidsWithCandies")
	    void testKidsWithCandies(int[] input, int extraInput, List<Boolean> expectedOutput) {
		 GreatestNumberoFCandies greatestNumberoFCandies = new GreatestNumberoFCandies();
	    	List<Boolean> actualOutput = greatestNumberoFCandies.kidsWithCandies(input, extraInput);
	    	Assertions.assertEquals(expectedOutput, actualOutput);    	
	    }
	    static Stream<Arguments> kidsWithCandies() {
	    	return Stream.of(
	    			Arguments.of(new int[]{7,2,5,6,9,9,4,5},3,Arrays.asList(new Boolean[] {true,false,false,true,true,true,false,false})),
	    			Arguments.of(new int[]{2,3,5,1,3},3,Arrays.asList(new Boolean[] {true,true,true,false,true})),
	    			Arguments.of(new int[]{4,2,1,1,2},1,Arrays.asList(new Boolean[] {true,false,false,false,false})),
	    			Arguments.of(new int[]{12,1,12},10,Arrays.asList(new Boolean[] {true,false,true}))
	    			);
	    	
	   }
	    
	    @DisplayName("Number Of Good Pairs")
		@ParameterizedTest
		@MethodSource("numIdenticalPairs")
		void testNumIdenticalPairs(int[] input, int expectedOutput) {
	    	NumberOfGoodPairs numberOfGoodPairs = new NumberOfGoodPairs();
			int actualOutput = numberOfGoodPairs.numIdenticalPairs(input);
			Assertions.assertEquals(expectedOutput, actualOutput);
		}
	    static
		  Stream<Arguments> numIdenticalPairs() { 
			return Stream.of( 
						Arguments.of(new int[]{1,2,3,1,1,3},4),
						Arguments.of(new int[]{1,1,1,1},6),
						Arguments.of(new int[]{1,2,3},0)
						);
		  }    
	    
	    @DisplayName("Even Number Of Digits")
		@ParameterizedTest
		@MethodSource("findNumbers")
		void testFindNumbers(int[] input, int expectedOutput) {
	    	EvenNumberOfDigits evenNumberOfDigits = new EvenNumberOfDigits();
			int actualOutput = evenNumberOfDigits.findNumbers(input);
			Assertions.assertEquals(expectedOutput, actualOutput);
		}
	    static
		  Stream<Arguments> findNumbers() { 
			return Stream.of( 
						Arguments.of(new int[]{12,345,2,6,7896},2),
						Arguments.of(new int[]{555,901,482,1771},1)
						);
		  }   
	    
	    @DisplayName("Count Consistent Strings")
		@ParameterizedTest
		@MethodSource("countConsistentStrings")
		void testCountConsistentStrings(String input2, String[] input, int expectedOutput) {
	    	CountConsistentStrings countConsistentStrings = new CountConsistentStrings();
			int actualOutput = countConsistentStrings.countConsistentStrings(input2, input);
			Assertions.assertEquals(expectedOutput, actualOutput);
		}
	    static
		  Stream<Arguments> countConsistentStrings() { 
			return Stream.of( 
						Arguments.of("ab", new String[]{"ad","bd","aaab","baa","badab"},2),
						Arguments.of("abc", new String[]{"a","b","c","ab","ac","bc","abc"},7),
						Arguments.of("cad", new String[]{"cc","acd","b","ba","bac","bad","ac","d"},4)
						);
		  }   
	    
	    @DisplayName("Design Parking System")
		@ParameterizedTest
		@MethodSource("addCar")
		void testAddCar(int input1, int input2, int input3, int[] addCarInputs, boolean[] addCarExpected) {
	    	
			DesignParkingSystem designParkingSystem = new DesignParkingSystem(input1, input2, input3);
			for  (int i=0; i<addCarInputs.length; i++) {
				boolean actualOutput = designParkingSystem.addCar(addCarInputs[i]);
				Assertions.assertEquals(addCarExpected[i], actualOutput);
			}
		}
	    static
		  Stream<Arguments> addCar() { 
			return Stream.of( 
						//Arguments.of(1,1,0, new int[] {3}, new boolean[] {false}),
						Arguments.of(1,1,0, new int[] {1, 2, 3, 1}, new boolean[] {true, true, false, false})
						);
		  }   
	    
	    @DisplayName("Array XOR Operation")
	    @ParameterizedTest
	    @MethodSource("xorOperation")
	    void testXorOperation(int input, int input2, int expectedOutput) {
	    	ArrayXOROperation arrayXOROperation = new ArrayXOROperation();
	    	int actualOutput = arrayXOROperation.xorOperation(input, input2);
	    	Assertions.assertEquals(expectedOutput, actualOutput);    	
	    }
	    static Stream<Arguments> xorOperation() {
	    	return Stream.of(
	    			Arguments.of(5,0,8),
	    			Arguments.of(4,3,8),
	    			Arguments.of(1,7,7),
	    			Arguments.of(10,5,2)
	    			);
	    	}
	    
	    @DisplayName("Decompress Encoded List")
	    @ParameterizedTest
	    @MethodSource("decompressRLElist")
	    void testDecompressRLElist(int[] input, int[] expectedOutput) {
	    	DecompressEncodedList decompressEncodedList = new DecompressEncodedList();
	    	int[] actualOutput = decompressEncodedList.decompressRLElist(input);
	    	Assertions.assertArrayEquals(expectedOutput, actualOutput);    	
	    }
	    static Stream<Arguments> decompressRLElist() {
	    	return Stream.of(
	    			Arguments.of(new int[] {1,2,3,4}, new int[] {2,4,4,4}),
	    			Arguments.of(new int[] {1,1,2,3}, new int[] {1,3,3})
	    			);
	    	}
	
	    @DisplayName("Unique Morse Code Words")
	    @ParameterizedTest
	    @MethodSource("uniqueMorseRepresentations")
	    void testUniqueMorseRepresentations(String[] input, int expectedOutput) {
	    	UniqueMorseCodeWords uniqueMorseCodeWords = new UniqueMorseCodeWords();
	    	int actualOutput = uniqueMorseCodeWords.uniqueMorseRepresentations(input);
	    	Assertions.assertEquals(expectedOutput, actualOutput);    	
	    }
	    static Stream<Arguments> uniqueMorseRepresentations() {
	    	return Stream.of(
	    			Arguments.of(new String[]{"gin", "zen", "gig", "msg"},2)
	    			);
	   }
	    
	    @DisplayName("Determine Alike String Halves")
	    @ParameterizedTest
	    @MethodSource("halvesAreAlike")
	    void testHalvesAreAlike(String input, boolean expectedOutput) {
	    	DetermineAlikeStringHalves determineAlikeStringHalves = new DetermineAlikeStringHalves();
	    	boolean actualOutput = determineAlikeStringHalves.halvesAreAlike(input);
	    	Assertions.assertEquals(expectedOutput, actualOutput);    	
	    }
	    static Stream<Arguments> halvesAreAlike() {
	    	return Stream.of(
	    			Arguments.of("book", true),
	    			Arguments.of("textbook", false),
	    			Arguments.of("MerryChristmas", false),
	    			Arguments.of("AbCdEfGh", true)
	    			);
	   }
	    

	    @DisplayName("Diff Product Sum of Digits")
	    @ParameterizedTest
	    @MethodSource("subtractProductAndSum")
	    void testSubtractProductAndSum(int input, int expectedOutput) {
	    	DiffProductSumofDigits diffProductSumofDigits = new DiffProductSumofDigits();
	    	int actualOutput = diffProductSumofDigits.subtractProductAndSum(input);
	    	Assertions.assertEquals(expectedOutput, actualOutput);    	
	    }
	    static Stream<Arguments> subtractProductAndSum() {
	    	return Stream.of(
	    			Arguments.of(234, 15),
	    			Arguments.of(4421, 21),
	    			Arguments.of(114, -2)
	    			);
	   }
	    
	    @DisplayName("Maximum 69 Number")
	    @ParameterizedTest
	    @MethodSource("maximum69Number")
	    void testMaximum69Number(int input, int expectedOutput) {
	    	Maximum69Number maximum69Number = new Maximum69Number();
	    	int actualOutput = maximum69Number.maximum69Number(input);
	    	Assertions.assertEquals(expectedOutput, actualOutput);    	
	    }
	    static Stream<Arguments> maximum69Number() {
	    	return Stream.of(
	    			Arguments.of(9669, 9969),
	    			Arguments.of(9996, 9999)
	    			);
	   }
	    
	    @DisplayName("Hamming Distance")
	    @ParameterizedTest
	    @MethodSource("hammingDistance")
	    void testHammingDistance(int input, int input2, int expectedOutput) {
	    	HammingDistance hammingDistance = new HammingDistance();
	    	int actualOutput = hammingDistance.hammingDistance(input, input2);
	    	Assertions.assertEquals(expectedOutput, actualOutput);    	
	    }
	    static Stream<Arguments> hammingDistance() {
	    	return Stream.of(
	    			Arguments.of(1, 4, 2)
	    			);
	   }
	    
	    @DisplayName("Self Dividing Numbers")
	    @ParameterizedTest
	    @MethodSource("selfDividingNumbers")
	    void testHammingDistance(int input, int input2, List<Integer> expectedOutput) {
	    	SelfDividingNumbers selfDividingNumbers = new SelfDividingNumbers();
	    	List<Integer> actualOutput = selfDividingNumbers.selfDividingNumbers(input, input2);
	    	Assertions.assertEquals(expectedOutput, actualOutput);    	
	    }
	    static Stream<Arguments> selfDividingNumbers() {
	    	return Stream.of(
	    			Arguments.of(1, 22, convertArrayToArrayList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22}))
	    			);
	   }
	    
	    @DisplayName("Increasing Decreasing String")
	    @ParameterizedTest
	    @MethodSource("sortString")
	    void testSortString(String input, String expectedOutput) {
	    	IncreasingDecreasingString increasingDecreasingString = new IncreasingDecreasingString();
	    	String actualOutput = increasingDecreasingString.sortString(input);
	    	Assertions.assertEquals(expectedOutput, actualOutput);    	
	    }
	    static Stream<Arguments> sortString() {
	    	return Stream.of(
	    			Arguments.of("aaaabbbbcccc","abccbaabccba"),
	    			Arguments.of("rat","art"),
	    			Arguments.of("leetcode","cdelotee"),
	    			Arguments.of("ggggggg","ggggggg"),
	    			Arguments.of("spo","ops")
	    			);
	   }
	    
	    @DisplayName("Sort Array By Parity")
	    @ParameterizedTest
	    @MethodSource("sortArrayByParity")
	    void testSortString(int[] input, int[] expectedOutput) {
	    	SortArrayByParity sortArrayByParity = new SortArrayByParity();
	    	int[] actualOutput = sortArrayByParity.sortArrayByParity(input);
	    	Assertions.assertArrayEquals(expectedOutput, actualOutput);    	
	    }
	    static Stream<Arguments> sortArrayByParity() {
	    	return Stream.of(
	    			Arguments.of(new int[] {3,1,2,4},new int[] {2,4,3,1}),
	    			Arguments.of(new int[] {1},new int[] {1}),
	    			Arguments.of(new int[] {0,2,1},new int[] {0,2,1})
	    			);
	   }
	   
	    @DisplayName("Replace Greatest Element")
	    @ParameterizedTest
	    @MethodSource("replaceElements")
	    void testReplaceElements(int[] input, int[] expectedOutput) {
	    	ReplaceGreatestElement replaceGreatestElement = new ReplaceGreatestElement();
	    	int[] actualOutput = replaceGreatestElement.replaceElements(input);
	    	Assertions.assertArrayEquals(expectedOutput, actualOutput);    	
	    }
	    static Stream<Arguments> replaceElements() {
	    	return Stream.of(
	    			Arguments.of(new int[] {17,18,5,4,6,1},new int[] {18,6,6,6,1,-1}),
	    			Arguments.of(new int[] {400},new int[] {-1})
	    			);
	   }
	    
	    @DisplayName("Find Prefix In Sentence")
	    @ParameterizedTest
	    @MethodSource("isPrefixOfWord")
	    void testIsPrefixOfWord(String input, String input1, int expectedOutput) {
	    	FindPrefixInSentence findPrefixInSentence = new FindPrefixInSentence();
	    	int actualOutput = findPrefixInSentence.isPrefixOfWord(input, input1);
	    	Assertions.assertEquals(expectedOutput, actualOutput);    	
	    }
	    static Stream<Arguments> isPrefixOfWord() {
	    	return Stream.of(
	    			Arguments.of("i love eating burger","burg",4),
	    			Arguments.of("this problem is an easy problem","pro",2),
	    			Arguments.of("i am tired","you",-1),
	    			Arguments.of("i use triple pillow","pill",4),
	    			Arguments.of("hello from the other side","they",-1),
	    			Arguments.of("hellohello hellohellohello","ell",-1)
	    			);
	   }
	    
	    @DisplayName("DI String Match")
	    @ParameterizedTest
	    @MethodSource("diStringMatch")
	    void testDiStringMatch(String input, int[] expectedOutput) {
	    	DIStringMatch dIStringMatch = new DIStringMatch();
	    	int[] actualOutput = dIStringMatch.diStringMatch(input);
	    	Assertions.assertArrayEquals(expectedOutput, actualOutput);    	
	    }
	    static Stream<Arguments> diStringMatch() {
	    	return Stream.of(
	    			Arguments.of("IDID",new int[] {0,4,1,3,2}),
	    			Arguments.of("III",new int[] {0,1,2,3}),
	    			Arguments.of("DDI",new int[] {3,2,0,1})
	    			);
	   }
	    
	    @DisplayName("Uncommon Words In 2 Sentences")
	    @ParameterizedTest
	    @MethodSource("uncommonFromSentences")
	    void testDiStringMatch(String input, String input2, String[] expectedOutput) {
	    	UncommonWordsIIn2Sentences uncommonWordsIIn2Sentences = new UncommonWordsIIn2Sentences();
	    	String[] actualOutput = uncommonWordsIIn2Sentences.uncommonFromSentences(input, input2);
	    	Assertions.assertArrayEquals(expectedOutput, actualOutput);    	
	    }
	    static Stream<Arguments> uncommonFromSentences() {
	    	return Stream.of(
	    			Arguments.of("this apple is sweet", "this apple is sour", new String[] {"sweet","sour"}),
	    			Arguments.of("apple apple", "banana", new String[] {"banana"})
	    			);
	   }
	    
	    @DisplayName("Squares of Sorted Array")
	    @ParameterizedTest
	    @MethodSource("sortedSquares")
	    void testSortedSquares(int[] input, int[] expectedOutput) {
	    	SquaresofSortedArray squaresofSortedArray = new SquaresofSortedArray();
	    	int[] actualOutput = squaresofSortedArray.sortedSquares(input);
	    	Assertions.assertArrayEquals(expectedOutput, actualOutput);    	
	    }
	    static Stream<Arguments> sortedSquares() {
	    	return Stream.of(
	    			Arguments.of(new int[] {-4,-1,0,3,10}, new int[] {0,1,9,16,100}),
	    			Arguments.of(new int[] {7,-3,2,3,11}, new int[] {4,9,9,49,121})
	    			);
	   }
	    
	    @DisplayName("Reverse Words In String")
	    @ParameterizedTest
	    @MethodSource("reverseWords")
	    void testReverseWords(String input, String expectedOutput) {
	    	ReverseWordsInString reverseWordsInString = new ReverseWordsInString();
	    	String actualOutput = reverseWordsInString.reverseWords(input);
	    	Assertions.assertEquals(expectedOutput, actualOutput);    	
	    }
	    static Stream<Arguments> reverseWords() {
	    	return Stream.of(
	    			Arguments.of("Let's take LeetCode contest", "s'teL ekat edoCteeL tsetnoc")
	    			);
	   }
	    
	    @DisplayName("Fizz Buzz")
	    @ParameterizedTest
	    @MethodSource("fizzBuzz")
	    void testFizzBuzz(int input, List<String> expectedOutput) {
	    	FizzBuzz fizzbuzz = new FizzBuzz();
	    	List<String> actualOutput = fizzbuzz.fizzBuzz(input);
	    	Assertions.assertEquals(expectedOutput, actualOutput);    	
	    }
	    static Stream<Arguments> fizzBuzz() {
	    	return Stream.of(
	    			Arguments.of(15, convertArrayToArrayListStr(new String[]{"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"}))
	    			);
	   }
	    
	    @DisplayName("Find Array Lucky Integer")
	    @ParameterizedTest
	    @MethodSource("findLucky")
	    void testFindLucky(int[] input, int expectedOutput) {
	    	FindArrayLuckyInteger findArrayLuckyInteger = new FindArrayLuckyInteger();
	    	int actualOutput = findArrayLuckyInteger.findLucky(input);
	    	Assertions.assertEquals(expectedOutput, actualOutput);    	
	    }
	    static Stream<Arguments> findLucky() {
	    	return Stream.of(
	    			Arguments.of(new int[]{2,2,3,4}, 2),
	    			Arguments.of(new int[]{1,2,2,3,3,3}, 3),
	    			Arguments.of(new int[]{2,2,2,3,3}, -1),	
	    			Arguments.of(new int[]{5}, -1),		
	    			Arguments.of(new int[]{7,7,7,7,7,7,7}, 7)
	    			);
	    	}
	    
	    @DisplayName("Remove Palindromic Subsequences")
	    @ParameterizedTest
	    @MethodSource("removePalindromeSub")
	    void testFindLucky(String input, int expectedOutput) {
	    	RemovePalindromicSubsequences removePalindromicSubsequences = new RemovePalindromicSubsequences();
	    	int actualOutput = removePalindromicSubsequences.removePalindromeSub(input);
	    	Assertions.assertEquals(expectedOutput, actualOutput);    	
	    	}
	    static Stream<Arguments> removePalindromeSub() {
	    	return Stream.of(
	    			Arguments.of("ababa" , 1),
	    			Arguments.of("abb" , 2),
	    			Arguments.of("baabb" , 2),	
	    			Arguments.of("" , 0)
	    			);
	    	} 
	    
	    @DisplayName("Missing Number")
	    @ParameterizedTest
	    @MethodSource("missingNumber")
	    void testMissingNumber(int[] input, int expectedOutput) {
	    	MissingNumber missingNumber = new MissingNumber();
	    	int actualOutput = missingNumber.missingNumber(input);
	    	Assertions.assertEquals(expectedOutput, actualOutput);    	
	    	}
	    static Stream<Arguments> missingNumber() {
	    	return Stream.of(
	    			Arguments.of(new int[]{3,0,1} , 2),
	    			Arguments.of(new int[]{0,1} , 2),
	    			Arguments.of(new int[]{9,6,4,2,3,5,7,0,1} , 8),
	    			Arguments.of(new int[]{0} , 1)
	    			);
	    	} 
	   
	// Util Methods 
	    public static ListNode convertArrayToList(int[] input){
			ListNode head = null;
			ListNode ln = null;
			for(int value : input) {
				if(head==null) {
					head = new ListNode(input[0]);
					ln = head;
				 }else {
					 ln.next = new ListNode(value);
					 ln = ln.next;
				 }
				
			}
			return head;
		}    
	    
	    public static List<Integer> convertArrayToArrayList(int[] input){
			List<Integer> arrayToAL = new ArrayList<Integer>();
			for(int value : input) {
				arrayToAL.add(value);
			}
			return arrayToAL;
		}   
	    
	    public static List<String> convertArrayToArrayListStr(String[] input){
			List<String> arrayToAL = new ArrayList<String>();
			for(String value : input) {
				arrayToAL.add(value);
			}
			return arrayToAL;
		}    
    
}