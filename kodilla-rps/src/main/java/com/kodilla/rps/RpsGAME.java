package com.kodilla.rps;

public class RpsGAME {
    public void play() {
        String name = UserComunicator.getUserName();
        int rounds = UserComunicator.getRounds();
        int round = 1;
        ScoreCounter scoreCounter = new ScoreCounter();
        while (round <= rounds) {
            MoveSelection userSelection = UserComunicator.getMoveSelection();
            if (userSelection == MoveSelection.QUIT) {
                System.out.println("You sure? type x again or anything else to comeback to game.");
                if (UserComunicator.getMoveSelection() == MoveSelection.QUIT) {
                    System.out.println("Bye Bye");
                    return; } else { continue; }
            }
            MoveSelection AiSelection = AI.getComputerSelection();
            Winner winner = AI.calculateWinner(userSelection, AiSelection);
            scoreCounter.count(winner);
            UserComunicator.displayGameStatus(round, rounds, userSelection, AiSelection, winner);
            System.out.println(scoreCounter.getScore());
            round++;
        }
    }
}