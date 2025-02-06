package com.kodilla.exception.index;

import java.util.List;

public class IndexExceptionRunner {
    public static void main(String[] args) {
        VideoCollector videoCollector = new VideoCollector();
        List<String> collection = videoCollector.getCollection();


        try {
            String movie = collection.get(0);
            System.out.println(movie);
            String anotherMovie = collection.get(2);
                System.out.println(anotherMovie);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("There is no movie with this index");
            }
        System.out.println("keep procesing");

//        if (collection.size() > 2) {
//            String movie = collection.get(0);
//            System.out.println(movie);
//
//            String anotherMovie = collection.get(2);
//            System.out.println(anotherMovie);
//        }
    }
}
