package PhoneBookApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PhoneBook {
    List <Contact> contacts = new ArrayList<>();

    public void addContact(String name, String phoneNumber, String emailAddress) {
        validateContactNumber(phoneNumber);
        validateContactEmail(emailAddress);
        Contact contact = new Contact(name, phoneNumber, emailAddress);
        contacts.add(contact);
    }


    public int amountOfContact(){
        return contacts.size();
    }

    public String findContact(String keyword) {
        String contactView = "";
        for (int i = 0; i < amountOfContact(); i++) {
            if (Objects.equals(keyword, contacts.get(i).getName()) || Objects.equals(keyword, contacts.get(i).getPhoneNumber()) ||
                    Objects.equals(keyword, contacts.get(i).getEmail())) {
                contactView = String.format("""
                        ----------------------------------------------
                        NAME: %s
                        ----------------------------------------------
                        PHONE-NUMBER: %s
                        ----------------------------------------------
                        EMAIL-ADDRESS: %s
                        ----------------------------------------------
                        """, contacts.get(i).getName(), contacts.get(i).getPhoneNumber(), contacts.get(i).getEmail());
            }else if (contacts.isEmpty()){
                throw new IllegalArgumentException("contact does not exist..");
            }else {
                throw new IllegalArgumentException("contact does not exist..");
            }
        }
        return contactView;
    }



    public void validateContactNumber(String number){
        String [] alphabet = {"a","b","c","d","e","f",
                "g","m","h","i","j","k","l",
                "m","n","o","p","q","r","s","t",
                "u","v","w","x","y","z","A","B","C","D","E",
                "F","G","H","I","J","K","L","M","N","O",
                "P","Q","R","S","T","U","V","W","X","Y","Z"};
        for (String letter : alphabet) {
            if (number.contains(letter)) {
                throw new IllegalArgumentException("invalid number");
            }
        }
    }

    public void validateContactEmail(String email){
        if (!email.contains("@gmail.com") && !email.contains("@yahoo.com")){
            throw new IllegalArgumentException("invalid email...");
        }
    }

    public void editContactName(String keyword, String newName) {
        for (Contact contact:contacts) {
            for (int i = 0;i < keyword.length(); i++) {
                if (keyword.equals(contact.getName()) || keyword.equals(contact.getPhoneNumber()) ||
                        keyword.equals(contact.getEmail())) {
                    contact.setName(newName);
                    break;
                }
            }
        }
    }

    public void deleteContact(String keyword) {
        for (Contact contact:contacts) {
            if (!keyword.equals(contact.getName())
                    || !keyword.equals(contact.getPhoneNumber()) ||
                    !keyword.equals(contact.getEmail())) {
                throw new IllegalArgumentException("contact does not exist...");
            }else if (contacts.isEmpty()) {
                throw new IllegalArgumentException("contact does not exist...");
            }else {
                contacts.remove(contact);
            }
        }
    }

    public void editContactNumber(String keyword, String newNumber) {
        validateContactNumber(newNumber);
        for (Contact contact:contacts) {
            for (int i = 0;i < keyword.length(); i++) {
                if (keyword.equals(contact.getName()) || keyword.equals(contact.getPhoneNumber()) ||
                        keyword.equals(contact.getEmail())) {
                    contact.setPhoneNumber(newNumber);
                    break;
                }
            }
        }
    }

    public void editContactEmail(String keyword, String newEmail) {
        validateContactEmail(newEmail);
        for (Contact contact:contacts) {
            for (int i = 0;i < keyword.length(); i++) {
                if (keyword.equals(contact.getName()) || keyword.equals(contact.getPhoneNumber()) ||
                        keyword.equals(contact.getEmail())) {
                    contact.setEmail(newEmail);
                    break;
                }
            }
        }
    }

    public String viewAllContacts(){
        String contactView = null;
        for (Contact contact : contacts) {
            contactView = String.format("""
                    ----------------------------------------------
                    NAME: %s
                    ----------------------------------------------
                    PHONE-NUMBER: %s
                    ----------------------------------------------
                    EMAIL-ADDRESS: %s
                    ----------------------------------------------
                    """, contact.getName(), contact.getPhoneNumber(), contact.getEmail());

        }
        return contactView;
    }
}


