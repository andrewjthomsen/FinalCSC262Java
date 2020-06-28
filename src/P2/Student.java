package P2;

public class Student extends Person {
    private String status;

    // constructor
    public Student(String name, String address, String phoneNumber, String eMailAddress, String status) {
        super(name, address, phoneNumber, eMailAddress);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student Class " + super.toString();
    }
}
