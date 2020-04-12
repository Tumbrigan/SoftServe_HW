package homeWork08;

import helperClasses.DataReader;

import java.io.IOException;

/**
 * Enter surname, name and patronymic on the console as a variable of type String.
 * Output on the console:
 *      - surnames and initials
 *      - name
 *      - name, middle name and last name
 *
 * @author Ihor Kucher
 * @version 1.01
 */

public class PersonalData {
    public static void main(String[] args) {
        try (DataReader reader = new DataReader()) {
            System.out.print("Enter your surname: ");
            String surname = reader.readString();
            System.out.print("Enter your name: ");
            String name = reader.readString();
            System.out.print("Enter your patronymic: ");
            String patronymic = reader.readString();

            String initials = name.substring(0, 1) + "." + patronymic.substring(0, 1) + ".";

            System.out.println(String.format("\nSurname and initials: %1s %2s", surname, initials));
            System.out.println("Name: " + name);
            StringBuilder nameMidNameLastName = new StringBuilder(); // can be replaced with String
            nameMidNameLastName.append(name).append(" ").append(patronymic).append(" ").append(surname);
            System.out.println("Name, middle name and last name: " + nameMidNameLastName.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}