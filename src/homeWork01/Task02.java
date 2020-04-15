package homeWork01;

import helperClasses.DataReader;

import java.io.IOException;

/**
 * Output question “How are you?“.
 * Define string variable answer.
 * Read the value answer and output: “You are (answer)".
 */

public class Task02 {
    public static void main(String[] args) {
        System.out.println("How are you?");
        try (DataReader reader = new DataReader()) {
            String answer = reader.readString();
            System.out.println("You are " + answer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
