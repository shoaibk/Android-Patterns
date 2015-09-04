package ca.shoaib.contactrecyclerview;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String name;
    private String email;
    private static List<Contact> mContacts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static List<Contact> getContacts() {
        mContacts = new ArrayList<>();
        mContacts.add(new Contact("Aaron Spectre", "aaron@gmail.com"));
        mContacts.add(new Contact("Agatha Cristie", "agatha@gmail.com"));
        mContacts.add(new Contact("Bashir Morshed", "bashir@gmail.com"));
        mContacts.add(new Contact("Bahar Chamak", "bahar@gmail.com"));
        mContacts.add(new Contact("Cynthia August", "cynthia@gmail.com"));
        mContacts.add(new Contact("Dolly Zimmermann", "dolly@gmail.com"));
        mContacts.add(new Contact("Emily Woods", "emily@gmail.com"));
        mContacts.add(new Contact("Fiona Hillegard", "fiona@gmail.com"));
        mContacts.add(new Contact("Gerald Hurdle", "Gerald@gmail.com"));
        mContacts.add(new Contact("Harold Robins", "harold@gmail.com"));
        return mContacts;
    }
}
