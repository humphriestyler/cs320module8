public class Contact {
    private static String contactID;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    // constructor for Contact
    public Contact (String contactID, String firstName, String lastName, String phone, String address) {
        // checks if the ID is greater than 10
        if (contactID.length() > 10) {
            throw new IllegalArgumentException("ID must be 10 characters or less");
        }
        // checks if the ID is null
        if (contactID == null) {
            throw new IllegalArgumentException("ID cannot be null");
        }
        this.contactID = contactID;

        // checks if the first name is greater than 10
        if (firstName.length() > 10) {
            throw new IllegalArgumentException("First name must be 10 characters or less");
        }
        // checks if the first name is null
        if (firstName == null) {
            throw new IllegalArgumentException("First name cannot be null");
        }
        this.firstName = firstName;

        // checks if the last name is greater than 10
        if (lastName.length() > 10) {
            throw new IllegalArgumentException("Last name must be 10 characters or less");
        }
        // checks if the last name is null
        if (lastName == null) {
            throw new IllegalArgumentException("Last name cannot be null");
        }
        this.lastName = lastName;

        // checks if the phone number is not equal to 10
        if (phone.length() != 10) {
            throw new IllegalArgumentException("Phone number must be exactly 10 characters");
        }
        // checks if the phone number is null
        if (phone == null) {
            throw new IllegalArgumentException("Phone number cannot be null");
        }
        this.phone = phone;

        // checks if the address is greater than 30
        if (address.length() > 30) {
            throw new IllegalArgumentException("Address must be 30 characters or less");
        }
        // checks if the address is null
        if (address == null) {
            throw new IllegalArgumentException("Address cannot be null");
        }
        this.address = address;
    }

    // the below methods are getters and setters for the Contact class, checking for null and length requirements

    public static String getContactID() {
        return contactID;
    }

    public void setContactID(String contactID) {
        if (contactID.length() > 10) {
            throw new IllegalArgumentException("ID must be 10 characters or less");
        }
        if (contactID == null) {
            throw new IllegalArgumentException("ID cannot be null");
        }
        this.contactID = contactID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() > 10) {
            throw new IllegalArgumentException("First name must be 10 characters or less");
        }
        if (firstName == null) {
            throw new IllegalArgumentException("First name cannot be null");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() > 10) {
            throw new IllegalArgumentException("Last name must be 10 characters or less");
        }
        if (lastName.length() > 10) {
            throw new IllegalArgumentException("Last name must be 10 characters or less");
        }
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone.length() != 10) {
            throw new IllegalArgumentException("Phone number must be exactly 10 characters");
        }
        if (phone == null) {
            throw new IllegalArgumentException("Phone number cannot be null");
        }
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address.length() > 30) {
            throw new IllegalArgumentException("Address must be 30 characters or less");
        }
        if (address == null) {
            throw new IllegalArgumentException("Address cannot be null");
        }
        this.address = address;
    }
}
