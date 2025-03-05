package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertTrue;

@SpringBootTest
public class CalculatorTestSuite {
    //Given
    @Autowired
    private Calculator calculator;

    @Test
    void testAddAndDisplay() {
        //When
        double result = calculator.add(5, 5);
        //Then
        assertEquals(10, result);
    }

    @Test
    void testSubAndDisplay() {
        //When
        double result = calculator.subtract(5, 5);
        //Then
        assertEquals(0, result);
    }

    @Test
    void testMultiplyAndDisplay() {
        //When
        double result = calculator.multiply(5, 5);
        //Then
        assertEquals(25, result);
    }

    @Test
    void testDivideAndDisplay() {
        //When
        double result = calculator.divide(5, 5);
        //Then
        assertEquals(1, result);
    }
}
