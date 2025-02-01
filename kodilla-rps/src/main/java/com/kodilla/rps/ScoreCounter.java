package com.kodilla.rps;

public class ScoreCounter {

    public static int humanScore = 0;
    public static int aiScore = 0;
    public static int draws = 0;

    public static void count(Winner winner) {
        if (winner == Winner.HUMAN) {
            humanScore++;
        }
        if (winner == Winner.COMPUTER) {
            aiScore++;
        }
        if (winner == Winner.DRAW) {
            draws++;
        }
    }
    public static String getScore() {
        return "Human score : " + humanScore + " Computer score : " + aiScore + " Draws : " + draws;
    }

    public static void resetScore() {
        humanScore = 0;
        aiScore = 0;
        draws = 0;
    }
}
