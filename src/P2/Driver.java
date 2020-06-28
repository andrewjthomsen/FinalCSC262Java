package P2;

public class Driver {
    public static void main(String[] args) {
        // Although abstract classes can have both concrete and abstract methods, an abstract class can't be instantiated
        // Because you asked us to instantiate a person object, I'm assuming asking us to create the abstract tostring method was a typo
        Person p1 = new Person("Beth", "1234 RiverRun Way", "123-4321", "beth123abc@gmail.com");
        System.out.println(p1);
        Student s1 = new Student("Jill", "4435 Oak Valley Lane",
                "123-889-9111", "Jill911@gmail.com", "Senior");
        System.out.println(s1);
        Employee e1 = new Employee("Heather", "778 Cool Person Way",
                "799-9889", "HeatherTerrible@outlook.com", "H1",
                12223, new MyDate(2020, 1, 2));
        System.out.println(e1);
        Faculty f1 = new Faculty("Hank", "776 Not Cool Person Way",
                "799-9889", "franlthefunny@outlook.com", "HR",
                12223, new MyDate(2001, 3, 22), "10am-10pm", "Nurse");
        System.out.println(f1);
        Staff staff1 = new Staff("Helga", "778 Cool Person Way",
                "222-9889", "Helgilizard@outlook.com", "H2",
                12223, new MyDate(2005, 8, 29), "9am-1pm", "Teacher", "Vice principal");
        System.out.println(staff1);
    }
}
