package Homework06;

/*
Create interface Animal with methods voice() and feed().
Create two classes Cat and Dog, which implement this interface.
Create array of Animal and add some Cats and Dogs to it.
Call voice() and feed() method for all of it
*/

public class AnimalsArray {

    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Dog(), new Dog()};

        for (Animal animal: animals) {
            animal.voice();
            animal.feed();
            System.out.println();
        }
    }
}
