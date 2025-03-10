package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //Given
        User adam = new Millenials("Adam");
        User max = new YGeneration("Max");
        User alex = new ZGeneration("Alex");
        //When
        System.out.println(adam.sharePost());
        System.out.println(max.sharePost());
        System.out.println(alex.sharePost());

        //Then
        assertEquals("Adam are sharing on Facebook", adam.sharePost());
        assertEquals("Max are sharing on Twitter", max.sharePost());
        assertEquals("Alex are sharing on Snapchat", alex.sharePost());
    }

    @Test
    public void testIndividualSharingStrategy() {

        //Given
        User adam = new Millenials("Adam");
        User max = new YGeneration("Max");
        User alex = new ZGeneration("Alex");

        //When
        adam.setSocialPublisher(new SnapchatPublisher());
        max.setSocialPublisher(new FacebookPublisher());
        alex.setSocialPublisher(new TwitterPublisher());
        System.out.println(adam.sharePost());
        System.out.println(max.sharePost());
        System.out.println(alex.sharePost());

        //Then
        assertEquals("Adam are sharing on Snapchat", adam.sharePost());
        assertEquals("Max are sharing on Facebook", max.sharePost());
        assertEquals("Alex are sharing on Twitter", alex.sharePost());
    }
}
