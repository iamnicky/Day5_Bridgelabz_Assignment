import java.lang.reflect.Array;
import java.util.ArrayList;

public class AddContacts {

    private ArrayList<Contact> contactsList;

    public AddContacts(ArrayList<Contact> contactsList) {
        this.contactsList = contactsList;
    }

    public ArrayList<Contact> getContactsList() {
        return contactsList;
    }

    public void setContactsList(ArrayList<Contact> contactsList) {
        this.contactsList = contactsList;
    }

    private void addContacts(String fName, String lName,String address, int phone, String city, String state, int zip, String email){
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
}

class Contact{
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