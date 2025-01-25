package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.*;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

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

        System.out.println("");

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("Calculating poems with lambdas.");
        poemBeautifier.beautify("HEJ NAZYWAM SIĘ MACIEJ JAK SIĘ MASZ", poem -> poem.toLowerCase());
        poemBeautifier.beautify("just do it", poem -> poem.toUpperCase());
        poemBeautifier.beautify("JUST DO IT OR NOT", poem -> poem.substring(0, poem.length() - 6));
        poemBeautifier.beautify("Jęstęś więlki", poem -> poem.replace("ę", "e"));
        poemBeautifier.beautify("Alfabet", poem -> poem + " ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        poemBeautifier.beautify("Alfabet", poem -> new StringBuilder(poem).append(" abc").toString());
        StringBuilder sb = new StringBuilder();
        poemBeautifier.beautify("Alfabet", poem -> sb.append("abc to ").append(poem).toString());
        /*
        Overkill bo wystarczy poem -> poem + " abc" tak jak powyżej
        ale może być przydatne z innymi funkcjami Stringbuildera
         */
        System.out.println("");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        System.out.println("");

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

        System.out.println("");

        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()  // [1]
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));                    // [2]

        System.out.println(theResultStringOfBooks);

//        BookDirectory theBookDirectory = new BookDirectory();
//
//        Map<String, Book> theResultMapOfBooks =theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));
//
//        System.out.println("# elements: " + theResultMapOfBooks.size());
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);
        System.out.println("");

        Forum forum = new Forum();

        Map<Integer, ForumUser> resultMapOfForum = forum.getUserList().stream()
                .filter(user -> user.getGender() == 'M')
                .filter(user -> user.getBirthday().isBefore(LocalDate.of(2005, 1, 25)))
                .filter(user -> user.getNumberOfPosts() != 0)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));

        System.out.println("# Amount of forum male user after 20y with any post :" + resultMapOfForum.size());
        resultMapOfForum.entrySet().stream()
                .map(entry -> entry.getKey() + ", " + entry.getValue())
                .forEach(System.out::println);
    }
}