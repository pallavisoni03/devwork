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
    
    //@DisplayName("Should calculate the correct sum")
    //@ParameterizedTest
    //@MethodSource("stringArrayProvider")
    //void parseFirstAndSecondInt(String[] args) {
        //Arguments arguments = new Arguments(args);

        //assertEquals(1, arguments.getFirst());
        //assertEquals(2, arguments.getSecond());
    //}
    
    static Stream<String[]> stringArrayProvider() {
        return Stream.of(
                new String[]{"1", "2"},
                new String[]{"1", "2", "3"});
    }
}
