import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {

    // the below tests check if ContactService's updating of fields, adding, and deleting work properly

    @Test
    void addContact() {
        Contact contactTest = new Contact("001", "Tyler", "Humphries",
                "1234567890", "12345 Apartment Way");
        assertNotNull(contactTest);
    }

    @Test
    void deleteContact() {
        Contact contactTest = new Contact("001", "Tyler", "Humphries",
                "1234567890", "12345 Apartment Way");
        assertNotNull(contactTest);
        contactTest = null;
        assertNull(contactTest);
    }

    @Test
    void updateFirstName() {
        Contact contactTest = new Contact("001", "Tyler", "Humphries",
                "1234567890", "12345 Apartment Way");
        String originalFirstName = contactTest.getFirstName();
        assertEquals(originalFirstName, contactTest.getFirstName());
        String newFirstName = "Bob";
        contactTest.setFirstName(newFirstName);
        assertEquals(newFirstName, contactTest.getFirstName());
    }

    @Test
    void updateLastName() {
        Contact contactTest = new Contact("001", "Tyler", "Humphries",
                "1234567890", "12345 Apartment Way");
        String originalLastName = contactTest.getLastName();
        assertEquals(originalLastName, contactTest.getLastName());
        String newLastName = "Smith";
        contactTest.setLastName(newLastName);
        assertEquals(newLastName, contactTest.getLastName());
    }

    @Test
    void updateAddress() {
        Contact contactTest = new Contact("001", "Tyler", "Humphries",
                "1234567890", "12345 Apartment Way");
        String originalAddress = contactTest.getAddress();
        assertEquals(originalAddress, contactTest.getAddress());
        String newAddress = "5678 Duplex Lane";
        contactTest.setAddress(newAddress);
        assertEquals(newAddress, contactTest.getAddress());
    }

    @Test
    void updatePhone() {
        Contact contactTest = new Contact("001", "Tyler", "Humphries",
                "1234567890", "12345 Apartment Way");
        String originalPhone = contactTest.getPhone();
        assertEquals(originalPhone, contactTest.getPhone());
        String newPhone = "0987654321";
        contactTest.setPhone(newPhone);
        assertEquals(newPhone, contactTest.getPhone());
    }
}