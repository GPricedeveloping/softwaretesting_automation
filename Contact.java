public class Contact {
    private final String contactID;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    // Constructor to initialize contact fields
    public Contact(String contactID, String firstName, String lastName, String phone, String address) {
        if (contactID == null || contactID.length() > 10) {
            throw new IllegalArgumentException("Invalid contact ID");
        }
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name");
        }
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }
        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    // Getter methods to access contact fields
    public String getContactID() {
        return contactID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone == null || phone.length() != 10) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }
        this.address = address;
    }
}
