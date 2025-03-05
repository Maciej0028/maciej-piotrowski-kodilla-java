package com.kodilla.spring.fibonacci.sequence;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println(fibbonacci(10));
    }
    private static long fibbonacci(int n) {
        if (n == 0) {
            return 0;
        } else {
            return fibbonacci(n - 1) + n;
        }
    }
}
