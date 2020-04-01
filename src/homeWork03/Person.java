package homeWork03;

import java.io.IOException;
import java.time.Year;
import helperClasses.DataReader;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    private DataReader reader;

    // this method is correct for person who was born after Christmas
    public void setBirthYear(int birthYear) {
        if (birthYear >= 0)
            this.birthYear = birthYear;
        else
            System.out.println("Birth year is incorrect");
    }

    public Person(DataReader reader) {
        this.DataReader = reader;
    }

    public Person(String firstName, String lastName, DataReader reader) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.DataReader = reader;
    }

    private int getAge() {      // if this.birthYear is unknown, return -1
        int currentYear = Year.now().getValue();
        if (this.birthYear == 0)
            return -1;
        if (this.birthYear == currentYear)
            return 0;
        return currentYear - this.birthYear;
    }

    public void input() {
        try {
            System.out.println("Enter your information below:");
            System.out.print("First name: ");
            this.firstName = reader.readString();
            System.out.print("Last name: ");
            this.lastName = reader.readString();
            System.out.print("Birth year: ");
            this.birthYear = reader.readInt();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void output() {
        String firstName;
        String lastName;
        if (this.firstName == null) {
            firstName = "unknown";
        } else {
            firstName = this.firstName;
        }

        if (this.lastName == null) {
            lastName = "unknown";
        } else {
            lastName = this.lastName;
        }

        int age = getAge();
        String personAge;

        if (getAge() > 0)
            personAge = String.valueOf(age);
        else
            personAge = "unknown";

        System.out.println("Person's information:" +
                "\n\tFirst name: " + firstName +
                "\n\tLast name: " + lastName +
                "\n\tAge: " + personAge + "\n");
    }

    public void changeName(String... firstAndLastName) {
        if (firstAndLastName.length == 1) {
            this.firstName = firstAndLastName[0];
        } else if (firstAndLastName.length == 2) {
            this.firstName = firstAndLastName[0];
            this.lastName = firstAndLastName[1];
        } else {
            System.out.println("Too many values!");
        }

    }

    public static void main(String[] args) {
        DataReader reader = new DataReader();
        Person john = new Person(reader);
        john.output();

        Person mike = new Person("Mike", "Wazowski", reader);
        mike.output();

        Person ihor = new Person(reader);
        ihor.input();
        ihor.output();

        Person you = new Person(reader);
        you.input();
        you.output();

        Person writer = new Person("Samuel", "Clemens", reader);
        writer.changeName("Mark", "Twain");
        writer.setBirthYear(1835);
        writer.output();

        reader.close();
    }
}