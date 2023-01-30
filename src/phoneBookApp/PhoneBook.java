package phoneBookApp;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private static final List <Contact> contacts = new ArrayList<>();


    public static void addContact(String name, String phoneNumber){
        Contact contact = new Contact(name,phoneNumber);
        contacts.add(contact);

    }
    public static void deleteContact(String name){

    }
    public static String findContact (String number, String name){
        return contacts.toString();
    }
    public static String editContact(String number,String name){
        return number;
    }
    public static String messageContact(String number, String name){
        return "i love rice ";
    }
    public static boolean isFavourite(){
        return false;
    }
}


