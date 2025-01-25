package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int id;
    private final String username;
    private final char gender;
    private final LocalDate birthday;
    private final int numberOfPosts;

    public ForumUser(int id, String username, char gender, LocalDate birthday, int numberOfPosts) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.birthday = birthday;
        this.numberOfPosts = numberOfPosts;
    }
    public int getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public char getGender() {
        return gender;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}