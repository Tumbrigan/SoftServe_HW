package homeWork02;

/*
Create Console Application project in Java.
Add class Person to the project.
Class Person should consist of
three private fields: firstName, lastName and birthYear (the birthday year)
properties for access to these fields
default constructor and constructor with 2 parameters (first and last names)
methods:
getAge() - to calculate the age of person
input() - to input information about person
output() - to output information about person
changeName(String fn, String fn) - to change the first name or/and last name of person
In the method main() create 5 objects of Person type and input information about them.
*/

public class Employee {
    private String name;
    private double rate;
    private int hours;
    private static double totalSum;

    public Employee() {
        this.name = "Stranger";
        this.rate = 10.0;
        this.hours = 160; // 8 hours * 5 days * 4 weeks
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
        this.hours = 160; // 8 hours * 5 days * 4 weeks
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public double getSalary() {
        return Math.round(rate * hours * 100) / 100.0;
    }

    public void changeRate(double rate) {
        if (rate > 0)
            this.rate = rate;
    }

    public double getBonuses() {
        return Math.round(getSalary() * 0.10 * 100) / 100.0;
    }

    @Override
    public String toString() {
        return "[Name: " + name + ";\n " + "]";
    }

    public static void main(String[] args) {

    }
}
