package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(2, 1.5);
            System.out.println(result);
        } catch(Exception e) {
            System.out.println("Błąd :" + e);
        } finally {
            System.out.println("Done anyway!");
        }

        try {
            String result = secondChallenge.probablyIWillThrowException(1.5, 2);
            System.out.println(result);
        } catch(Exception e) {
            System.out.println("Błąd :" + e);
        } finally {
            System.out.println("Done anyway!");
        }
    }
}