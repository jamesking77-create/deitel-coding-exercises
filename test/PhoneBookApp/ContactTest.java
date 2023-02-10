package PhoneBookApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactTest {
    public Contact contact;
    @BeforeEach
    public void testThatContactExist(){
        contact = new Contact("james", "09084456732", "jamesasuelimen77@gmail.com");
    }
    @Test
    public void testThatContactNameCanBeUpdated(){
       contact.setName("king");
       assertEquals("king",contact.getName());
    }
    @Test
    public void testThatContactNumberCanBeUpdated(){
        contact.setPhoneNumber("08099657432");
        assertEquals("08099657432", contact.getPhoneNumber());
    }
    @Test
    public void testThatEmailCanBeUpdated(){
        contact.setEmail("jamesasuelimen77@gmail.com");
        assertEquals("jamesasuelimen77@gmail.com",contact.getEmail());
    }

}
