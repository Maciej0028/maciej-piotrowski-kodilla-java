package com.kodilla.patterns.strategy.social;

public sealed class User
        permits Millenials, YGeneration, ZGeneration {
    private String username;
    private SocialPublisher socialPublisher;

    public User(String username) {
        this.username = username;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public String sharePost() {
        return username + " are sharing on " + socialPublisher.share();
    }
}
