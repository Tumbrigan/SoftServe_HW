package Homework06;

/*
Create interface Animal with methods voice() and feed().
Create two classes Cat and Dog, which implement this interface.
Create array of Animal and add some Cats and Dogs to it.
Call voice() and feed() method for all of it
*/

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Some dog says \"Woof!\"");
    }

    @Override
    public void feed() {
        System.out.println("Some dog eats meat too");
    }
}
