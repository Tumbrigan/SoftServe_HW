package homeWork01;

import helperClasses.DataReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Define String variables name and address.
 * Output question "What is your name?"
 * Read the value name and output next question:
 *      “Where are you live, (name)?".
 * Read address and write whole information.
 */

public class NameAndAddress {
    public static void main(String[] args) {
        try (DataReader reader = new DataReader()) {
            System.out.println("What is your name?");
            String name = reader.readString();
            System.out.println("Where are do you live, " + name + "?");
            String address = reader.readString();
            System.out.println("Your name is: " + name + "\nYour address: " + address);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}