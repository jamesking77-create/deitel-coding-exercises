package phoneBookApp;

import java.util.InputMismatchException;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        validateNumber(phoneNumber);
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        validateNumber(phoneNumber);
        this.phoneNumber = phoneNumber;
    }
    public static void validateNumber(String number){
        for (int i = 0; i < number.length() ; i++) {
            if (number.contains(" ") || i > 11){
                throw new InputMismatchException("Invalid Number");
            }
        }


    }
}
