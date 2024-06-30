import org.junit.Test;
import static org.junit.Assert.*;

public class ContactTest {

    @Test
    public void testContactCreation() {
        Contact contact = new Contact("1234567890", "John", "Smith", "1234567890", "123 Main St");
        assertNotNull(contact);
        assertEquals("1234567890", contact.getContactID());
        assertEquals("John", contact.getFirstName());
        assertEquals("Smith", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testContactIdTooLong() {
        new Contact("12345678901", "John", "Smith", "1234567890", "123 Main St");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testContactIdNull() {
        new Contact(null, "John", "Smith", "1234567890", "123 Main St");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFirstNameTooLong() {
        new Contact("1234567890", "Jonathanathan", "Smith", "1234567890", "123 Main St");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFirstNameNull() {
        new Contact("1234567890", null, "Smith", "1234567890", "123 Main St");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLastNameTooLong() {
        new Contact("1234567890", "John", "Smithsonian", "1234567890", "123 Main St");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLastNameNull() {
        new Contact("1234567890", "John", null, "1234567890", "123 Main St");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPhoneNot10Digits() {
        new Contact("1234567890", "John", "Smith", "12345", "123 Main St");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPhoneNull() {
        new Contact("1234567890", "John", "Smith", null, "123 Main St");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddressTooLong() {
        new Contact("1234567890", "John", "Smith", "1234567890", "123 Main Street, Springfield, IL 62704");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddressNull() {
        new Contact("1234567890", "John", "Smith", "1234567890", null);
    }
}
