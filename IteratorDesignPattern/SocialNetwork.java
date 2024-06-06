package IteratorDesignPattern;

public interface SocialNetwork {
    public ProfileIterator createFriendsIterator(String email);
    public ProfileIterator createCoworkersIterator(String email);
}
