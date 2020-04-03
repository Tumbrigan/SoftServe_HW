package Homework06;

public class Teacher extends Staff {
    private static final String TYPE_PERSON = "teacher";
    private int salary;

    public Teacher() {
        System.out.println(TYPE_PERSON);
        this.salary = (int)(Math.random() * 80) * 100 + 7000;
    }

    @Override
    void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }

    @Override
    void salary() {
        System.out.println(
                String.format("I'm a %s and my salary is %d$", TYPE_PERSON, salary));
    }
}
