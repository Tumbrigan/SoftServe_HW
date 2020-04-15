package homeWork01;

import helperClasses.DataReader;

import java.io.IOException;

/**
 * Define integer variables a and b. Read values a and b from Console and calculate:
 * a + b
 * a - b
 * a * b
 * a / b.
 * Output obtained results.
 */

public class Task01 {
    public static void main(String[] args) {
        try (DataReader reader = new DataReader()) {
            System.out.print("int a: ");
            int a = reader.readInt();
            System.out.print("int b: ");
            int b = reader.readInt();

            System.out.println(String.format("a + b = %d", (a + b)));
            System.out.println(String.format("a - b = %d", (a - b)));
            System.out.println(String.format("a * b = %d", (a * b)));

            if (b == 0)
                System.out.println("a / b = 0");
            else
                System.out.println(String.format("a / b = %d", (a / b)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}