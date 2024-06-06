package IteratorDesignPattern;

public class Spammer {
    SocialNetwork network;

    Spammer(SocialNetwork network) {
        this.network = network;
    }

    public void spamFriends(String email) {
        ProfileIterator p = network.createFriendsIterator(email);
        while(p.hasNext()) {
            sendMessage(p.getNext(),email,"friend");
        }

    }

    public void spamCoworkers(String email) {
        ProfileIterator p = network.createCoworkersIterator(email);
        while(p.hasNext()) {
            
            sendMessage(p.getNext(),email,"coworker");

        }

    }

    private void sendMessage(Profile profile, String email, String type) {
        System.out.println(String.format("spamming %s of %s : name:%s , email:%s", type,email,profile.getName(), profile.getEmail()));
    }

}
