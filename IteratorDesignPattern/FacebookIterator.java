package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String email;
    private String type;
    private List<String> emails = new ArrayList<String>();
    private List<Profile> profiles = new ArrayList<Profile>();
    private int currentPosition = 0;

    public FacebookIterator(Facebook facebook, String email, String type) {
        this.facebook = facebook;
        this.email = email;
        this.type = type;
    }

    private void lazyLoad() {
        if (emails.size() == 0) {
            Profile p = facebook.getProfile(email);
            emails = p.getContacts(type);
            for (String contactEmail : emails) {
                profiles.add(facebook.getProfile(contactEmail));
            }
        }

    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < emails.size();
    }

    @Override
    public Profile getNext() {
        if (!hasNext()){
            return null;
        }
        Profile p = profiles.get(currentPosition);
        currentPosition++;
        return p;
    }

    @Override
    public void reset() {
        currentPosition = 0;

    }

}
