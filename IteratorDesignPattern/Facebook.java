package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements SocialNetwork {
    private List<Profile> profiles;

    public Facebook(List<Profile> cache) {
        if (cache == null)
            profiles = new ArrayList<Profile>();
        else {
            profiles = cache;
        }

    }

    public Profile getProfile(String email) {
        
        for (Profile profile : profiles) {
            
            if (profile.getEmail().equals(email))
            {
                return profile;
            }
                
        }
        return null;
    }

    public List<String> getProfileContacts(String email, String type) {
        Profile profile = getProfile(email);
        if (profile != null)
            return profile.getContacts(type);
        else
            return null;
    }

    @Override
    public ProfileIterator createCoworkersIterator(String email) {
        return new FacebookIterator(this, email, "coworker");
    }

    @Override
    public ProfileIterator createFriendsIterator(String email) {
        return new FacebookIterator(this, email, "friend");
    }
}
