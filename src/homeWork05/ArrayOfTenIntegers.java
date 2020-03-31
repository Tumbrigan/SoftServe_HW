package homeWork05;

import java.util.Arrays;

public class ArrayOfTenIntegers {

    public static void main(String[] args) {
        int[] arr = createArray(10);
        fillArray(arr, -100, 200);
        System.out.println(Arrays.toString(arr));
        System.out.println("Max value: " + findMaxValue(arr));
        System.out.println("The sum of positive numbers in the array: " +
                sumOfPositiveNumbers(arr));
        int amountOfNegativeNumbers = amountOfNegativeNumbers(arr); // int value has the same name as method has
        System.out.println("The amount of negative numbers in the array: " +
                amountOfNegativeNumbers);
        System.out.println("What values there are more? - " + whatValuesThereAreMore(arr, amountOfNegativeNumbers));
    }

    private static int[] createArray(int n) {
        return new int[n];
    }

    private static void fillArray(int[] arr, int minValue, int maxValue) {
        minValue = Math.abs(minValue);
        maxValue = Math.abs(maxValue);
        int sum = minValue + maxValue;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * sum) - minValue;
        }
    }

    private static int findMaxValue(int[] arr) {
        int max = arr[0];
        if (arr.length > 1) {
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i])
                    max = arr[i];
            }
        }
        return max;
    }

    private static int sumOfPositiveNumbers(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum = (n > 0) ? (sum + n) : sum;
        }
        return sum;
    }

    private static int amountOfNegativeNumbers(int[] arr) {
        int count = 0;
        for (int n : arr) {
            if (n < 0) count++;
        }
        return count;
    }

    private static String whatValuesThereAreMore(int[] arr, int amountOfNegativeNumbers) {
        if (arr.length - amountOfNegativeNumbers > amountOfNegativeNumbers)
            return "positive";
        else
            return "negative";
    }

}