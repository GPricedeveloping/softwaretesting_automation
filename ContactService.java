import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private final Map<String, Contact> contacts;

    // Constructor to initialize the ContactService with an empty contact map
    public ContactService() {
        this.contacts = new HashMap<>();
    }

    // Method to add a new contact to the contact map
    public void addContact(Contact contact) {
        contacts.put(contact.getContactID(), contact);
    }

    // Method to delete a contact from the contact map using its ID
    public void deleteContact(String contactID) {
        contacts.remove(contactID);
    }

    // Methods to update the fields of a contact given its ID
    public void updateFirstName(String contactID, String newFirstName) {
        Contact contact = contacts.get(contactID);
        if (contact != null) {
            contact.setFirstName(newFirstName);
        }
    }

    public void updateLastName(String contactID, String newLastName) {
        Contact contact = contacts.get(contactID);
        if (contact != null) {
            contact.setLastName(newLastName);
        }
    }

    public void updatePhone(String contactID, String newPhone) {
        Contact contact = contacts.get(contactID);
        if (contact != null) {
            contact.setPhone(newPhone);
        }
    }

    public void updateAddress(String contactID, String newAddress) {
        Contact contact = contacts.get(contactID);
        if (contact != null) {
            contact.setAddress(newAddress);
        }
    }

    // Method to retrieve a contact from the contact map using its ID
    public Contact getContact(String contactID) {
        return contacts.get(contactID);
    }
}
