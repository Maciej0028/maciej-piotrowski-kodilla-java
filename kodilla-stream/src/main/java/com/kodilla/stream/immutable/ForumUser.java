package com.kodilla.stream.immutable;

public final class ForumUser {
    private final String username;
    private final String realName;

    public ForumUser(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public String getUsername() {
        return username;
    }
    /*public void modifyUsername(String user) {
        username = user;
    }Nie można więc jest ok*/
}
