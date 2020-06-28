package P2;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String eMailAddress;

    // constructor
    public Person(String name, String address, String phoneNumber, String eMailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.eMailAddress = eMailAddress;
    }
    //setters/getters

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String geteMailAddress() {
        return eMailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void seteMailAddress(String eMailAddress) {
        this.eMailAddress = eMailAddress;
    }

    // ******* You cannot create a abstract method inside of a non-abstract class! *****\\\\\\\
    @Override
    public String toString() {
        return "Name: " + name;
    }
}
