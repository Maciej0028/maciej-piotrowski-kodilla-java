package com.kodilla.testing.collections;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CollectionTestSuite {
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> input = Collections.emptyList();
        //When
        List<Integer> result = exterminator.exterminate(input);
        //Then
        assertTrue(result.isEmpty());
    }
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expected = List.of(2, 4, 6, 8, 10);
        //When
        List<Integer> result = exterminator.exterminate(input);
        //Then
        assertEquals(expected, result);
    }
}