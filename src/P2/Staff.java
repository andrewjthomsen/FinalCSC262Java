package P2;

public class Staff extends Employee {
    String title;

    // constructor
    public Staff(String name, String address, String phoneNumber, String eMailAddress,
                 String office, double salary, MyDate dateHired, String officeHours, String rank, String title) {
        super(name, address, phoneNumber, eMailAddress, office, salary, dateHired);
        this.title = title;
    }

    // setters/getters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff Class " + super.toString();
    }
}
