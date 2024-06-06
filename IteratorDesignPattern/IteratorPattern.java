package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.Arrays;

public class IteratorPattern {
    public static void main(String[] args) {
        Spammer spammer= new Spammer(new Facebook(
        Arrays.asList(
            new Profile("name1", "email1", "friend:email2","email3","coworker:email4"),
            new Profile("name2", "email2", "friend:email1","coworker:email4"),
            new Profile("name3", "email3", "coworker:email1","coworker:email2"),
            new Profile("name4", "email4", "coworker:email1","coworker:email2")
        )
        ));
        spammer.spamFriends("email1");
        spammer.spamCoworkers("email2");
    }
}
