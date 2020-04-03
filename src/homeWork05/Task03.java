package homeWork05;

/*
Enter 5 integer numbers.
Find:
    - position of second positive number;
    - minimum and its position in the array.

 */

import helperClasses.DataReader;

import java.io.IOException;
import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) throws IOException {
        DataReader reader = new DataReader();
        int amount = 5;
        Task03 task = new Task03();
        int[] arr = task.fillArray(reader, amount);
        int position = task.findPositivePosition(arr, 2);
        System.out.print("Position of second positive number: " + position);

        int minNumber = task.findMinimum(arr)[0];
        int minPosition = task.findMinimum(arr)[1];
        System.out.print("Minimum in the array: " + minNumber);
        System.out.print("Position of minimum in the array: " + minPosition);

        reader.close();
    }

    private int[] fillArray(DataReader reader, int amount) throws IOException {
        int[] numbers = new int[5];
        System.out.println(String.format("Enter %d numbers below:", amount));
        int n = reader.readInt();
        numbers[0] = n;
        while(n > 0) {
            n = reader.readInt();
        }


        for (int i = 0; i < amount; i++) {
            numbers[i] = reader.readInt();
        }
        return numbers;
    }

    // Find position of second positive number
    private int findPositivePosition(int[] arr, int position) throws IOException {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) count++;
            if (count == position) return i;
        }
        return -1;
    }

    // Find position of second positive number
    private int[] findMinimum(int[] arr) throws IOException {
        int[] minAndPosition = new int[2];
        int minimum = arr[0];
        int position = 0;
        for (int n : arr) {
            if (n < minimum) {
                arr[0] = n;
                arr[1] = position;
            }
            position++;
        }
        return minAndPosition;
    }
}