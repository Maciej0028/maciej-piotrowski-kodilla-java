package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {
    public static void main(String[] args) {
        User user = null;
        MessageSender messageSender = new MessageSender();

        try {
            messageSender.sentMessageTo(user, "Hello!");
        } catch (MessageNotSentException e) {
            System.out.println("Message is not sent," +
                    " but my program is still run very well!");
        }
        System.out.println("Procesing other logic!");
    }
}