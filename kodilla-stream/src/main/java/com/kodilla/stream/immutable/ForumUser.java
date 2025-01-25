package com.kodilla.stream.immutable;

import org.w3c.dom.ls.LSOutput;

public final class ForumUser {
    private final String username;
    private final String realname;

    public ForumUser(String username, String realName) {
        this.username = username;
        this.realname = realName;
    }

    public String getRealname() {
        return realname;
    }

    public String getUsername() {
        return username;
    }
//    public void modifyUsername(String user) {
//        username = user;
//    }Nie można więc jest ok
}
