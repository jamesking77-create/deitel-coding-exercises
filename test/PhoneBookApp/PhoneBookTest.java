package PhoneBookApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PhoneBookTest {
    private PhoneBook phoneBook;


    @BeforeEach
    public  void testThatPhoneBookExist(){
        phoneBook = new PhoneBook();
        phoneBook.addContact("james", "09061927443","jamesasuelimen77@gmail.com");
        phoneBook.addContact("king", "08161999999","asuelimen77@gmail.com");
        phoneBook.addContact("money2", "08161927433","money77@gmail.com");


    }

    @Test
    public void testThatPhoneBookCanAddContact(){
        assertEquals(3, phoneBook.amountOfContact());
    }

    @Test
    public void testThatPhoneCanFindContact(){
        phoneBook.findContact("king");
        assertEquals("""
                ----------------------------------------------
                NAME: king
                ----------------------------------------------
                PHONE-NUMBER: 08161999999
                ----------------------------------------------
                EMAIL-ADDRESS: asuelimen77@gmail.com
                ----------------------------------------------
                """,phoneBook.findContact("king"));
    }

    @Test
    public  void testThatContactNumberCanBeValidated(){
        assertThrows(IllegalArgumentException.class,()-> phoneBook.validateContactNumber("0A8161927443"));
    }
    @Test
    public void testThatContactEmailCanBeValidated(){
        assertThrows(IllegalArgumentException.class, ()-> phoneBook.validateContactEmail("jmesasuelimengmail.com"));
    }
    @Test
    public void testThatContactNameCanBeEdited(){
        phoneBook.editContactName("08161927433","money44");
        assertEquals("money44",phoneBook.contacts.get(2).getName());
    }
    @Test
    public void testThatContactNumberCanBeEdited(){
        phoneBook.editContactNumber("08161927433","09161927444");
        assertEquals("09161927444", phoneBook.contacts.get(2).getPhoneNumber());
    }
    @Test
    public void testThatContactEmailCanBeEdited(){
        phoneBook.editContactEmail("08161927433","9kicks@yahoo.com");
        assertEquals("9kicks@yahoo.com", phoneBook.contacts.get(2).getEmail());
    }
    @Test
    public void testThatContactCanBeDeleted(){
        phoneBook.deleteContact("james");
        assertEquals(2, phoneBook.amountOfContact());
    }


}
