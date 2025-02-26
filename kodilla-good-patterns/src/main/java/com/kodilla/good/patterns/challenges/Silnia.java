package com.kodilla.good.patterns.challenges;

public class Silnia {
    public static void main(String[] args) {
        System.out.println(factorial(1) + "\n" + factorial(2) + "\n" + factorial(3)
                + "\n" + factorial(4) + "\n" + factorial(5) + "\n" + factorial(6)
                + "\n" + factorial(7) + "\n" + factorial(8) + "\n" + factorial(9)
                + "\n" + factorial(10) + "\n" + factorial(11));
    }
    public static int factorial(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }
}
