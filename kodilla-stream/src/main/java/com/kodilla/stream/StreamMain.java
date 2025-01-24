package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);



        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("Calculating poems with lambdas.");
        poemBeautifier.beautify("HEJ NAZYWAM SIĘ MACIEJ JAK SIĘ MASZ", poem -> poem.toLowerCase());
        poemBeautifier.beautify("just do it", poem -> poem.toUpperCase());
        poemBeautifier.beautify("JUST DO IT OR NOT", poem -> poem.substring(0, poem.length() - 6));
        poemBeautifier.beautify("Jęstęś więlki", poem -> poem.replace("ę", "e"));
        poemBeautifier.beautify("Alfabet" , poem -> poem + " ABCDEFGHIJKLMNOPQRSTUVWXYZ");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}