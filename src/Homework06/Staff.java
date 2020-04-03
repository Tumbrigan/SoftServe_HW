package Homework06;

public abstract class Staff extends Person {
    @Override
    void print() {
        System.out.println("I am a staff");
    }

    abstract void salary();
}
