package IteratorDesignPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Profile {
    private String name;
    private String email;
    private Map<String, List<String>> contacts=new HashMap<String,List<String>>();

    public Profile(String name, String email, String... contacts){
        this.name=name;
        this.email=email;
        for (String contact : contacts) {
            String contactType="friend";
            String contactEmail;
            String[] c= contact.split(":");
            if(c.length==1)
            contactEmail=c[0];
            else{
                contactType=c[0];
                contactEmail=c[1];
            }

            if(this.contacts.get(contactType)==null){
                this.contacts.put(contactType, new ArrayList<String>());
            }
            this.contacts.get(contactType).add(contactEmail);
            
        }
    }

    public List<String> getContacts(String type){
        return contacts.get(type);
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
}
