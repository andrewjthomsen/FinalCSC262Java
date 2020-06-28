package P2;

public class MyDate {
    int year;
    int month;
    int day;

    // constructor
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return Integer.toString(year) + "-" + Integer.toString(month) +
                "-" + Integer.toString(day);
    }
}
