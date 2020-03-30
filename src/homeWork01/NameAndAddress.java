package homeWork01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameAndAddress {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("What is your name?");
            String name = reader.readLine();
            System.out.println("Where are do you live, " + name + "?");
            String address = reader.readLine();
            int i = 100;
            byte b = (byte) i;
            System.out.println("Your name is: " + name + "\nYour address: " + address);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
