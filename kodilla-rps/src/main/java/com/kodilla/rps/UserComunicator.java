package com.kodilla.rps;

import java.util.Scanner;

public class UserComunicator {
    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter your name: ");
            String userName = scanner.nextLine();
            if (userName.length() >= 3) {
                return userName;
            } else {
                System.out.println("Username has to be at least 3 characters: ");
            }
        }
    }

    public static int getRounds() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("How many rounds would you like to play?");
            if (scanner.hasNextInt()) {
                int rounds = scanner.nextInt();
                if (rounds > 0 && rounds < 11) {
                    return rounds;
                } else {
                    System.out.println("You have to enter integer between 1 and 10.");
                }
            } else {
                System.out.println("Invalid input ,please enter a number.");
                scanner.next();
            }
        }
    }

    public static MoveSelection getMoveSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please choose a move : (1)Rock , (2)Paper , (3)Scissors , (x)QUIT");
            String input = scanner.nextLine();
            switch (input.toLowerCase()) {
                case "1": return MoveSelection.ROCK;
                case "2": return MoveSelection.PAPER;
                case "3": return MoveSelection.SCISSORS;
                case "x": return MoveSelection.QUIT;
                default : System.out.println("Wrong selection please try again");
            }
        }
    }

    public static void displayGameStatus(int round, int rounds, MoveSelection userSelection, MoveSelection AiSelection, Winner winner) {
        System.out.println("Round: " + round);
        System.out.println("Rounds: " + rounds);
        System.out.println("UserSelection: " + userSelection);
        System.out.println("AiSelection: " + AiSelection);
        System.out.println("Winner: " + winner);
    }
}