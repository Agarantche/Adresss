import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an address book
        AddressBook addressBook = new AddressBook();

        // Prompt the user to add a new contact
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter email:");
        String email = scanner.nextLine();
        System.out.println("Enter address:");
        String address = scanner.nextLine();

        // Create a new contact and add it to the address book
        ContactInformation contact = new ContactInformation(name, email, address);
        addressBook.addContact(contact);

        // Search for the new contact's email address
        String searchName = contact.getName();
        String searchEmail = addressBook.getEmail(searchName);
        if (searchEmail != null) {
            System.out.println(searchName + "'s email address is " + searchEmail);
        } else {
            System.out.println("Couldn't find " + searchName + "'s email address");
        }

        // Close the scanner to free up resources
        scanner.close();
    }
}
