package homeWork08;

import helperClasses.DataReader;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
 * Using regular expressions implement checking the user name for validity.
 * Input five names in the main method.
 * Output a message to the console of the validation of each of the entered names.
 */

public class UserName {
    public static void main(String[] args) {
        String[] names = new String[5];
        System.out.println("Enter five names");
        fillArray(names);
        validateAndPrint(names);
    }

    public static void fillArray(String[] names) {
        System.out.println();
        try (DataReader reader = new DataReader()) {
            for (int i = 0; i < names.length; i++) {
                System.out.print("Enter name: ");
                names[i] = reader.readString();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void validateAndPrint(String[] names) {
        for (String s : names) {
            if (checkName(s))
                System.out.println(s + " - correct");
            else
                System.out.println(s + " - incorrect");
        }
    }

    public static boolean checkName(String name) {
        Pattern p = Pattern.compile("[A-Za-z0-9_]{3,15}");
        Matcher m = p.matcher(name);
        return m.matches();
    }
}