package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {
        //given
        int[] numbers = {1,4,5,15,67,32,12,4,6,8,9,65};
        //when
        double result = ArrayOperations.getAverage(numbers);
        //then
        assertEquals(19.0, result, 0.001);
    }
}