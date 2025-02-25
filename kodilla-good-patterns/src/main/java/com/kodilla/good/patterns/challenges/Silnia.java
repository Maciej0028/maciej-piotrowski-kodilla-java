package com.kodilla.good.patterns.challenges;

public class Silnia {
    public static void main(String[] args) {
        System.out.println(silnia(1) + "\n" + silnia(2) + "\n" + silnia(3)
                + "\n" + silnia(4) + "\n" + silnia(5) + "\n" + silnia(6)
                + "\n" + silnia(7) + "\n" + silnia(8) + "\n" + silnia(9)
                + "\n" + silnia(10) + "\n" + silnia(11));
    }
    public static int silnia(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }
}
