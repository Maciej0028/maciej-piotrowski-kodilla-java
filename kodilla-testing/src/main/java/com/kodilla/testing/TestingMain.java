package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")) {
            System.out.println("Test OK.");
        } else {
            System.out.println("Error!");
        }
        Calculator calculator = new Calculator();
        int sum = calculator.add(5, 10);
        if (sum == 15) {
            System.out.println("Test OK.");
        } else {
            System.out.println("Error!");
        }
        int difference = calculator.subtract(20, 5);
        if (difference == 15) {
            System.out.println("Test OK.");
        } else {
            System.out.println("Error!");
        }
    }
}