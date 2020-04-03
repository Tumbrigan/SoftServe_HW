package homeWork05;

/*
Enter 10 integer numbers.
Calculate the sum of first 5 elements if they are positive
or product of last 5 element in the other case.
 */

import helperClasses.DataReader;

import java.io.IOException;

public class Task02 {
    public static void main(String[] args) throws IOException {
        DataReader reader = new DataReader();
        int amount = 10;
        int[] numbers = new int[amount];
        System.out.println("Enter 10 numbers below:");
        for (int i = 0; i < amount; i++) {
            numbers[i] = reader.readInt();
        }

        int sum = 0;
        boolean firstHalfIsPositive = true;

        for (int i = 0; i < amount / 2; i++) {
            if (numbers[i] < 0) {
                firstHalfIsPositive = false;
                break;
            } else {
                sum += numbers[i];
            }
        }

        if (firstHalfIsPositive) {
            System.out.println("Sum: " + sum);
        } else {
            long product = numbers[amount / 2];
            for (int i = (amount / 2 + 1); i < amount; i++) { // it works if the amount of numbers is even
                product *= numbers[i];
            }
            System.out.println("Product: " + product);
        }
    }
}