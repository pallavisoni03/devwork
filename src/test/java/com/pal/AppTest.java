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
    
    
    
}