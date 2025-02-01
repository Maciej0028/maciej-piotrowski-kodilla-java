package com.kodilla.testing.extra.tasks;

public class ReverseString {
    private final String string;
    public ReverseString(String string) {
        this.string = string;
    }
    public String reverse() {
        StringBuilder reversed = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            reversed.append(string.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString("Hello World");
        System.out.println(reverseString.reverse());
        ReverseString reverseString1 = new ReverseString("Konstantynopolitanczykowianeczka");
        System.out.println(reverseString1.reverse());
        ReverseString reverseString2 = new ReverseString("Kajak");
        System.out.println(reverseString2.reverse());
    }
}
