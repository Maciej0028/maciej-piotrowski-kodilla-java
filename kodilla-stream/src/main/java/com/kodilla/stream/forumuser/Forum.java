package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.*;

public class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();
    public Forum() {
        forumUsers.add(new ForumUser(6363, "Raomi", 'F', LocalDate.of(1999, 5, 29), 37));
        forumUsers.add(new ForumUser(3453, "Cloe", 'F', LocalDate.of(1982, 12, 19), 0));
        forumUsers.add(new ForumUser(4234, "Olaf", 'M', LocalDate.of(2002, 9, 8), 12));
        forumUsers.add(new ForumUser(7654, "Olek", 'M', LocalDate.of(2010, 7, 3), 0));
        forumUsers.add(new ForumUser(6542, "Nathan", 'M', LocalDate.of(2000, 4, 21), 56));
        forumUsers.add(new ForumUser(8765, "Ginger", 'M', LocalDate.of(1994, 1, 22), 123));
        forumUsers.add(new ForumUser(4444, "Alf", 'M', LocalDate.of(2005, 1, 24), 12));
        forumUsers.add(new ForumUser(5555, "Anna", 'F', LocalDate.of(2002, 12, 3), 0));
        forumUsers.add(new ForumUser(6666, "Henry", 'M', LocalDate.of(1997, 8, 11), 111));
        forumUsers.add(new ForumUser(7777, "Medic", 'M', LocalDate.of(1999, 3, 12), 1));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsers);
    }
}
