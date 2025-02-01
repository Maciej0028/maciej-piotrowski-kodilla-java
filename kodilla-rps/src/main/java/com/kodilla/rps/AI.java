package com.kodilla.rps;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class AI {
    public static MoveSelection getComputerSelection() {
        Random random = new Random();
        int choice = random.nextInt(3);
        switch (choice) {
            case 0: return MoveSelection.ROCK;
            case 1: return MoveSelection.PAPER;
            case 2: return MoveSelection.SCISSORS;
            default: throw new IllegalArgumentException("Invalid choice");
        }
    }

    public static Winner calculateWinner(MoveSelection userSelection , MoveSelection AiSelection) {
        if (userSelection == AiSelection) {
            return Winner.DRAW;
        }
        switch (userSelection) {
            case ROCK: return (AiSelection == MoveSelection.SCISSORS) ? Winner.HUMAN : Winner.COMPUTER;
            case PAPER: return (AiSelection == MoveSelection.ROCK) ? Winner.HUMAN : Winner.COMPUTER;
            case SCISSORS: return (AiSelection == MoveSelection.PAPER) ? Winner.HUMAN : Winner.COMPUTER;
            default: throw new AssertionError();
        }
    }
}
