import java.util.ArrayList;
import java.util.Scanner;

public class ContactService {
    private Contact contact;                        // creates a new instance of Contact
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Contact> contactList;         // creates a list to store all contact instances

    public ContactService() {
        contactList = new ArrayList<>();            // stores all contact instances in the created list from line 7

    }

    public void addContact(String contactID, String firstName, String lastName, String phone, String address) {
        // creates a new Contact, setting user input to the fields in the object
        System.out.print("Enter new Contact ID: ");
        contactID = scanner.nextLine();
        System.out.print("Enter contact first name: ");
        firstName = scanner.nextLine();
        System.out.print("Enter contact last name: ");
        lastName = scanner.nextLine();
        System.out.print("Enter contact phone number: ");
        phone = scanner.nextLine();
        System.out.print("Enter contact address: ");
        address = scanner.nextLine();
        this.contact = new Contact(contactID, firstName, lastName, phone, address);
    }

    public void deleteContact(String id) {
        // checks the list for the existing instance based on user input, and deletes it if it exists
        Contact instanceToDelete = null;
        for (Contact contact : contactList) {
            if (Contact.getContactID().equals(id)) {
                instanceToDelete = contact;
                break;
            }
        }
        if (instanceToDelete != null) {
            contactList.remove(instanceToDelete);
        }
    }

    public void updateFirstName(String newFirstName) {
        // updates first name
        System.out.print("Please enter a new first name: ");
        newFirstName = scanner.nextLine();
        contact.setFirstName(newFirstName);
    }

    public void updateLastName(String newLastName) {
        // updates last name
        System.out.print("Please enter a new last name: ");
        newLastName = scanner.nextLine();
        contact.setLastName(newLastName);
    }

    public void updateAddress(String newAddress) {
        // updates address
        System.out.print("Please enter a new address: ");
        newAddress = scanner.nextLine();
        contact.setAddress(newAddress);
    }

    public void updatePhone(String newPhone) {
        // updates phone number
        System.out.print("Please enter a new phone number: ");
        newPhone = scanner.nextLine();
        contact.setPhone(newPhone);
    }
}
