package mobile;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        Contact f = new Contact("tim","181888424");
        Contact s = new Contact("john","181888425");
        contacts.add(f);
        contacts.add(s);
        for(int i=0; i< contacts.size(); i++) {
            System.out.println(contacts.get(i).getName());
        }
    }
}
class Contact {
    private String name;
    private String phoneNumber;
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}
