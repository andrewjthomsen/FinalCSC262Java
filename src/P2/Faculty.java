package P2;

public class Faculty extends Employee {
    String officeHours;
    String rank;

    //constructor
    public Faculty(String name, String address, String phoneNumber, String eMailAddress,
                   String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, eMailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;

    }
    // setters/getters

    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty Class " + super.toString();
    }
}
