package helperClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataReader {
    public static int readInt() throws IOException {
        System.out.print("Enter you Integer: ");
        return Integer.parseInt(
                new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

}
