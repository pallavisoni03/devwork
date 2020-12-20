package com.pal;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.pal.intops.CreateTargetArray;
import com.pal.intops.ReduceNumberToZero;
import com.pal.stringops.ChangeCase;
import com.pal.stringops.MaximumNestingDepth;
import com.pal.stringops.ShuffleString;
import com.pal.stringops.SplitBalancedStrings;

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
   
    
}