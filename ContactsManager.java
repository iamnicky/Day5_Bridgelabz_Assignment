import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactsManager {

    private ArrayList<Contact> contactsList;

    public ContactsManager() {
        this.contactsList = new ArrayList<>();
    }

    public ArrayList<Contact> getContactsList() {
        return contactsList;
    }

    public void setContactsList(ArrayList<Contact> contactsList) {
        this.contactsList = contactsList;
    }

    public void addContacts(String fName, String lName, String address, int phone, String city, String state, int zip, String email) {
        contactsList.add(
                new Contact(
                        fName,
                        lName,
                        phone,
                        email,
                        address,
                        city,
                        state,
                        zip
                )
        );
        System.out.println("Successfully Added to contacts");
    }

    public void editContact(String fName) {
        for (int index = 0; index < contactsList.size(); index++) {
            if (contactsList.get(index).getFirstName().equals(fName)) {
                //contact is present which user want to edit
                Scanner sc = new Scanner(System.in);
                System.out.println("Please enter the updated contact details");
                System.out.println("Firstname: ");
                String firstName = sc.nextLine();
                System.out.println("Lastname: ");
                String lastName = sc.nextLine();
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
                contactsList.set(index, new Contact(
                        firstName,
                        lastName,
                        phone,
                        email,
                        address,
                        city,
                        state,
                        zip
                ));

                System.out.println("The contact against name "+fName+ " has been updated!");
                return;
            }
        }
        System.out.println("The contact you are looking for is  not present");
    }

    public void deleteContact(String name) {
        for (int index = 0; index < contactsList.size();index++){
            if(contactsList.get(index).getFirstName().equals(name)){
                contactsList.remove(index);
                return;
            }
        }

        System.out.println("NO contact with the entered name was found!");
    }
}

class Contact {
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String email;
    private String address;
    private String city;
    private String state;
    private int zip;

    public Contact(String firstName, String lastName, int phoneNumber, String email, String address, String city, String state, int zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}