package homeWork04;

/*
read 3 integer numbers and write max and min of them
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class threeIntegerNumbers {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private static int readInteger() throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    private static int maxInt(int ... ints) {
        int max = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] > max)
                max = ints[i];
        }
        return max;
    }

    private static int minInt(int ... ints) {
        int min = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] < min)
                min = ints[i];
        }
        return min;
    }

    public static void main(String[] args) throws IOException {
        int i1 = readInteger();
        int i2 = readInteger();
        int i3 = readInteger();

        System.out.println("Min int: " + minInt(i1, i2, i3));
        System.out.println("Max int: " + maxInt(i1, i2, i3));
    }
}
