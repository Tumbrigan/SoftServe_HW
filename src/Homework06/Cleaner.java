package Homework06;

public class Cleaner extends Staff {
    private static final String TYPE_PERSON = "cleaner";
    private int salary;

    public Cleaner() {
        System.out.println(TYPE_PERSON);
        this.salary = (int)(Math.random() * 50) * 100 + 5000;
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
