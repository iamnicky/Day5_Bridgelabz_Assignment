import java.util.Scanner;

public class AddressBookSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");

        ContactsManager contactsManager = new ContactsManager();

        //taking the input for adding contacts
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select the option:\n1. Add Contacts");
        int optionSelected = sc.nextInt();
        switch (optionSelected) {
            case 1:
                System.out.println("Please enter the contact details");
                System.out.println("Firstname: ");
                String fName = sc.nextLine();
                System.out.println("Lastname: ");
                String lName = sc.nextLine();
                System.out.println("Email: ");
                String email = sc.nextLine();
                System.out.println("PhoneNumber: ");
                int phone = sc.nextInt();
                System.out.println("Address: ");
                String address = sc.nextLine();
                System.out.println("City: ");
                String city = sc.nextLine();
                System.out.println("State: ");
                String state = sc.nextLine();
                System.out.println("ZIP: ");
                int zip = sc.nextInt();
                contactsManager.addContacts("fName", lName, address, phone, city, state, zip, email);
                break;
        }

    }


}
