package homeWork04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class threeFloatNumbers {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            float f1 = Float.parseFloat(reader.readLine());
            float f2 = Float.parseFloat(reader.readLine());
            float f3 = Float.parseFloat(reader.readLine());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
