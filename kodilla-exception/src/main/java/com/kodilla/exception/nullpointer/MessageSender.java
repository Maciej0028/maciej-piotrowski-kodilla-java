package com.kodilla.exception.nullpointer;

public class MessageSender {
    public void sentMessageTo(User user, String message) throws MessageNotSentException {
        if (user != null) {
            System.out.println("Sent message: " + message + " to " + user.getName());
        } else {
            throw new MessageNotSentException("Object User was null");
        }
    }
}
