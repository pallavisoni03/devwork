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

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @DisplayName("Name of the test goes here")
    @ParameterizedTest
    @MethodSource("inputProvider")
    void sumOfIntArray(int[] input, int expected) {
        int sum = 0;
        for (int i=0; i< input.length; i++) {
            sum = sum + input[i];
        }

        Assertions.assertEquals(sum, expected);
    }
    
    static Stream<Arguments> inputProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2}, 5),
                Arguments.of(new int[]{1, 2}, 3));
    }
}