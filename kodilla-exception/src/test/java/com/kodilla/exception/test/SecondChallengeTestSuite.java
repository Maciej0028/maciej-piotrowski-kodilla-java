package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SecondChallengeTestSuite {
    @Test
    void TestSecondChallenge() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        assertAll (
                () -> assertThrows(Exception.class, () ->secondChallenge.probablyIWillThrowException(2, 1)),
                () -> assertThrows(Exception.class, () ->secondChallenge.probablyIWillThrowException(1, 1.5)),
                () -> assertThrows(Exception.class, () ->secondChallenge.probablyIWillThrowException(2, 1.5)),
                () -> assertThrows(Exception.class, () ->secondChallenge.probablyIWillThrowException(0, 10)),
                () -> assertThrows(Exception.class, () ->secondChallenge.probablyIWillThrowException(0, 0)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.99, 10)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5, 2)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.01, 0))
        );
    }
}