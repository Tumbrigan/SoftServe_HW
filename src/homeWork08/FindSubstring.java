package homeWork08;

import helperClasses.DataReader;

import java.io.IOException;

/**
 * @author Ihor Kucher
 * @version 1.02
 *
 * Enter the two variables of type String.
 * Determine whether the first variable substring second.
 * For example, if you typed «IT» and «IT Academy» you must receive true.
 */

public class FindSubstring {
    public static void main(String[] args) {
        try (DataReader reader = new DataReader()) {
            System.out.print("Enter the first string: ");
            String firstS = reader.readString();
            System.out.print("Enter the second string: ");
            String secondS = reader.readString();

            System.out.println("Is the first string a substring of the second string?");
            System.out.println(secondS.contains(firstS));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}