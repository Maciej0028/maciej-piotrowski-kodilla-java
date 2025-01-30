package com.kodilla.testing.extra.tasks;

public class ReverseString {
    private String string;
    public ReverseString(String string) {
        this.string = string;
    }
    public String reverse() {
        String reversed = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reversed += string.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString("Hello World");
        System.out.println(reverseString.reverse());
    }
}
