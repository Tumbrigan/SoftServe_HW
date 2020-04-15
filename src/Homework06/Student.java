package Homework06;

public class Student extends Person  {
    private static final String TYPE_PERSON = "student";

    public Student() {
        System.out.println(TYPE_PERSON);
    }

    @Override
    void print() {
        System.out.println("I am a " + TYPE_PERSON);;
    }
}
