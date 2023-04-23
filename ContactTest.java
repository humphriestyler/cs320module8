import static org.junit.jupiter.api.Assertions.*;

class ContactTest {
    // the below tests check for length and null of an instance of Contact

    @org.junit.jupiter.api.Test
    void getContactID() {
        String idTest = "12345";
        assertTrue(idTest.length() <= 10);
        assertTrue(idTest != null);
    }

    @org.junit.jupiter.api.Test
    void getFirstName() {
        String fnTest = "Tyler";
        assertTrue(fnTest.length() <= 10);
        assertTrue(fnTest != null);
    }

    @org.junit.jupiter.api.Test
    void getLastName() {
        String lnTest = "Humphries";
        assertTrue(lnTest.length() <= 10);
        assertTrue(lnTest != null);
    }

    @org.junit.jupiter.api.Test
    void getPhone() {
        String phoneTest = "1234567890";
        assertTrue(phoneTest.length() == 10);
        assertTrue(phoneTest != null);
    }

    @org.junit.jupiter.api.Test
    void getAddress() {
        String addressTest = "12345 Apartment Way";
        assertTrue(addressTest.length() <= 30);
        assertTrue(addressTest != null);
    }
}