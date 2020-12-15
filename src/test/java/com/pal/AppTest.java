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
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Assertions.assertTrue( true );
    }
    
    @DisplayName("Should calculate the correct sum")
    @ParameterizedTest
    @MethodSource("stringArrayProvider")
    void parseFirstAndSecondInt(int[] input, int expected) {
        int sum = 0;
        for (int i=0; i< input.length; i++) {
            sum = sum + input[i];
        }

        Assertions.assertEquals(sum, expected);
    }
    
    static Stream<Arguments> stringArrayProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2}, 5),
                Arguments.of(new int[]{1, 2}, 3));
                //new Arg(new int[]{1, 2, 2}, 5),
                //new Arg(new int[]{1}, 3));
    }
}

class Arg {
    int[] inputs;
    int expected;

    public Arg(int[] inputs, int expected) {
        this.inputs = inputs;
        this.expected = expected;
    }
}
