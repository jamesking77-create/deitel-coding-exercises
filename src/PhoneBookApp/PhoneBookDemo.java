package PhoneBookApp;

import javax.swing.*;

public class PhoneBookDemo {
    public static  PhoneBook phoneBook = new PhoneBook();
    public static void main(String[] args) {

        phoneBookMenu();
    }

    private static void phoneBookMenu() {
        String phoneBookPage = """
                -----------------------------------
                1 -> ( ADD CONTACT )
                -----------------------------------
                2 -> ( FIND CONTACT )
                -----------------------------------
                3 -> ( EDIT CONTACT )
                -----------------------------------
                4 -> ( COUNT CONTACT )
                -----------------------------------
                5 -> ( VIEW CONTACT LIST )
                -----------------------------------
                6 -> ( DELETE CONTACT )
                -----------------------------------
                7 -> ( EXIT PHONEBOOK )
                -----------------------------------
                """;
        String menu = input(phoneBookPage);
        switch (menu){
            case "1" -> addContact();
            case "2" -> findContact();
            case "3" -> editContact();
            case "4" -> countContact();
            case "5" -> viewAllContactInfo();
            case "6" -> deleteContact();
            case "7" -> exitPhonebook();
            default -> {
                display("i see you fola ,good luck trying to break me");
                phoneBookMenu();
            }
        }
    }

    private static void viewAllContactInfo() {
        try {
            display(phoneBook.viewAllContacts());
            phoneBookMenu();
        }catch (IllegalArgumentException e){
            display(e.getMessage());
        }
    }

    private static void exitPhonebook() {
        System.exit(0);
    }

    private static void countContact() {
        String numberOfContact = String.format("""
                -----------------------------------------
                you have %d contact in your contact list
                -----------------------------------------
                """, phoneBook.amountOfContact());
        display(numberOfContact);
        phoneBookMenu();
    }

    private static void deleteContact() {
        try {
            String keyword = input("Search for contact to ( DELETE )");
            display(phoneBook.findContact(keyword));
            phoneBook.deleteContact(keyword);
            display("contact deleted");
        }catch (IllegalArgumentException error){
            display(error.getMessage());
            phoneBookMenu();
        }
        phoneBookMenu();

    }


    private static void editContact() {
        try{
        String keyword = input("Search for contact");
      String editMenu =   input("""
                ------------------------
                1 -> EDIT CONTACT NAME
                2 -> EDIT PHONE NUMBER
                3 -> EDIT EMAIL ADDRESS
                 -----------------------
                """);
      switch (editMenu.charAt(0)){

          case '1' -> {
              try{
                  display(phoneBook.findContact(keyword));
                  String newName = input("Edit contact name");
                  phoneBook.editContactName(keyword, newName);
                  display(phoneBook.findContact(newName));
                  display("contact name updated successfully...");
              }catch (IllegalArgumentException error){
                  display(error.getMessage());
              }
              phoneBookMenu();
          }
          case  '2' ->{
              try{
                  display(phoneBook.findContact(keyword));
                  String newNumber = input("Edit Contact Number");
                  phoneBook.editContactNumber(keyword, newNumber);
                  display(phoneBook.findContact(newNumber));
                  display("contact number updated successfully...");
              }catch (IllegalArgumentException error){
                  display(error.getMessage());
              }
              phoneBookMenu();
          }
          case '3' -> {
              try{
                  display(phoneBook.findContact(keyword));
                  String newEmail = input("Edit Contact Email");
                  phoneBook.editContactEmail(keyword, newEmail);
                  display(phoneBook.findContact(newEmail));
                  display("contact email updated successfully...");
              }catch (IllegalArgumentException error){
                  display(error.getMessage());
              }
              phoneBookMenu();
          }
          default -> phoneBookMenu();
      }
    }catch (IllegalArgumentException e){
            display(e.getMessage());
        }
    }

    private static void findContact() {
        try{
            String searchContact = input("Search for contact");
            display(phoneBook.findContact(searchContact));
        }catch (IllegalArgumentException error){
            display(error.getMessage());
        }
        phoneBookMenu();
    }

    private static void addContact() {
        try {
            String name = input("Enter contact name");
            String number = input("Enter contact number");
            String email = input("Enter contact email address");
            phoneBook.addContact(name, number, email);
            display("contact added successfully...");
        }catch (IllegalArgumentException error){
            display(error.getMessage());
        }
        phoneBookMenu();
    }

    private static String input(String prompt){
        return JOptionPane.showInputDialog(prompt);
//		display(prompt);
//		return keyboardInputCollector.nextLine();
    }

    private static void display(String prompt){
        JOptionPane.showMessageDialog(null, prompt);
//		System.out.println(prompt);
    }
}
