import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {

    @Test
    public void testAddContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1234567890", "John", "Smith", "1234567890", "123 Main St");
        contactService.addContact(contact);
        assertEquals(contact, contactService.getContact("1234567890"));
    }

    @Test
    public void testDeleteContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1234567890", "John", "Smith", "1234567890", "123 Main St");
        contactService.addContact(contact);
        contactService.deleteContact("1234567890");
        assertNull(contactService.getContact("1234567890"));
    }

    @Test
    public void testUpdateFirstName() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1234567890", "John", "Smith", "1234567890", "123 Main St");
        contactService.addContact(contact);
        contactService.updateFirstName("1234567890", "Jane");
        assertEquals("Jane", contactService.getContact("1234567890").getFirstName());
    }

    @Test
    public void testUpdateLastName() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1234567890", "John", "Smith", "1234567890", "123 Main St");
        contactService.addContact(contact);
        contactService.updateLastName("1234567890", "Doe");
        assertEquals("Doe", contactService.getContact("1234567890").getLastName());
    }

    @Test
    public void testUpdatePhone() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1234567890", "John", "Smith", "1234567890", "123 Main St");
        contactService.addContact(contact);
        contactService.updatePhone("1234567890", "0987654321");
        assertEquals("0987654321", contactService.getContact("1234567890").getPhone());
    }

    @Test
    public void testUpdateAddress() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("1234567890", "John", "Smith", "1234567890", "123 Main St");
        contactService.addContact(contact);
        contactService.updateAddress("1234567890", "456 Oakland St");
        assertEquals("456 Oakland St", contactService.getContact("1234567890").getAddress());
    }
}
