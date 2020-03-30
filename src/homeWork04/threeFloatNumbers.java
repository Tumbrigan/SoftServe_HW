package homeWork04;

/*
read 3 float numbers and check: are they all belong to the range [-5,5]
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class threeFloatNumbers {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private static float readFloat() throws IOException {
        return Float.parseFloat(reader.readLine());
    }

    private static boolean checkRange(float f) {
        return f > -5 & f < 5;
    }

    public static void main(String[] args) throws IOException {
        float f1 = readFloat();
        float f2 = readFloat();
        float f3 = readFloat();

        System.out.println("float 1: " + checkRange(f1));
        System.out.println("float 2: " + checkRange(f2));
        System.out.println("float 3: " + checkRange(f3));
    }
}